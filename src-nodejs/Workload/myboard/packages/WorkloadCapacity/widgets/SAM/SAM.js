widget = {
	onInit: function () { },
	onData: function (el, data) {
		if (data.err == 0) {
			var wpData = data.graphData;
			var months = {
				'JAN': 0,
				'FEB': 1,
				'MAR': 2,
				'APR': 3,
				'MAY': 4,
				'JUN': 5,
				'JUL': 6,
				'AUG': 7,
				'SEP': 8,
				'OCT': 9,
				'NOV': 10,
				'DEC': 11
			}

			// Filter Data to forecast for 5 days
			wpData = wpData
				.filter(function (r) {
					var dateValue = r.dateValue.split('-');
					var wpDate = new Date('20' + dateValue[2], months[dateValue[1]], dateValue[0]);
					var forecastDate = new Date();
					forecastDate.setDate(forecastDate.getDate() + 4);
					forecastDate.setHours(0);
					forecastDate.setMinutes(0);
					forecastDate.setSeconds(0);
					return wpDate.getTime() <= forecastDate.getTime()
				});
				

			$("#error").html("");
			$("#samTableDiv").removeClass("hide");
			$("#boxes").removeClass("hide");
			setInterval(function () {
				var dt = new Date;
				var tzone = data.timezone;
				$('#date_cd_a_chk').text("Time : " + moment.tz(dt, tzone).format('HH:mm:ss') + "L");
				$('#date_cd_utc_a_chk').text(" UTC : " + moment(dt).utc().format('HH:mm:ss') + "Z");
			}, 1000);

			var assembly = [];
			var days = [];
			var checkGroup = [];
			var schedHours = [];
			var mouHours = [];
			var cmplHours = [];

			var colorSched = [];
			var colorMou = [];
			var colorCmpl = [];

			var borderColorSched = [];
			var borderColorMOU = [];
			var borderColorCmpl = [];

			var daygrp = [];
			var mous = [];
			var variances = [];

			for (var i = 0; i < wpData.length; i++) {
				assembly.push(wpData[i].assembly);
				checkGroup.push(wpData[i].checkGroup);
				days.push(wpData[i].dayOfWeek);
				variance = wpData[i].schedHR - wpData[i].cmplHR - wpData[i].mouHR;
				variances.push(wpData[i].dayOfWeek + "~" + variance.toFixed(1));
				mous.push(wpData[i].dayOfWeek + "~" + wpData[i].mouHR.toFixed(1));
				daygrp.push(wpData[i].dayOfWeek + '~' + wpData[i].checkGroup);
				if (wpData[i].overHR > wpData[i].mouHR) {
					//The hours have to begin from the bottom as stacking has been used  
					//If SchedHrs> mouHR, means MOU starts at bottom and remaining hours get stacked
					//In the graph, stacking starts with schedHR, that is why the below logic is used
					if (wpData[i].schedHR < wpData[i].mouHR) {
						schedHours.push(wpData[i].schedHR);
						cmplHours.push(wpData[i].mouHR - wpData[i].schedHR);
						mouHours.push(wpData[i].cmplHR - (wpData[i].mouHR - wpData[i].schedHR));
						colorSched.push('#FF8C00');
						colorMou.push('green');
						colorCmpl.push('green')
						borderColorSched.push('#DCDCDC');
						borderColorMOU.push('black');
						borderColorCmpl.push('#DCDCDC');
					} else {
						schedHours.push(wpData[i].mouHR);
						mouHours.push(wpData[i].cmplHR);
						cmplHours.push(wpData[i].schedHR - wpData[i].mouHR);
						colorSched.push('#FF8C00');
						colorMou.push('green');
						colorCmpl.push('#FF8C00');
						borderColorSched.push('#DCDCDC');
						borderColorMOU.push('black');
						borderColorCmpl.push('transparent');
					}
				} else {
					schedHours.push(wpData[i].schedHR);
					cmplHours.push(wpData[i].cmplHR);
					mouHours.push(wpData[i].mouHR - wpData[i].overHR);
					colorSched.push('#FF8C00');
					colorMou.push('#DCDCDC');
					colorCmpl.push('green');
					borderColorSched.push('#DCDCDC');
					borderColorMOU.push('#DCDCDC');
					borderColorCmpl.push('#DCDCDC');
				}
			}

			var uniqueAssy = [];
			$.each(assembly, function (i, el) {
				if ($.inArray(el, uniqueAssy) === -1) uniqueAssy.push(el);
			});

			var uniquedays = [];
			$.each(days, function (i, el) {
				if ($.inArray(el, uniquedays) === -1) uniquedays.push(el);
			});

			var uniquegrp = [];
			$.each(daygrp, function (i, el) {
				if ($.inArray(el, uniquegrp) === -1) uniquegrp.push(el);
			});

			var table = document.getElementById("samTable");
			table.innerHTML = ''
			var daysRow = table.insertRow(0);
			var checkGroupRow = table.insertRow(1);
			var assembliesRow = table.insertRow(2);
			var schedHoursRow = table.insertRow(3);
			var complHoursRow = table.insertRow(4);
			var mouHoursRow = table.insertRow(5);
			var varianceRow = table.insertRow(6);

			for (var i = 0; i < wpData.length; i++) {
				var assemblyCell = assembliesRow.insertCell(i);
				assemblyCell.innerHTML = wpData[i].assembly;
				assemblyCell.className = 'cellStyle';

				var schedHoursCell = schedHoursRow.insertCell(i);
				schedHoursCell.innerHTML = wpData[i].schedHR.toFixed(1);
				schedHoursCell.className = 'cellStyleSched';

				var complHoursCell = complHoursRow.insertCell(i);
				complHoursCell.innerHTML = wpData[i].cmplHR.toFixed(1);
				complHoursCell.className = 'cellStyleCmpl';

				var mouHoursCell = mouHoursRow.insertCell(i);
				mouHoursCell.innerHTML = wpData[i].mouHR;
				mouHoursCell.className = 'cellStyle';
			}

			for (var i = 0; i < uniquedays.length; i++) {
				var dayCell = daysRow.insertCell(i);
				var dayDate = wpData.filter(function (r) {
					return r.dayOfWeek === uniquedays[i]
				})[0].dateValue;
				var dayWeek = wpData.filter(function (r) {
					return r.dayOfWeek === uniquedays[i]
				})[0].dayOfWeek;
				var dayMou = 0;
				for (var j = 0; j < mous.length; j++) {
					if (mous[j].substring(0, mous[j].search("~")) === uniquedays[i]) {
						dayMou += parseFloat(mous[j].substring(mous[j].search("~") + 1));
					}
				}


				var link = "<a class='day_detail' href=/SIM_DETAIL?dayOfWeek=" + dayWeek + "&mouHours=" + dayMou + ">" + dayDate + " " + dayWeek + "</a>"
				dayCell.colSpan = wpData.filter(function (r) {
					return r.dayOfWeek === uniquedays[i]
				}).length;
				dayCell.innerHTML = link;
				dayCell.className = 'dayCellStyle';

				var varianceSum = 0;
				for (var j = 0; j < variances.length; j++) {
					if (variances[j].substring(0, variances[j].search("~")) === uniquedays[i]) {
						varianceSum = parseFloat(variances[j].substring(variances[j].search("~") + 1)) + parseFloat(varianceSum);
					}
				}

				var varianceCell = varianceRow.insertCell(i);
				varianceCell.colSpan = wpData.filter(function (r) {
					return r.dayOfWeek === uniquedays[i]
				}).length;
				varianceCell.innerHTML = varianceSum.toFixed(1);

				if (varianceCell.innerHTML > 0) {
					varianceCell.className = 'cellStyleRed';
				} else
					varianceCell.className = 'cellStyleGreen';
			}

			for (var i = 0; i < uniquegrp.length; i++) {
				var checkGroupCell = checkGroupRow.insertCell(i);
				checkGroupCell.colSpan = wpData.filter(function (r) {
					return r.dayOfWeek === uniquegrp[i].substring(0, uniquegrp[i].search("~")) && r.checkGroup === uniquegrp[i].substring(uniquegrp[i].search("~") + 1)
				}).length;
				checkGroupCell.innerHTML = uniquegrp[i].substring(uniquegrp[i].search("~") + 1);
				if (checkGroupCell.innerHTML == 'ACHK') {
					checkGroupCell.className = 'cellStyleachk';
				} else if (checkGroupCell.innerHTML == 'NGT') {
					checkGroupCell.className = 'cellStylengt';
				} else if (checkGroupCell.innerHTML == 'DAY') {
					checkGroupCell.className = 'cellStyleday';
				}
			}


			// Table 2
			var table2 = document.getElementById("dispTable");
			table2.innerHTML = ''
			var row11 = table2.insertRow(0);
			var row21 = table2.insertRow(1);
			var row31 = table2.insertRow(2);
			var row41 = table2.insertRow(3);
			var row51 = table2.insertRow(4);
			var row61 = table2.insertRow(5);
			var row71 = table2.insertRow(6);

			var cellassm = row11.insertCell(0);
			cellassm.innerHTML = "DAY";
			cellassm.className = 'dayCellStyle';
			var cellday = row21.insertCell(0);
			cellday.innerHTML = "CHK";
			cellday.className = 'cellStyle2';
			var cellgrp = row31.insertCell(0);
			cellgrp.innerHTML = "ASSM";
			cellgrp.className = 'cellStyle2';
			var cellsched = row41.insertCell(0);
			cellsched.innerHTML = "SCHED";
			cellsched.className = 'cellStyle2';
			var cellmou = row51.insertCell(0);
			cellmou.innerHTML = "CMPL";
			cellmou.className = 'cellStyle2';
			var cellvar = row61.insertCell(0);
			cellvar.innerHTML = "BUILD TO";
			cellvar.className = 'cellStyle2';
			var cellvar = row71.insertCell(0);
			cellvar.innerHTML = "VAR";
			cellvar.className = 'cellStyle2';


			var chartUpdateDiv = $("#samChart");
			chartUpdateDiv.html("");
			var canvasElement = $('<canvas id = "samCanvas"/>')
			chartUpdateDiv.append(canvasElement);

			var barChartData = {
				labels: assembly,
				datasets: [{
					label: 'SCHED HRS',
					fill: true,
					backgroundColor: colorSched,
					data: schedHours,
					borderWidth: 4,
					borderColor: borderColorSched
				}, {
					label: 'CMPL HRS',
					fill: true,
					backgroundColor: colorCmpl,
					data: cmplHours,
					borderWidth: 4,
					borderColor: borderColorCmpl
				}, {
					label: 'BUILD TO  HRS',
					fill: true,
					backgroundColor: colorMou,
					data: mouHours,
					type: 'bar',
					borderWidth: 2,
					borderColor: borderColorMOU
				}]
			};

			var ctx = document.getElementById("samCanvas").getContext("2d");
			window.myBar = new Chart(ctx, {
				type: 'bar',
				data: barChartData,
				options: {
					responsive: true,
					title: {
						display: true,
						position: 'top',
						fontSize: 40,
						text: "Sydney Line Maintenance",
						fontFamily: "Helvetica, Verdana, Geneva, sans-serif",
						fontColor: "rgba(255, 255, 255, 0.8)"
					},
					scales: {
						yAxes: [{
							display: true,
							stacked: true,
							ticks: {
								suggestedMin: 0,
								beginAtZero: true,
								fontSize: 26,
								fontColor: "rgba(255, 255, 255, 0.8)",
								fontFamily: "Helvetica, Verdana, Geneva, sans-serif"
							},
							gridLines: {
								display: true,
								color: "rgba(255, 255, 255, 0.8)"
							}
						}],
						xAxes: [{
							display: false,
							stacked: true,
							categoryPercentage: 0.5,
							ticks: {
								fontSize: 22,
								fontColor: "rgba(255, 255, 255, 0.8)",
								fontFamily: "Helvetica, Verdana, Geneva, sans-serif"
							},
							gridLines: {
								display: false,
								color: "rgba(255, 255, 255, 0.8)"
							}
						}]
					},
					legend: {
						display: false,
						position: 'top',
						labels: {
							fontSize: 18,
							fontFamily: "Helvetica, Verdana, Geneva, sans-serif",
							fontColor: "rgba(255, 255, 255, 0.8)"
						}
					},
					tooltips: {
						mode: 'label',
						enabled: false,
						titleFontSize: 20,
						bodyFontSize: 20,
						footerFontSize: 20
					}
				}
			});
		} else {
			$("#samChart").html("");
			$("#samTableDiv").addClass("hide");
			$("#boxes").addClass("hide");
			$("#error").html("");
			$('#error', el).append(data.msg);
		}
	}
};