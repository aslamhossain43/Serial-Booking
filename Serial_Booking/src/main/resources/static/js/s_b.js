
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
		 
	  } ,
	  {
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
		
						
			  str+='<a href="/updatePersonDetails?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
			   
			  str+='<button id="editTrauncate" class="btn btn-primary tag_cnt btn btn-danger"  onclick="showPersonModal('+data+')" type="button" value="1"><span class="glyphicon glyphicon-trash"></span></button>';
								
			  return str;
			
			  
		  }
		 
	  }
	  
	 
	 
  ]
	
		
});
} 


/*bootstrap modal*/

/*for couching*/
function showPersonModal(data)
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.personDetailsDeleteByAdmin').attr('href','/personDetailsDeleteByAdmin?id='+data);
	$("#myPersonDetailsModal .personDetailsDeleteByAdminId").html(data)
   $("#myPersonDetailsModal").modal();
}
