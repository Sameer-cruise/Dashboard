/**
 * Job: displayjsonjob
 *
 * Expected configuration:
 *
 * ## PLEASE ADD AN EXAMPLE CONFIGURATION FOR YOUR JOB HERE
 * { 
 *   myconfigKey : [ 
 *     { serverUrl : 'localhost' } 
 *   ]
 * }
 */

module.exports = function(config, dependencies, job_callbackAPU) {
	
	//console.log('Hello');
	
	//var fs = require('fs');
	//var request=require('request');
	//require('ssl-root-cas').inject();

	var obj;
	var displayAPU = [];
	var len;
	
	//var outmsg="Maintenix V8 Upgrade Outage - May 20 15:30 to May 21 12:30 AEST"; 
	//var errVal="Planned Outage to the dashboard. Refer to the banner for more details.";
	var errVal="";
	//require('ssl-root-cas').inject();
	
	
	/*
		var axios=require('axios');
		// Add a request interceptor 
	axios.interceptors.request.use(function (config) {
    // Do something before request is sent 
		console.log("request object :",config)
		//config.maxContentLength=500;
		config.rejectUnauthorized=false;
    return config;
	}, function (error) {
    // Do something with request error 
		console.log("request error :",error)
	});
 
	// Add a response interceptor 
	axios.interceptors.response.use(function (response) {
    // Do something with response data 
		console.log("response object :",response)
    return response;
	}, function (error) {
		console.log("response error :",error)
    // Do something with response error 
	//response.config.maxContentLength=500;
    //console.log("2 :", Promise.reject(error));
	});
  

	axios({
		        url: "https://api-stg.qantas.com.au/employee/apualerts/v1/transits/MEL",
		        method: 'get',
		        //data:dataParams,
		        headers: {
					"Content-Type": 'application/json',
					//"user_key": "83f53bc858ccf9b37c5d13b96dbe413d",
					"Authorization": "Basic ODNmNTNiYzg1OGNjZjliMzdjNWQxM2I5NmRiZTQxM2Q="
				}
		    }).then(function (successData) {
		        console.log(successData);						
		    }).catch(function (errorData) {
				console.log(errorData);	    	
		    });
	
	*/
	
// gets the location and URL from configuration
	var restServiceRequest= { 	rejectUnauthorized: false , 
								url : config.restAPUURL+config.locationAPU + '?alert=ON', 
								headers : 	{
											"Content-Type":"application/json",
											"Authorization": "Basic MWZhZDViYjI1NDExNzFjZTVhZGRkNTYyNzZjNDJiY2U=",											
											"Connection":"keep-alive"
									        }
							};
	//console.log("request : ",restServiceRequest);
	
// request data from service

	


 //handleRequest();
 dependencies.request(restServiceRequest,handleRequest);
 
 
 
function handleRequest(err, response,body) {
	
	
	displayAPU={dataStatus : "E",loc : config.locationAPU};
	if (err) {
		job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU, timezone:config.TZAPU});
	}
	else{
		try{
			
		obj = JSON.parse(body); //obj = body ;//
		console.log('obj',obj);
		
		if(obj.errorCode){
			if(obj.errorCode==="APU0003"){
				displayAPU={dataStatus : "N",loc : config.locationAPU};
				job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU, timezone:config.TZAPU});
			}
			else{
				displayAPU={dataStatus : "E",loc : config.locationAPU};
				job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU, timezone:config.TZAPU});
			}
		}
		else if(obj.error){
			displayAPU={dataStatus : "E",loc : config.locationAPU};
			job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU, timezone:config.TZAPU});
		}
		else{
			displayAPU=[];
			if(obj.length===0){	
				displayAPU={dataStatus : "N",loc : config.locationAPU}
			}
			else{
				displayAPU={dataStatus : "Y",loc : config.locationAPU,alertData:[]};
			}
		
			for (var i = 0;i < obj.length; i++) {
				displayAPU.alertData.push(obj[i]);
			}
			job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU, timezone:config.TZAPU});
			}
		}
		catch(e){
			job_callbackAPU(null, { obj:displayAPU,title:config.widgetTitleAPU,msg:errVal});
		}
	}
}
};
