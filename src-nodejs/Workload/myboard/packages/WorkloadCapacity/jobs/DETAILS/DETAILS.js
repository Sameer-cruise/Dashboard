module.exports = {
	onRun: function (config, dependencies, jobCallback) {
		var obj;
		var display = [];
		//var outmsg="Planned Dashboard Outage - 19th Mar 12:00 UTC to 19th Mar 15:00 UTC (180 minute outage)";
		//var outmsg="Planned Maintenix Outage for SP3 - 21st May 1200 UTC to 21st May 1600 UTC";	
		//var errVal="Planned Outage to the dashboard. Refer to the banner for more details.";
		var outmsg = "";
		var restServiceRequest = config.restWPURL + config.locationWP;
		dependencies.request(restServiceRequest, handleRequest);
		function handleRequest(err, response, body) {
			if (err) {
				jobCallback(null, { obj: display, err: 1, msg: outmsg });
			}
			else {
				try {
					obj = JSON.parse(body);
					for (var i = 0; i < obj.length; i++) {
						display.push(obj[i]);
					}
					for (var i = 0; i < display.length; i++) {
					}
					/*uncomment this and comment out the second one when no planned outage*/
					jobCallback(null, { obj: display, timezone: config.TZWP, err: 0, msg: outmsg });
				}
				catch (e) {
					/*uncomment this and comment out the second one when no planned outage*/
					jobCallback(null, { obj: display, err: 1, msg: outmsg });
				}
			}
		}
	}
};