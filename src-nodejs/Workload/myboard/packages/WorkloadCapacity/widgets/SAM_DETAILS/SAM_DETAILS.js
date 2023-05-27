widget = {
    onInit: function (el) { },
    onData: function (el, data) {
        function getParameterByName(url, name) {
            var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(url);
            if (results == null) {
                return null;
            }
            return decodeURI(results[1]) || 0;
        }
        var wpData = data.graphData.CustomData.filter(function (r) {
            return r.dayOFWeek === getParameterByName(location, 'dayOfWeek');
        });

        if (data.msg != "") {
            $("#outage_banner").removeClass("padder");
            $("#outage_banner").addClass("outage_banner");
            $("#outage_banner", el).text(data.msg);
        } else {
            $("#outage_banner").addClass("padder");
            $("#wptableData > tbody").html("");
            $(".pagerwp").remove();
        }

        $("#wptableData > tbody").html("");

        wpData.forEach(function (quote) {
            $('#wptableData > tbody:last', el)
                .append("<tr><td align='center'>" + quote.localStartDate +
                    "</td><td align='center'>" + quote.localStartTime +
                    "</td><td align='center'>" + quote.localEndDate +
                    "</td><td align='center'>" + quote.localEndTime +
                    "</td><td align='center'>" + quote.assmblCd +
                    "</td><td align='center'>" + quote.rego +
                    "</td><td align='center'>" + quote.checkGroup +
                    "</td><td align='center'>" + quote.wpBarcode +
                    "</td><td align='center'>" + parseFloat(quote.schedHrs).toFixed(1) +
                    "</td><td align='center'>" + parseFloat(quote.completeHrs).toFixed(1) +
                    "</td></tr>");
        });

        var schedHrsSum = 0;
        var compltedHrsSum = 0;
        var mouHrsSum = 0;

        for (var i = 0; i < wpData.length; i++) {
            schedHrsSum += parseFloat(wpData[i].schedHrs)
            compltedHrsSum += parseFloat(wpData[i].completeHrs)
            mouHrsSum += parseFloat(wpData[i].mouHrs)
        }

        $("#totalSchedHours").html(schedHrsSum.toFixed(1));       
        $("#totalCompletedHours").html(compltedHrsSum.toFixed(1));       
        $("#totalMouHours").html(parseFloat(getParameterByName(location, 'mouHours')).toFixed(1));       

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