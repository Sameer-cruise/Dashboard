widget = {

	onData: function (el, data) {

		if (data.msg != "") {
			$("#outage_banner").removeClass("padder");
			$("#outage_banner").addClass("outage_banner");
			$("#outage_banner", el).text(data.msg);
		}
		else {
			$("#outage_banner").addClass("padder");
			$("#wptableData > tbody").html("");
			$(".pagerwp").remove();
		}

		data.obj.forEach(function (quote) {
			$('#wptableData > tbody:last', el).append("<tr><td>" + quote.localStartDt + "</td><td>" + quote.localStartTime + "</td><td>" + quote.localEndDt + "</td><td>" + quote.localEndTime + "</td><td>" + quote.assmblCd + "</td><td>" + quote.rego.substring(3) + "</td><td>" + quote.wpBarcode + "</td><td>" + quote.schedHR + "</td><td>" + quote.overflowHr + "</td></tr>");

		});

		$('table.paginatedWp').each(function () {
			var currentPage = 0;
			var numPerPage = 15;
			var $table = $(this);
			$table.bind('repaginate', function () {
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
				}, function (event) {
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

setInterval(function () {

	var dt = new Date;
	//get Timezone from variable
	//var tzs = $('#TimeZone').val();
	//$('#local').text(moment.tz(dt,tzs).format('HH:mm:ss')+" LOCAL");
	$('#date_cd_utc_adl').text(" UTC - " + moment(dt).utc().format('HH:mm:ss') + "Z");
}, 1000);
