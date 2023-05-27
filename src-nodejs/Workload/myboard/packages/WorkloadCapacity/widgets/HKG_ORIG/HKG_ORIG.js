widget = {
	
  onInit : function(el){ 
	  
	  
  },

  onData: function (el, data) {
  document.getElementById("t_sched_hkg").innerHTML = 'SCHED';
  document.getElementById("t_mou_hkg").innerHTML = 'BUILD TO';      
  document.getElementById("t_Comp_hkg").innerHTML ='CMPL';
  document.getElementById("t_Ex_hkg").innerHTML ='REM';
   document.getElementById("t_inc_hkg").innerHTML ='INCMPL';
      
  document.getElementById("t_schedHours_hkg").innerHTML =data.graphData.t_SchedValues[0];
  document.getElementById("t_mouHours_hkg").innerHTML =data.graphData.MOUValues[0];
  document.getElementById("t_cmplHours_hkg").innerHTML =data.graphData.CMPLValues[0];
  document.getElementById("t_exHours_hkg").innerHTML =data.graphData.REMValues[0];
   document.getElementById("t_hkg_today").innerHTML =data.graphData.Dates[0];
  document.getElementById("t_incmpl_hkg").innerHTML =data.graphData.OVERValues[0];
      
  document.getElementById("tm_schedHours_hkg").innerHTML =data.graphData.t_SchedValues[1];
  document.getElementById("tm_mouHours_hkg").innerHTML =data.graphData.MOUValues[1];
  document.getElementById("tm_cmplHours_hkg").innerHTML =data.graphData.CMPLValues[1];
  document.getElementById("tm_exHours_hkg").innerHTML =data.graphData.REMValues[1];
   document.getElementById("t_hkg_tomo").innerHTML =data.graphData.Dates[1];
  document.getElementById("tm_incmpl_hkg").innerHTML =data.graphData.OVERValues[1];
   /* if (data.title) {
     // $('h2', el).text(data.title);
    }
	if(data.timezone){
			$('#TimeZone',el).val(data.timezone);
	}*/
	     setInterval(function() {
var dt = new Date;
//get Timezone from variable
var tzone = data.timezone;
	$('#date_cd_hkg').text(" Time - " + moment.tz(dt,tzone).format('HH:mm:ss')+"L");
	$('#date_cd_utc_hkg').text(" UTC - " + moment(dt).utc().format('HH:mm:ss')+"Z");
}, 1000);
		var chartUpdateDiv = $("#charthkg");
		chartUpdateDiv.html("");
		
		var canvasElement = $('<canvas id = "canvashkg"/>')
		chartUpdateDiv.append(canvasElement);
      
    //---------------------------------------------------------------------------------------------------------------------------
		var originalLineDraw = Chart.controllers.line.prototype.draw;
		Chart.helpers.extend(Chart.controllers.line.prototype, {
  		draw: function() {
    	originalLineDraw.apply(this, arguments);

    	var chart = this.chart;
    	var ctx1 = chart.chart.ctx;
    	var xaxis = chart.scales['x-axis-0'];
    	var yaxis = chart.scales['y-axis-0'];
    	var limits = new Array();

    	var day1 = new Array();
    	day1["value"] = chart.config.data.day1;
    	day1["label"] = "day1";
    	day1["color"] = "red";
    	limits.push(day1);

    	var day2 = new Array();
    	day2["value"] = chart.config.data.day2;
    	day2["label"] = "day2";
    	day2["color"] = "red";
    	limits.push(day2);


    	for (var i = 0; i < limits.length; i++) {

      	//Refactor the value
      	limits[i].value = yaxis.getPixelForValue(limits[i].value, undefined);
      	ctx1.beginPath();
		if(i==1){
      	ctx1.moveTo(541, limits[i].value);
      	ctx1.lineTo(328, limits[i].value);
		  }
		if(i==0){
      	ctx1.moveTo(278, limits[i].value);
      	ctx1.lineTo(65, limits[i].value);
		  }
        ctx1.save();
		ctx1.setLineDash([15,5]);
		ctx1.strokeStyle = limits[i].color;
      	ctx1.stroke();
      	ctx1.restore();
    		}
  		}
	});
//------------------------------------------------------------------------------------------------------------------------------  
		
        var barChartData = {
            labels: data.graphData.Dates,
            datasets: [{
				type:'bar',
               label: 'Sched Hrs',
                backgroundColor: "rgba(100,100,100,1.0)",
                data: data.graphData.SchedValues,
                //borderColor: 'white',
                borderWidth: 2
            }, 
				{
					type:'bar',
                label: 'Cmpl Hrs',
				fill:false,
                backgroundColor: "rgba(0,255,0,0.8)",
                data: data.graphData.CMPLValues,
                //borderColor: 'white',
                borderWidth: 2
            },
			{
				type:'bar',
                label: 'Rem Hrs',
				fill:false,
                backgroundColor: "rgba(255,255,255,0.8)",
                data: data.graphData.REMValues,
                //borderColor: 'white',
                borderWidth: 2
            }, 
			{
				type:'bar',
                label: 'Incmpl Hrs',
				fill:false,
                backgroundColor: "rgba(255,165,0,0.8)",
                data: data.graphData.OVERValues,
                //borderColor: 'white',
                borderWidth: 2
            },
			{
				type:'line',
                label: 'BUILD TO Hrs',
				fill:false,
                backgroundColor: "rgba(255,51,51,0.4)",
                data: data.graphData.MOUValues,
                borderColor: 'transparent',
				//pointBorderColor: '#EC932F',
				borderWidth:3
            }],
            day1: data.graphData.MOUValues[0],
            day2: data.graphData.MOUValues[1]

        };
		
		//plot the chart
		

		var ctx = document.getElementById("canvashkg").getContext("2d");
            window.myBar = new Chart(ctx, {
				type: 'bar',
                data: barChartData,
                options: {
                    responsive: true,
					title:{
						display:true,
						position:'top',
						fontSize:35,
						text:"Auckland",
						fontFamily:"Helvetica, Verdana, Geneva, sans-serif",
						fontColor:"rgba(255, 255, 255, 0.8)"
					},
					scales:{
						yAxes:[{
							display:true,
							stacked: true,
							ticks:{
								suggestedMin:0,
								beginAtZero:true,
								fontSize:10,
								fontColor:"rgba(255, 255, 255, 0.8)",
								fontFamily:"Helvetica, Verdana, Geneva, sans-serif"
							},
							gridLines:{
								display:true,
								color:"rgba(255, 255, 255, 0.8)"
							}
						}],
						xAxes:[{
							display:false,
							stacked: true,
							ticks:{
								fontSize:20,
								fontColor:"rgba(255, 255, 255, 0.8)",
								fontFamily:"Helvetica, Verdana, Geneva, sans-serif"
							},
							gridLines:{
								display:false,
								color:"rgba(255, 255, 255, 0.8)"
							}
						}]
					},
					legend:{
						display:true,
						position:'top',
						labels:{
							fontSize:13,
							fontFamily:"Helvetica, Verdana, Geneva, sans-serif",
							fontColor:"rgba(255, 255, 255, 0.8)"
						}
					},
					tooltips:{
						mode:'label',
						titleFontSize:10,
						bodyFontSize:15,
						footerFontSize:10
					}					
                }
            });
	 
    
  }
};
