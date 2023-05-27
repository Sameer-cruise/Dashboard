module.exports = {
	onRun: function (config, dependencies, jobCallback) {
		var errVal = "Problem Loading SAM Data. If there is no planned outage, contact the support team.";
		var restServiceRequest = config.restURL;
		dependencies.request(restServiceRequest, handleRequest);
		function handleRequest(err, response, body) {
			if (err) {
				jobCallback(null, { err: 1, msg: errVal });
			} else {
				try {
					json = JSON.parse(body);
					var customData = [];
					for (var i = 0; i < json.length; i++) {
						customData.push(json[i]);
					}
					var graphData = {
						CustomData: customData
					};
					jobCallback(null, {
						graphData: graphData,
						title: 'SAM ',
						timezone: config.TZ,
						err: 0
					});
				} catch (e) {
					/*uncomment this and comment out the second one when no planned outage*/
					jobCallback(null, { err: 1, msg: errVal });
					//job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});  //continue displaying the old view
				}
			}
		}
	}
};