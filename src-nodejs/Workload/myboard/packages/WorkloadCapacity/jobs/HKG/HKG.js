module.exports = {
	onRun: function (config, dependencies, jobCallback) {
		var errVal = "Problem Loading " + config.location + " Data. If there is no planned outage, contact the support team.";
		var restServiceRequest = config.restURL + config.location;
		dependencies.request(restServiceRequest, handleRequest);
		function handleRequest(err, response, body) {
			if (err) {
				/*uncomment this and comment out the second one when no planned outage*/
				jobCallback(null, { err: 1, msg: errVal });
			}
			//throw err
			else {
				try {
					json = JSON.parse(body);
					var dates = [];
					var schedvalues = [];
					var t_schedvalues = [];
					var mouvalues = [];
					var remvalues = [];
					var exvalues = [];
					var cmplvalues = [];
					var overvalues = [];
					for (var i = 0; i < json.length; i++) {
						dates.push((json[i].wpStartDate).toUpperCase());
						t_schedvalues.push(json[i].schedHR);
						mouvalues.push(json[i].mouHR);
						cmplvalues.push(json[i].cmplHR);
						overvalues.push(json[i].overHR);
						if (((json[i].schedHR + json[i].cmplHR) - json[i].mouHR) > 0) {
							schedvalues.push(json[i].schedHR);
							exvalues.push(Math.round((json[i].schedHR + json[i].cmplHR) - json[i].mouHR));
							remvalues.push(0);
						}
						else {
							schedvalues.push(json[i].schedHR);
							remvalues.push(Math.round(json[i].mouHR - (json[i].schedHR + json[i].cmplHR)));
							exvalues.push(0);
						}
					}
					if (json.length == 3) {
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
					}
					if (json.length == 2) {
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
					}
					if (json.length == 1) {
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
					}
					if (json.length == 0) {
						t_schedvalues.push("NA");
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
						exvalues.push("NA");
						t_schedvalues.push("NA");
						t_schedvalues.push("NA");
						mouvalues.push("NA");
						mouvalues.push("NA");
						cmplvalues.push("NA");
						cmplvalues.push("NA");
						exvalues.push("NA");
						exvalues.push("NA");
					}
					var graphData = {
						Dates: dates,
						SchedValues: schedvalues,
						t_SchedValues: t_schedvalues,
						MOUValues: mouvalues,
						REMValues: remvalues,
						EXValues: exvalues,
						CMPLValues: cmplvalues,
						OVERValues: overvalues
					};
					jobCallback(null, { graphData: graphData, title: 'MEL Scheduled Hours', timezone: config.TZ, err: 0 });
				}
				catch (e) {
					/*uncomment this and comment out the second one when no planned outage*/
					jobCallback(null, { err: 1, msg: errVal });
					//job_callback(null, { obj:display, title:config.widgetTitle+" - "+config.port, msg:errVal,outage:outmsg});  //continue displaying the old view
				}
			}
		}
	}
};