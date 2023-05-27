module.exports = {
	onRun: function (config, dependencies, jobCallback) {
		var errVal = "Problem Loading SAM Data. If there is no planned outage, contact the support team.";
		dependencies.request(config.restURL, function (err, response, body) {
			if (err) {
				jobCallback(null, {
					err: 1,
					msg: errVal
				});
			} else {
				try {
					data = JSON.parse(body);
					jobCallback(null, {
						graphData: data,
						title: 'SAM ',
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
		});
	}
};