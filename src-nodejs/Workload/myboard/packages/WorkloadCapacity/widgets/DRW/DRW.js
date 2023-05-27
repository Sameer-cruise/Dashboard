widget = {
	onInit: function (el) {},
	onData: function (el, data) {
		var wpLocation = data.locationName;
		var summaryElement = $("#summary_DRW");
		var errorElement = $("#error_DRW");
		var timeElement = $("#time_DRW");
		var chartElement = $("#chart_DRW");
		chartElement.html("");
		chartElement.append($('<canvas id="canvas_DRW" class="canvas"/>'));
		var canvasElement = document.getElementById("canvas_DRW");
		var table1 = document.getElementById("table1_DRW");
		var table2 = document.getElementById("table2_DRW");
		table1.innerHTML = ''
		table2.innerHTML = ''

		if (data.err == 0) {
			errorElement.html("");
			summaryElement.removeClass("hide");
			setInterval(function () {
				var dt = new Date;
				var tzone = data.timezone;
				timeElement.text("Time - " + moment.tz(dt, tzone).format('HH:mm:ss') + "L");
			}, 1000);

			var row11 = table1.insertRow(0);
			var row21 = table1.insertRow(1);
			var row31 = table1.insertRow(2);
			var row41 = table1.insertRow(3);
			var row51 = table1.insertRow(4);
			var row61 = table1.insertRow(5);
			var row71 = table1.insertRow(6);

			var cell11 = row11.insertCell(0);
			cell11.innerHTML = "&nbsp";
			var cell21 = row21.insertCell(0);
			cell21.innerHTML = "&nbsp";
			var cell31 = row31.insertCell(0);
			cell31.innerHTML = "SCHED";
			var cell41 = row41.insertCell(0);
			cell41.innerHTML = "BUILD TO";
			var cell51 = row51.insertCell(0);
			cell51.innerHTML = "CMPL";
			var cell61 = row61.insertCell(0);
			cell61.innerHTML = "REM";

			var wpData = data.graphData;
			var dates = wpData.Dates;
			var slots = wpData.Slots;
			var schedHours = wpData.SchedValues;
			var mouHours = wpData.MOUValues;
			var cmplHours = wpData.CMPLValues;
			var remHours = wpData.REMValues;
			var overHours = wpData.OVERValues;
			var uniqueDates = []

			var dateSlots = [];
			for (var i = 0; i < dates.length; i++) {
				dateSlots.push(dates[i] + ' - ' + slots[i])
			}

			$.each(dates, function (i, date) {
				if ($.inArray(date, uniqueDates) === -1) uniqueDates.push(date);
			});

			var slotsRow = table2.insertRow(0);
			var datesRow = table2.insertRow(1);
			var schedRow = table2.insertRow(2);
			var mouRow = table2.insertRow(3);
			var cmplRow = table2.insertRow(4);
			var remRow = table2.insertRow(5);

			for (var i = 0; i < slots.length; i++) {
				var cell = slotsRow.insertCell(i);
				cell.innerHTML = slots[i]
			}
			for (var i = 0; i < uniqueDates.length; i++) {
				var cell = datesRow.insertCell(i);
				cell.innerHTML = uniqueDates[i]
				cell.colSpan = dates.filter(function (date) {
					return date === uniqueDates[i]
				}).length;
			}
			for (var i = 0; i < schedHours.length; i++) {
				var cell = schedRow.insertCell(i);
				cell.innerHTML = schedHours[i]
			}
			for (var i = 0; i < mouHours.length; i++) {
				var cell = mouRow.insertCell(i);
				cell.innerHTML = mouHours[i]
			}
			for (var i = 0; i < cmplHours.length; i++) {
				var cell = cmplRow.insertCell(i);
				cell.innerHTML = cmplHours[i]
			}
			for (var i = 0; i < remHours.length; i++) {
				var cell = remRow.insertCell(i);
				cell.innerHTML = remHours[i]
			}

			var originalLineDraw = Chart.controllers.line.prototype.draw;
			Chart.helpers.extend(Chart.controllers.line.prototype, {
				draw: function () {
					originalLineDraw.apply(this, arguments);
					var data = this.chart.config.data.datasets.filter(function (d) {
						return d.type === 'line'
					})[0].metaData
					for (var i = 0; i < data.length; i++) {
						var ctx = this.chart.chart.ctx;
						ctx.save();
						ctx.strokeStyle = 'red';
						ctx.setLineDash([15, 4]);
						ctx.beginPath();
						ctx.lineWidth = 5;
						if (i === 0) {
							ctx.moveTo(data[i]._view.x - (data[i]._view.controlPointNextX - data[i]._view.controlPointPreviousX), data[i]._view.y);
							ctx.lineTo(data[i]._view.controlPointNextX, data[i]._view.y);
						} else if (i === data.length - 1) {
							ctx.moveTo(data[i]._view.controlPointPreviousX, data[i]._view.y);
							ctx.lineTo(data[i]._view.controlPointNextX + (data[i]._view.controlPointNextX - data[i]._view.controlPointPreviousX), data[i]._view.y);
						} else {
							ctx.moveTo(data[i]._view.controlPointPreviousX, data[i]._view.y);
							ctx.lineTo(data[i]._view.controlPointNextX, data[i]._view.y);
						}
						ctx.stroke();
						ctx.restore();
					}
				}
			});

			var barChartData = {
				labels: dateSlots,
				datasets: [{
						type: 'bar',
						label: 'Sched Hrs Day',
						backgroundColor: ['rgba(100,100,100,1.0)','rgba(84, 120, 228, 1)','rgba(100,100,100,1.0)','rgba(84, 120, 228, 1)','rgba(100,100,100,1.0)','rgba(84, 120, 228, 1)'],
						data: schedHours,
						borderWidth: 2
					},
					{
						type: 'bar',
						label: 'Sched Hrs Night',
						backgroundColor: 'rgba(84, 120, 228, 1)',  
						data: schedHours,
						borderWidth: 0,
						hidden: true
					},
					{
						type: 'bar',
						label: 'Cmpl Hrs',
						fill: false,
						backgroundColor: 'rgba(0,255,0,0.8)',
						data: cmplHours,
						borderWidth: 2
					},
					{
						type: 'bar',
						label: 'Rem Hrs',
						fill: false,
						backgroundColor: 'rgba(255,255,255,0.8)',
						data: remHours,
						borderWidth: 2
					},
					{
						type: 'bar',
						label: 'Incmpl Hrs',
						fill: false,
						backgroundColor: 'rgba(255,165,0,0.8)',
						data: overHours,
						borderWidth: 2
					},
					{
						type: 'line',
						label: 'BUILD TO Hrs',
						fill: false,
						backgroundColor: 'red',
						data: mouHours,
						borderColor: 'transparent',
						borderWidth: 3,
					}
				]
			};

			var ctx = canvasElement.getContext("2d");
			window.myBar = new Chart(ctx, {
				type: 'bar',
				data: barChartData,
				options: {
					responsive: true,
					title: {
						display: true,
						position: 'top',
						fontSize: 35,
						text: wpLocation,
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
								fontSize: 16,
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
							ticks: {
								fontSize: 13,
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
						display: true,
						position: 'top',
						labels: {
							fontSize: 18,
							fontFamily: "Helvetica, Verdana, Geneva, sans-serif",
							fontColor: "rgba(255, 255, 255, 0.8)",
						}
					},
					tooltips: {
						mode: 'label',
						titleFontSize: 20,
						bodyFontSize: 20,
						footerFontSize: 20
					}
				}
			});
		} else {
			timeElement.addClass("hide");
			chartElement.html("");
			summaryElement.addClass("hide");
			errorElement.html("");
			$('#error_DRW', el).append(data.msg);
		}
	}
};