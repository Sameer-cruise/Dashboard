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
	
	//var outmsg="Planned Dashboard Outage - 14th Feb,2019 13:00 UTC to 14th Feb,2019 14:30 UTC (90 mins outage)";
	//var outmsg="Planned Maintenix Outage 14th Oct,2019 10:30 UTC to 14th Oct,2019 16:00 UTC";
	var outmsg="Scheduled Outage For Maintenix - 10 July 14:00 UTC to 10 July 17:30 UTC (3.5 hrs outage)"
	var errVal="Problem Loading Data. If there is no planned outage, contact the support team.";

	
// gets the location and URL from configuration
	var restServiceRequest=config.restURL+config.location;
	console.log(restServiceRequest);
	
// request data from service

 dependencies.request(restServiceRequest,handleRequest);
	
function handleRequest(err, response,body) {
  if (err) 
  {
	 console.log("Wait for the board to start.");
		
		/*uncomment this and comment out the second one when no planned outage*/
	job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal});
		
	//  job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});
}
	//throw err
  else{
	  
	  try
	{
	obj = JSON.parse(body);
    console.log("Printing here:"+body);

	var locations=config.location;	
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
	
	dependencies.request(config.timeURL,handleTimes);	
	
	function handleTimes(err, response,body)
	{
		if(err) throw err
		console.log("The timing error is:"+err);
		//console.log(display[0]);
		times=body.split(",");
		
		/*uncomment this and comment out the second one when no planned outage*/
	job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, val1:times[0], val2:times[1],timezone:config.TZ});
		
	// job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, val1:times[0], val2:times[1],timezone:config.TZ,outage:outmsg});
	}
		 }
	 catch(e)
	 {
		         /*uncomment this and comment out the second one when no planned outage*/
		 job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal});
				
		  //job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});  //continue displaying the old view
	 }
}
}
};
