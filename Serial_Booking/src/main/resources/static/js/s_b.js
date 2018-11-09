
var table=$('#persondetails');

if(table.length){

	var jsonUrl=jsonurl;
	

	 table.DataTable({
  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
  pageLength:30,
  ajax:{
	  url:jsonUrl,
	  dataSrc : ''
	 
	  
  },
  columns : [
	 
	 
		 {
			data:'iCode',
			mRender:function(data){
				var str='';
				
				str+='<img src="images/'+data+'.jpg" id="viewAllPersonDetailsImg" >';
				return str;
				
				
				
			}
		
		
	  },

	  {
		  
		  data:'name',
		 
	  }
	  ,
	  {
		  data:'degree'
		 
		  
		  
	  },
	  {
		  data:'expert'
		 
	  },
	  {
		  data:'chamberLocation'
		 
	  },
	  {
		  data:'contact'
		 
	  },
	  {
		  data:'lastModifiedDate'
		 
	  }
	  
	 
	 
  ]
	
		
});
} 


/*bootstrap modal*/

/*for couching*/
function showCouchingModal(data)
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.couchingDeleteByAdmin').attr('href','/deleteCouchingByAdmin?id='+data);
	$("#myModal .couchingDeleteId").html(data)
   $("#myModal").modal();
}
