widget = {
	
  onInit : function(el){ 
	  
	  
  },

  onData: function (el, data) {
	  
	  if(data.err==0){
	
	$("#error").html("");
	$("#data").removeClass("hide");
	  
  document.getElementById("t_sched_lax").innerHTML = 'SCHED  ';
  document.getElementById("t_mou_lax").innerHTML = 'BUILD TO  ';      
  document.getElementById("t_Comp_lax").innerHTML ='CMPL  ';
  document.getElementById("t_Ex_lax").innerHTML ='REM  ';
  document.getElementById("t_inc_lax").innerHTML ='INCMPL';


document.getElementById("t_schedHours_lax").innerHTML =data.graphData.t_SchedValues[0];
  document.getElementById("t_mouHours_lax").innerHTML =data.graphData.MOUValues[0];
  document.getElementById("t_cmplHours_lax").innerHTML =data.graphData.CMPLValues[0];
  document.getElementById("t_exHours_lax").innerHTML =data.graphData.REMValues[0];
    document.getElementById("t_lax_today").innerHTML =data.graphData.Dates[0];
  document.getElementById("t_incmpl_lax").innerHTML =data.graphData.OVERValues[0];
	
      
 document.getElementById("tm_schedHours_lax").innerHTML =data.graphData.t_SchedValues[1];
  document.getElementById("tm_mouHours_lax").innerHTML =data.graphData.MOUValues[1];
  document.getElementById("tm_cmplHours_lax").innerHTML =data.graphData.CMPLValues[1];
  document.getElementById("tm_exHours_lax").innerHTML =data.graphData.REMValues[1];
    document.getElementById("tm_lax_today").innerHTML =data.graphData.Dates[1];
  document.getElementById("tm_incmpl_lax").innerHTML =data.graphData.OVERValues[1];
      
   document.getElementById("d1_schedHours_lax").innerHTML =data.graphData.t_SchedValues[2];
   document.getElementById("d1_cmplHours_lax").innerHTML =data.graphData.CMPLValues[2];
   document.getElementById("d1_mouHours_lax").innerHTML =data.graphData.MOUValues[2];
   document.getElementById("d1_exHours_lax").innerHTML =data.graphData.REMValues[2];
     document.getElementById("d1_lax_today").innerHTML =data.graphData.Dates[2];
  document.getElementById("d1_incmpl_lax").innerHTML =data.graphData.OVERValues[2];
     
  document.getElementById("d2_schedHours_lax").innerHTML =data.graphData.t_SchedValues[3];
   document.getElementById("d2_cmplHours_lax").innerHTML =data.graphData.CMPLValues[3];
   document.getElementById("d2_mouHours_lax").innerHTML =data.graphData.MOUValues[3];
   document.getElementById("d2_exHours_lax").innerHTML =data.graphData.REMValues[3];
     document.getElementById("d2_lax_today").innerHTML =data.graphData.Dates[3];
  document.getElementById("d2_incmpl_lax").innerHTML =data.graphData.OVERValues[3];
   
      setInterval(function() {
var dt = new Date;
//get Timezone from variable
var tzone = data.timezone;
	$('#date_cd_lax').text(" Time - " + moment.tz(dt,tzone).format('HH:mm:ss')+"L");
	/*$('#date_cd_utc_adl').text(" UTC - " + moment(dt).utc().format('HH:mm:ss')+"Z");*/
}, 1000);
   
   /* if (data.title) {
     // $('h2', el).text(data.title);
    }*/
	/*if(data.timezone){
			$('#TimeZone',el).val(data.timezone);
	}*/
		var chartUpdateDiv = $("#chart");
		chartUpdateDiv.html("");
		
		var canvasElement = $('<canvas id = "canvas"/>')
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

    	var day3 = new Array();
    	day3["value"] = chart.config.data.day3;
    	day3["label"] = "day3";
    	day3["color"] = "red";
    	limits.push(day3);

		var day4 = new Array();
    	day4["value"] = chart.config.data.day4;
    	day4["label"] = "day4";
    	day4["color"] = "red";
    	limits.push(day4);


    	for (var i = 0; i < limits.length; i++) {

      	//Refactor the value
      	limits[i].value = yaxis.getPixelForValue(limits[i].value, undefined);
      	ctx1.beginPath();
		if(i==3){
      	ctx1.moveTo(790, limits[i].value);
      	ctx1.lineTo(640, limits[i].value);
		  }
		if(i==2){
      	ctx1.moveTo(610, limits[i].value);
      	ctx1.lineTo(460, limits[i].value);
		  }
		if(i==1){
      	ctx1.moveTo(430, limits[i].value);
      	ctx1.lineTo(280, limits[i].value);
		  }
		if(i==0){
      	ctx1.moveTo(240, limits[i].value);
      	ctx1.lineTo(90, limits[i].value);
		  }
        ctx1.save();
		ctx1.setLineDash([30,8]);
		ctx1.lineWidth=8;
		ctx1.strokeStyle = limits[i].color;
      	ctx1.stroke();
      	ctx1.restore();
    		}
  		}
	});
//------------------------------------------------------------------------------------------------------------------------------
		
        var barChartData = {
            labels: data.graphData.Dates,
           // labels: ['Today','Tomorrow'],
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
				borderWidth:3,
			}],
                day1: data.graphData.MOUValues[0],
    			day2: data.graphData.MOUValues[1],
    			day3: data.graphData.MOUValues[2],
				day4: data.graphData.MOUValues[3]

        };
	
		
		//plot the chart
		

		var ctx = document.getElementById("canvas").getContext("2d");
            window.myBar = new Chart(ctx, {
				type: 'bar',
                data: barChartData,
                options: {
                    responsive: true,
					title:{
						display:true,
						position:'top',
						fontSize:35,
						text:"Los Angeles",
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
								fontSize:20,
								fontColor:"rgba(255, 255, 255, 0.8)",
								fontFamily:"Helvetica, Verdana, Geneva, sans-serif"
							},
							gridLines:{
								display:true,
								color:"rgba(255, 255, 255, 0.8)"
							}
						}],
						xAxes:[{
							display:true,
							stacked: true,
							ticks:{
								fontSize:22,
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
							fontSize:18,
							fontFamily:"Helvetica, Verdana, Geneva, sans-serif",
							fontColor:"rgba(255, 255, 255, 0.8)",
						}
					},
					tooltips:{
						mode:'label',
						titleFontSize:20,
						bodyFontSize:20,
						footerFontSize:20
					}					
                }
            });
  }
  else{
//remove the chart	
$("#chart").html("");
//remove the summary
$("#data").addClass("hide");
$("#error").html("");
	$('#error',el).append(data.msg);
  }	 
    
  }
};


