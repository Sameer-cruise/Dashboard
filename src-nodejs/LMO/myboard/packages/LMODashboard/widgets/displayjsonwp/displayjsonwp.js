widget = {
    //runs when we receive data from the job

    onData: function(el, data) {
        console.log(data)
        //The parameters our job passed through are in the data object
        //el is our widget element, so our actions should all be relative to that
        if (data.title) {
            $('.headWp', el).text(data.title);
        }
        //change color if flight is elogbook capable



        //If the banner is present, sets the css of the work package widget dynamically

        if ($('.outage_banner').val()) {
            $('.headWp').css('padding-top', '20px');
        } else {
            $('.headWp').css('padding-top', '0px');
        }
        /*if(data.timezone){
        	$('#TimeZone',el).val(data.timezone);
        }
		
        if(data.outage)
        {
        	$('.outage_banner', el).text(data.outage);
        }
		
        if(data.val1)
        {
        	$("#lastrefresh").html("");
        	$('#lastrefresh',el).append(data.val1);
        }
		
        if(data.val2)
        {
        	$("#nextrefresh").html("");
        	$("#nextrefresh",el).append(data.val2);
        }*/

        //clear the html from previous job
        $("#wptableData > tbody").html("");
        $(".pagerwp").remove();
        //add table rows now

        var browser = isIE();
        console.log(data);

        if (browser == "BROWSER" || browser > 9) {

            data.obj.forEach(function(quote) {

                var dt = new Date;
                var tzone = data.timezone;
                var utcdt = moment(dt).utc();
                var mom = moment.tz(utcdt, tzone);
                var startDate = moment.tz(quote.wp_START, "DD-MMM-YY HH:mm", tzone);
                var hours = startDate.diff(mom, 'hours');
                var minutes = startDate.diff(mom, 'minutes');


                console.log("The package and hours:" + quote.wp + "," + hours + "," + minutes);
                let styleString = "";
                if (quote.eLogBookCap === 1) {
                    console.log(quote.eLogBookCap)
                    styleString = " style=\"color: red;font-weight: bold\"";
                }
                if (quote.status == "IN WORK") {
                    $('#wptableData > tbody:last', el).append("<tr><td class='inwork'" + styleString + ">" + quote.rego + "</td><td class='inwork'>" + quote.wp + "</td><td class='inwork'>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td class='inwork'>" + quote.status + "</td></tr>");
                }
                //else if(hours==0 && (minutes>=5 && minutes<=15) && quote.WP_STATUS=="IN WORK")		
                else if (hours <= 0 && (minutes <= -10) && quote.status != "IN WORK") {
                    $('#wptableData > tbody:last', el).append("<tr><td class='invalid'" + styleString + ">" + quote.rego + "</td><td class='invalid'>" + quote.wp + "</td><td class='invalid'>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td class='invalid'>" + quote.status + "</td></tr>");
                } else {
                    $('#wptableData > tbody:last', el).append("<tr><td " + styleString + ">" + quote.rego + "</td><td>" + quote.wp + "</td><td>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td>" + quote.status + "</td></tr>");
                }
                // to change color if elogbook capable
                // if(quote.eLogBookCap===0){
                //      	$('#elogRego').css({ 'color': 'red', 'font-weight': 'bold' });
                //      	console.log("printing eLogBookCap")
                //      }
            });

        } else {
            data.obj.forEach(function(quote) {

                var dt = new Date;
                var tzone = data.timezone;
                var utcdt = moment(dt).utc();
                var mom = moment.tz(utcdt, tzone);
                var startDate = moment.tz(quote.wp_START, "DD-MMM-YY HH:mm", tzone);
                var hours = deptdt.diff(mom, 'hours');
                var minutes = deptdt.diff(mom, 'minutes');
                if (quote.status == "IN WORK") {
                    $('#wptableData > tbody:last', el).append("<tr><td class='inwork' id='elogRego'>" + quote.rego + "</td><td class='inwork'>" + quote.wp + "</td><td class='inwork'>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td class='inwork'>" + quote.status + "</td></tr>");
                }
                //else if(hours==0 && (minutes>=5 && minutes<=15) && quote.WP_STATUS=="IN WORK")		
                else if (hours <= 0 && (minutes <= -10) && quote.status != "IN WORK") {
                    $('#wptableData > tbody:last', el).append("<tr><td class='ieamber' id='elogRego'>" + quote.rego + "</td><td class='ieamber'>" + quote.wp + "</td><td class='ieamber'>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td class='ieamber'>" + quote.status + "</td></tr>");
                } else {
                    $('#wptableData > tbody:last', el).append("<tr><td id='elogRego'>" + quote.rego + "</td><td>" + quote.wp + "</td><td>" + startDate.format("DD-MMM HH:mm").toUpperCase() + "</td><td>" + quote.status + "</td></tr>");
                }
                //to change color if elogbook capable
                //if (quote.eLogBookCap === 0) {
                    //$('#elogRego').css({ 'color': 'red', 'font-weight': 'bold' });
                    // console.log("printing eLogBookCap")
                //}
            });

        }


        $('table.paginatedWp').each(function() {
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
            var $pagerwp = $('<div class="pagerwp"></div>');
            for (var page = 0; page < numPages; page++) {
                $('<span class="page-number"></span>').text(page + 1).bind('click', {
                    newPage: page
                }, function(event) {
                    currentPage = event.data['newPage'];
                    $table.trigger('repaginate');
                    $(this).addClass('active').siblings().removeClass('active');
                }).appendTo($pagerwp).addClass('clickable');
            }
            if (numPages > 1) {
                $pagerwp.insertAfter($table).find('span.page-number:first').addClass('active');
            }
        });

    }

};

function isIE() {
    var match = navigator.userAgent.match(/(?:MSIE |Trident\/.*; rv:)(\d+)/);
    return match ? parseInt(match[1]) : "BROWSER";
}


/*setInterval(function() {

var dt = new Date;
//get Timezone from variable
var tzs = $('#TimeZone').val();
	$('#local').text(moment.tz(dt,tzs).format('HH:mm:ss')+" LOCAL");
	$('#global').text(moment(dt).utc().format('HH:mm:ss')+" UTC");
}, 1000);*/