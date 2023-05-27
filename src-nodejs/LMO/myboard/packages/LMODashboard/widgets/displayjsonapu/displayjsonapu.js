widget = {
    //runs when we receive data from the job
	
	
	
    
	onData: function(el, data) {
		var APUalertingURL="https://apualerting.qantas.com.au/apu-dashboard?port=";
	
        //The parameters our job passed through are in the data object
        //el is our widget element, so our actions should all be relative to that
		
		
		//console.log(data);
		
		//if (data.title) {
		//		$('.headWp', el).text(data.obj.alertData[0]);
		//			}
		
		//console.log(data);
		
		if(data.obj.dataStatus==="E")
		{
			linkHtml="<a target='_blank' href='"+APUalertingURL+data.obj.loc +"'><h1 class='headApu'>APU Alerting Dashboard &nbsp;<sup><img width='18px' src='/widgets/resources?resource=LMODashboard/displayjsonapu/link_logo.png'</img></sup></h1></a>";
			$("#apuLink").html("");
			$('#apuLink',el).append(linkHtml);
			
			var tableHtml="<h1 align='center' class='headWp'>The APU alert data can not be retrieved at the moment.</h1>";
			$("#apuData").html("");	
		$('#apuData',el).append(tableHtml);
			
		}
		
		else{
				
		
				
				//add table rows now
				
				var numPerRow = 10;
				var counter=0;
				
				
				if(data.obj.dataStatus==="N")
				{
					var tableHtml="<h1 align='center' class='headWp'>There are currently no active APU alerts.</h1>"
					linkHtml="<a target='_blank' href='"+APUalertingURL+data.obj.loc +"'><h1 class='headApu'>APU Alerting Dashboard &nbsp;<sup><img width='18px' src='/widgets/resources?resource=LMODashboard/displayjsonapu/link_logo.png'</img></sup></h1></a>";
					$("#apuData").html("");	
					$('#apuData',el).append(tableHtml);
				}

				else{
					linkHtml="<a target='_blank' href='"+APUalertingURL+data.obj.loc +"'><h1 class='headApu'>APU Alerting Dashboard &nbsp;<sup><img width='18px' src='/widgets/resources?resource=LMODashboard/displayjsonapu/link_logo.png'</img></sup></h1></a>";
					//console.log(linkHtml);
					var tableHtml='<tr con>';
					data.obj.alertData.forEach(function(quote1) {
					counter++;
					//console.log(data);
					//tableHtml=tableHtml+'<td width="100px"><label class="apuLabel">'+ quote1.rego.replace("VH-","") +'</label></td>';
					/* The substring is being used to cater to the APU alerting changes */
					tableHtml=tableHtml+'<td width="100px"><label class="apuLabel">'+ quote1.rego.substring(3) +'</label></td>';
					if(counter===numPerRow)
					{
						tableHtml=tableHtml+'</tr><tr>';
						counter=0;
					}
					});
					tableHtml=tableHtml+'</tr>';
					
					$("#apuData").html("");	
					$('#apuData',el).append(tableHtml);
					
						$('table.paginatedApu').each(function() {
							var currentPage = 0;
							var numPerPage = 1;
							var $table = $(this);
							$table.bind('repaginate', function() {
								
								$table.find('tbody tr').hide().slice(currentPage * numPerPage, (currentPage + 1) * numPerPage).show();
							});
							$table.trigger('repaginate');
							var numRows = $table.find('tbody tr').length;
							var numPages = Math.ceil(numRows / numPerPage);
							//set the value of total page to input
							$("#TotalPage").val(numPages);
							var $pagerapu = $('<div class="pagerapu"></div>');
							for (var page = 0; page < numPages; page++) {
								$('<span class="page-number"></span>').text(page + 1).bind('click', {
								newPage: page
								}, function(event) {
								currentPage = event.data['newPage'];
								$table.trigger('repaginate');
								$(this).addClass('active').siblings().removeClass('active');
							}).appendTo($pagerapu).addClass('clickable');
					}
					if(numPages>1)
					{
						$pagerapu.insertAfter($table).find('span.page-number:first').addClass('active');
					}
					});
					
					}
				
				

					

				
				
				//console.log(linkHtml);
			
			
		
		
		
			$("#apuLink").html("");
			$('#apuLink',el).append(linkHtml);
			}
			
		
			
	}

}
		