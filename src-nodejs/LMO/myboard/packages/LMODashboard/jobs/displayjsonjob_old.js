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

	
// gets the location and URL from configuration
	var restServiceRequest=config.restURL+config.location;
	console.log(restServiceRequest);
	
// request data from service

 dependencies.request(restServiceRequest,handleRequest);
	
function handleRequest(err, response,body) {
  if (err) throw err
obj = JSON.parse(body)
    console.log("Printing here:"+body)

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
	
	dependencies.request('http://localhost:5000/Dashboard/LMODashboard/Timings',handleTimes);	
	
	function handleTimes(err, response,body)
	{
		if(err) throw err
		//console.log(display[0]);
		times=body.split(",");
		
	    job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, val1:times[0], val2:times[1],timezone:config.TZ});
	}
}
};
