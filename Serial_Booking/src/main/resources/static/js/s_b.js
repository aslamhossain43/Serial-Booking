
var table=$('#persondetails');

if(table.length){

	var jsonUrl=jsonurlPD;
	

	 table.DataTable({
  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
  pageLength:30,
  ajax:{
	  url:jsonUrl,
	  dataSrc : ''
	 
	  
  },
  columns : [
	 
	   {
		 data:'id',  
	   },
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

/*for person details*/
function showPersonModal(data)
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.personDetailsDeleteByAdmin').attr('href','/personDetailsDeleteByAdmin?id='+data);
	$("#myPersonDetailsModal .personDetailsDeleteByAdminId").html(data)
   $("#myPersonDetailsModal").modal();
}




var table=$('#rulesTable');

if(table.length){

	var jsonUrl=jsonurlR;
	

	 table.DataTable({
  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
  pageLength:30,
  ajax:{
	  url:jsonUrl,
	  dataSrc : ''
	 
	  
  },
  columns : [

	   {
		 data:'id',  
	   },
	 
	  {
		  
		  data:'rule',
		 
	  }
	 ,
	  {
		  data:'lastModifiedDate'
		 
	  } ,
	  {
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
		
						
			  str+='<a href="/updateRules?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
			   
			  str+='<button id="editTrauncate" class="btn btn-primary tag_cnt btn btn-danger"  onclick="showRulesModal('+data+')" type="button" value="1"><span class="glyphicon glyphicon-trash"></span></button>';
								
			  return str;
			
			  
		  }
		 
	  }
	  
	 
	 
  ]
	
		
});
} 


/*bootstrap modal*/

/*for rules*/
function showRulesModal(data)
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.rulesDeleteByAdmin').attr('href','/rulesDeleteByAdmin?id='+data);
	$("#myRulesModal .rulesDeleteByAdminId").html(data)
   $("#myRulesModal").modal();
}



var table=$('#notificationTable');

if(table.length){

	var jsonUrl=jsonurlN;
	

	 table.DataTable({
  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
  pageLength:30,
  ajax:{
	  url:jsonUrl,
	  dataSrc : ''
	 
	  
  },
  columns : [

	   {
		 data:'id',  
	   },
	 
	  {
		  
		  data:'notification',
		 
	  }
	 ,
	  {
		  data:'lastModifiedDate'
		 
	  } ,
	  {
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
		
						
			  str+='<a href="/updateNotification?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
			   
			  str+='<button id="editTrauncate" class="btn btn-primary tag_cnt btn btn-danger"  onclick="showNotificationModal('+data+')" type="button" value="1"><span class="glyphicon glyphicon-trash"></span></button>';
								
			  return str;
			
			  
		  }
		 
	  }
	  
	 
	 
  ]
	
		
});
} 


/*bootstrap modal*/

/*for notification*/
function showNotificationModal(data)
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.notificationDeleteByAdmin').attr('href','/notificationDeleteByAdmin?id='+data);
	$("#myNotificationModal .notificationDeleteByAdminId").html(data)
   $("#myNotificationModal").modal();
}




//SERIAL BOOKING TABLE
var table=$('#serialBookingTable');

if(table.length){

	var jsonUrl=jsonurlS;
	

	 table.DataTable({
  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
  pageLength:30,
  ajax:{
	  url:jsonUrl,
	  dataSrc : ''
	 
	  
  },
  columns : [

	   {
		 data:'id',  
	   },
	 
	  {
		  
		  data:'name',
		 
	  },
	 
	  {
		  
		  data:'age',
		 
	  },
	 
	  {
		  
		  data:'visitTime',
		 
	  }
	 ,
	  {
		  data:'lastModifiedDate'
		 
	  } ,
	  {
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
		
						
			  str+='<a href="/updateSerial?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
								
			  return str;
			
			  
		  }
		 
	  }
	  
	 
	 
  ]
	
		
});
} 

/*for serial*/
function showSerialModal()
{
   //you can do anything with data, or pass more data to this function. i set this data to modal header for example
	 $('.serialDeleteByAdmin').attr('href','/serialDeleteByAdmin');
	 $("#mySerialModal").modal();
}
