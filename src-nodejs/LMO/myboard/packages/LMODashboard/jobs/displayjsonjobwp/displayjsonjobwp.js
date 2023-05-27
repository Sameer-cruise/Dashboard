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

module.exports = function(config, dependencies, job_callback) {
	
	//var fs = require('fs');
	var request=require('request');

	var obj;
	var display = [];
	var len;
	
	//var outmsg="Maintenix V8 Upgrade Outage - May 20 15:30 to May 21 12:30 AEST"; 
	//var errVal="Planned Outage to the dashboard. Refer to the banner for more details.";
	var errVal="";
	
// gets the location and URL from configuration
	var restServiceRequest=config.restWPURL+config.locationWP;
	console.log(restServiceRequest);
	
// request data from service

 dependencies.request(restServiceRequest,handleRequest);
	
function handleRequest(err, response,body) {
  if (err) 
  {
	 console.log("Wait for the board to start.");
		
		/*uncomment this and comment out the second one when no planned outage*/
		job_callback(null, { obj:display, title:config.widgetTitleWP,msg:errVal});
		
	    //job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});
}
	//throw err
  else{
	  
	  try
	{
	obj = JSON.parse(body);
    console.log("Printing here:"+body);

	var locations=config.locationWP;	
// Read the file and send to the callback

// Write the callback function

    /*console.log("1."+display[0]);    
	console.log("2."+display[1]);
	*/
	
    var val1;
	var val2;
	var times=[];
    
    for (var i = 0;i < obj.length; i++) {
        display.push(obj[i]);
    }
	
	/*uncomment this and comment out the second one when no planned outage*/
		job_callback(null, { obj:display,title:config.widgetTitleWP, timezone:config.TZWP});
		console.log("the timezone rceived is:"+config.TZWP);
		
	   //job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, val1:times[0], val2:times[1],timezone:config.TZ,outage:outmsg});
	
	//dependencies.request(config.timeURL,handleTimes);	
}
	 catch(e)
	 {
		         /*uncomment this and comment out the second one when no planned outage*/
		  	   job_callback(null, { obj:display,title:config.widgetTitleWP,msg:errVal});
				
			//job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});  //continue displaying the old view
	 }
}
}
};
