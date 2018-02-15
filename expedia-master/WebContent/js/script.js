$(document).ready(function(){
   if ($('#resultsTable tr').length > 0) {
    $('#resultsDiv').show();
   }else{
	   $('#resultsDiv').hide();
	   $('#noDataFoundDiv').show();
   }                        
 });