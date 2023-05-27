widget = {
    //runs when we receive data from the job
    
	onData: function(el, data) {

        //The parameters our job passed through are in the data object
        //el is our widget element, so our actions should all be relative to that
        // if(data.eLogBookCap==1){
        // 	$('elogcap', el).css('color', 'red');
        // }
        if (data.title) {
            $('.head', el).text(data.title);
        }
		if(data.timezone){
			$('#TimeZone',el).val(data.timezone);
		}
		
		if(data.outage)
		{
			$('.outage_banner', el).text(data.outage);
			$('.outage_banner', el).val(data.outage);
			$('.outage_banner', el).css('margin','-4px');  //Dynamic css to adjust the banner
			
		}
		
		if(data.val1)
		{
			$("#lastrefresh").html("");
			$("#lastrefresh").css('text-align','right');
			$('#lastrefresh',el).append(data.val1);
		}
		
		if(data.val2)
		{
			$("#nextrefresh").html("");
			$("#nextrefresh",el).append(data.val2);
		}
		
		$(".error").html("");
		
		if(data.msg)
		{
			$('.error',el).append(data.msg);
			$('.error',el).val(data.msg);
		}	
			else{
				$('.error',el).val("");   //Clears the error value
			}
		
		//clear the html from previous job
		$("#flighttable > tbody").html("");
		$(".pager").remove();
		//add table rows now
		
		
		var browser=isIE();

		if(browser=="BROWSER" || browser>9)
		{
		
				data.obj.forEach(function(quote) {
				var dt = new Date;
				var tzone = data.timezone;
				var utcdt = moment(dt).utc();
				var mom = moment.tz(utcdt,tzone);				
				var deptdt=moment.tz(quote.DEP_TIME,'DD-MMM-YY HH:mm:SS',tzone);							
				//var deptdt=moment.tz(quote.DEP_TIME,'DD-MMM HH:mm',tzone);							
				var arrdt=moment.tz(quote.ARR_TIME,'DD-MMM-YY HH:mm:SS',tzone);
				var hours=deptdt.diff(mom,'hours');
				var minutes=deptdt.diff(mom,'minutes');	
				var deptime=deptdt.format("DD-MMM HH:mm").toUpperCase();
				var arrtime=arrdt.format("DD-MMM HH:mm").toUpperCase();
				let styleString = "";
				console.log(quote)
		if (quote.ElogBookCap === "1") {
                    
                    styleString = " style=\"color: red;font-weight: bold\"";
				}
                
				//if(hours==0 && (minutes>=5 && minutes<=15) && quote.WP_STATUS=="IN WORK")	
if(hours==0 && (minutes>=5 && minutes<=15) && (!(quote.WORK_PACK===" ")))// && quote.WP_STATUS=="IN WORK")					
				{					
               /* $('#flighttable > tbody:last',el).append("<tr><td class='invalid'>"+quote.AC_REG_CD+"</td><td class='invalid'>"+quote.ARR_FLT_NO+"</td><td class='invalid'>"+quote.ARR_TIME+"</td><td class='invalid'>"+quote.DEP_FLT_NO+"</td><td class='invalid'>"+quote.DEP_TIME+"</td><td class='invalid'>"+quote.NXT_PORT+"</td><td class='invalid'>"+quote.WORK_PACK+"</td><td class='invalid'>"+quote.MEL_COUNT+"</td><td class='invalid'>"+quote.FAULTS_DUE+"</td></tr>");*/
			    $('#flighttable > tbody:last',el).append("<tr><td class='invalid'" + styleString + ">"+quote.AC_REG_CD+"</td><td class='invalid'>"+quote.ARR_FLT_NO+"</td><td class='invalid'>"+arrtime+"</td><td class='invalid'>"+quote.DEP_FLT_NO+"</td><td class='invalid'>"+deptime+"</td><td class='invalid'>"+quote.NXT_PORT+"</td><td class='invalid'>"+quote.WORK_PACK+"</td><td class='invalid'>"+quote.MEL_COUNT+"</td><td class='invalid'>"+quote.FAULTS_DUE+"</td></tr>");
			   
            }
				
				//else if(minutes<5 && quote.WP_STATUS=="IN WORK")
					else if(minutes<5 && (!(quote.WORK_PACK===" "))) //&& quote.WP_STATUS=="IN WORK")
			{
				 /*  $('#flighttable > tbody:last',el).append("<tr><td class='red'>"+quote.AC_REG_CD+"</td><td class='red'>"+quote.ARR_FLT_NO+"</td><td class='red'>"+quote.ARR_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='red'>"+quote.DEP_FLT_NO+"</td><td class='red'>"+quote.DEP_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='red'>"+quote.NXT_PORT+"</td><td class='red'>"+quote.WORK_PACK+"</td><td class='red'>"+quote.MEL_COUNT+"</td><td class='red'>"+quote.FAULTS_DUE+"</td></tr>");*/
				 $('#flighttable > tbody:last',el).append("<tr><td class='red'" + styleString + ">"+quote.AC_REG_CD+"</td><td class='red'>"+quote.ARR_FLT_NO+"</td><td class='red'>"+arrtime+"</td><td class='red'>"+quote.DEP_FLT_NO+"</td><td class='red'>"+deptime+"</td><td class='red'>"+quote.NXT_PORT+"</td><td class='red'>"+quote.WORK_PACK+"</td><td class='red'>"+quote.MEL_COUNT+"</td><td class='red'>"+quote.FAULTS_DUE+"</td></tr>");
            }
			else
			{
			/*$('#flighttable > tbody:last',el).append("<tr><td>"+quote.AC_REG_CD+"</td><td>"+quote.ARR_FLT_NO+"</td><td>"+quote.ARR_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td>"+quote.DEP_FLT_NO+"</td><td>"+quote.DEP_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td>"+quote.NXT_PORT+"</td><td>"+quote.WORK_PACK+"</td><td>"+quote.MEL_COUNT+"</td><td >"+quote.FAULTS_DUE+"</td></tr>");	*/
			$('#flighttable > tbody:last',el).append("<tr><td" + styleString + ">"+quote.AC_REG_CD+"</td><td>"+quote.ARR_FLT_NO+"</td><td>"+arrtime+"</td><td>"+quote.DEP_FLT_NO+"</td><td>"+deptime+"</td><td>"+quote.NXT_PORT+"</td><td>"+quote.WORK_PACK+"</td><td>"+quote.MEL_COUNT+"</td><td >"+quote.FAULTS_DUE+"</td></tr>");
			
			}
			});
		}
		else
		{
	data.obj.forEach(function(quote) {
				console.log(quote)
				var dt = new Date;
				var tzone = data.timezone;
				var utcdt = moment(dt).utc();
				var mom = moment.tz(utcdt,tzone);				
				var deptdt=moment.tz(quote.DEP_TIME,'DD-MMM-YY HH:mm:SS',tzone);							
				var hours=deptdt.diff(mom,'hours');
				var minutes=deptdt.diff(mom,'minutes');				
				var deptime=deptdt.format("DD-MMM HH:mm").toUpperCase();
				var arrtime=arrdt.format("DD-MMM HH:mm").toUpperCase();
				let styleString = "";
				console.log(quote)
		if (quote.ElogBookCap === "1") {
                    
                    styleString = " style=\"color: red;font-weight: bold\"";
				}
				//if(hours==0 && (minutes>=5 && minutes<=15) && quote.WP_STATUS=="IN WORK")	
				if(hours==0 && (minutes>=5 && minutes<=15) && (!(quote.WORK_PACK===" ")))						
				{					
              /*  $('#flighttable > tbody:last',el).append("<tr><td class='ieamber'>"+quote.AC_REG_CD+"</td><td class='ieamber'>"+quote.ARR_FLT_NO+"</td><td class='ieamber'>"+quote.ARR_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='ieamber'>"+quote.DEP_FLT_NO+"</td><td class='ieamber'>"+quote.DEP_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='ieamber'>"+quote.NXT_PORT+"</td><td class='ieamber'>"+quote.WORK_PACK+"</td><td class='ieamber'>"+quote.MEL_COUNT+"</td><td class='ieamber'>"+quote.FAULTS_DUE+"</td></tr>");*/
			  $('#flighttable > tbody:last',el).append("<tr><td class='ieamber'" + styleString + ">"+quote.AC_REG_CD+"</td><td class='ieamber'>"+quote.ARR_FLT_NO+"</td><td class='ieamber'>"+arrtime+"</td><td class='ieamber'>"+quote.DEP_FLT_NO+"</td><td class='ieamber'>"+deptime+"</td><td class='ieamber'>"+quote.NXT_PORT+"</td><td class='ieamber'>"+quote.WORK_PACK+"</td><td class='ieamber'>"+quote.MEL_COUNT+"</td><td class='ieamber'>"+quote.FAULTS_DUE+"</td></tr>");b
            }
				
				//else if(minutes<5 && quote.WP_STATUS=="IN WORK")
					else if(minutes<5 && (!(quote.WORK_PACK===" ")))
			{
				  /* $('#flighttable > tbody:last',el).append("<tr><td class='iered'>"+quote.AC_REG_CD+"</td><td class='iered'>"+quote.ARR_FLT_NO+"</td><td class='iered'>"+quote.ARR_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='iered'>"+quote.DEP_FLT_NO+"</td><td class='iered'>"+quote.DEP_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td class='iered'>"+quote.NXT_PORT+"</td><td class='iered'>"+quote.WORK_PACK+"</td><td class='iered'>"+quote.MEL_COUNT+"</td><td class='iered'>"+quote.FAULTS_DUE+"</td></tr>");*/
				  $('#flighttable > tbody:last',el).append("<tr><td class='iered'" + styleString + ">"+quote.AC_REG_CD+"</td><td class='iered'>"+quote.ARR_FLT_NO+"</td><td class='iered'>"+arrtime+"</td><td class='iered'>"+quote.DEP_FLT_NO+"</td><td class='iered'>"+deptime+"</td><td class='iered'>"+quote.NXT_PORT+"</td><td class='iered'>"+quote.WORK_PACK+"</td><td class='iered'>"+quote.MEL_COUNT+"</td><td class='iered'>"+quote.FAULTS_DUE+"</td></tr>");
				  
            }
			else
			{
			/*$('#flighttable > tbody:last',el).append("<tr><td>"+quote.AC_REG_CD+"</td><td>"+quote.ARR_FLT_NO+"</td><td>"+quote.ARR_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td>"+quote.DEP_FLT_NO+"</td><td>"+quote.DEP_TIME.format("DD-MMM HH:mm").toUpperCase()+"</td><td>"+quote.NXT_PORT+"</td><td>"+quote.WORK_PACK+"</td><td>"+quote.MEL_COUNT+"</td><td >"+quote.FAULTS_DUE+"</td></tr>");	*/
			$('#flighttable > tbody:last',el).append("<tr><td" + styleString + ">"+quote.AC_REG_CD+"</td><td>"+quote.ARR_FLT_NO+"</td><td>"+arrtime+"</td><td>"+quote.DEP_FLT_NO+"</td><td>"+deptime+"</td><td>"+quote.NXT_PORT+"</td><td>"+quote.WORK_PACK+"</td><td>"+quote.MEL_COUNT+"</td><td >"+quote.FAULTS_DUE+"</td></tr>");
			}
			});		
		
		}
			
	
	$('table.paginated').each(function() {
    var currentPage = 0;
    var numPerPage = 12;
    var $table = $(this);
    $table.bind('repaginate', function() {
        $table.find('tbody tr').hide().slice(currentPage * numPerPage, (currentPage + 1) * numPerPage).show();
    });
    $table.trigger('repaginate');
    var numRows = $table.find('tbody tr').length;
    var numPages = Math.ceil(numRows / numPerPage);
	//set the value of total page to input
	$("#TotalPage").val(numPages);
	var $pager = $('<div class="pager"></div>');
    for (var page = 0; page < numPages; page++) {
        $('<span class="page-number"></span>').text(page + 1).bind('click', {
            newPage: page
        }, function(event) {
            currentPage = event.data['newPage'];
            $table.trigger('repaginate');
            $(this).addClass('active').siblings().removeClass('active');
        }).appendTo($pager).addClass('clickable');
    }
	if(numPages>1)
	{
    $pager.insertAfter($table).find('span.page-number:first').addClass('active');
	}
});
				
		}
	
	};

function isIE () {
  var match = navigator.userAgent.match(/(?:MSIE |Trident\/.*; rv:)(\d+)/);
  return match ? parseInt(match[1]) : "BROWSER";
}	
	
	
setInterval(function() {

var dt = new Date;
//get Timezone from variable
var tzs = $('#TimeZone').val();
	$('#local').text(moment.tz(dt,tzs).format('HH:mm:ss')+" LOCAL");
	$('#global').text(moment(dt).utc().format('HH:mm:ss')+" UTC");
	$('#global').css('padding-left','100px');
	
	//The code below would dynmically set the css when the error prompt appears
	
	if($('.error').val().includes("Problem") && !($('#nextrefresh').text().includes("Next")))
	{
		$('#global').css('padding-top','28px');
	}
	else{
		$('#global').css('padding-top','0px');
	}
}, 1000);