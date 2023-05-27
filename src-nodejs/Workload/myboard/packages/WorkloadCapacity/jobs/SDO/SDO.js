module.exports = {
	onRun: function (config, dependencies, jobCallback) {
		var errVal = "Problem Loading " + config.location + " Data. If there is no planned outage, contact the support team.";
		var restServiceRequest = config.restURL + config.location;
		dependencies.request(restServiceRequest, handleRequest);

		function handleRequest(err, response, body) {
			if (err) {
				jobCallback(null, {
					err: 1,
					msg: errVal
				});
			} else {
				try {
					json = JSON.parse(body);
					var dates = [];
					var slots = [];
					var schedvalues = [];
					var mouvalues = [];
					var remvalues = [];
					var exvalues = [];
					var cmplvalues = [];
					var overvalues = [];
					for (var i = 0; i < json.length; i++) {
						dates.push((json[i].wpStartDate).toUpperCase());
						slots.push(json[i].slot);
						schedvalues.push(json[i].schedHR);
						mouvalues.push(json[i].mouHR);
						cmplvalues.push(json[i].cmplHR);
						overvalues.push(json[i].overHR);
						if (((json[i].schedHR + json[i].cmplHR) - json[i].mouHR) > 0) {
							exvalues.push(Math.round((json[i].schedHR + json[i].cmplHR) - json[i].mouHR));
							remvalues.push(0);
						} else {
							remvalues.push(Math.round(json[i].mouHR - (json[i].schedHR + json[i].cmplHR)));
							exvalues.push(0);
						}
					}
					var graphData = {
						Dates: dates,
						Slots: slots,
						SchedValues: schedvalues,
						MOUValues: mouvalues,
						REMValues: remvalues,
						EXValues: exvalues,
						CMPLValues: cmplvalues,
						OVERValues: overvalues
					};
					jobCallback(null, {
						locationName: config.locationName,
						graphData: graphData,
						timezone: config.TZ,
						err: 0
					});
				} catch (e) {
					jobCallback(null, {
						err: 1,
						msg: errVal
					});
				}
			}

		}
	}
};