
var table=$('#viewallcouching');

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
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
				var id=data;	
		
					if (userRole=='ADMIN') {
							
			  return id;
			
			  
		  }else {
			return str;
		}
	  }
	  },
	 
		 {
			data:'iCode',
			mRender:function(data){
				var str='';
				
				str+='<img src="images/'+data+'.jpg" id="viewAllCouchingImg" >';
				return str;
				
				
				
			}
		
		
	  },
{
		  
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
			
						
			  str+='<a href="/singleViewForCouching?id='+data+'" id="gmapjs" class="btn btn-primary">View Single</a>';
                	return str;
					
		  }
		  
	  }
	  ,
	  {
		  
		  data:'couchingName',
		 
	  }
	  ,
	  {
		  data:'districtName'
		 
		  
		  
	  },
	  {
		  data:'jobType'
		 
	  },
	  {
		  data:'institutionDepartment'
		 
	  },
	  {
		  data:'classes'
		 
	  },
	  {
		  data:'address'
		 
	  },
 {
		  
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
			
						
			  str+='<a href="/map?id='+data+'" id="gmapjs" class="btn btn-primary"><span class="glyphicon glyphicon-map-marker ">Google Maps</span></a>';
                	return str;
					
		  }
		  
	  }
	  ,
	 
	  {
		  data:'contact'
		 
	  }
	  ,
	  {
		  
		  data:'lastModifiedDate'
		 
		 
	  }
	  ,
	  {
		  data:'id',
		  mRender:function(data){
			  				
			  var str='';
					
		
					if (userRole=='ADMIN') {
						
			  str+='<a href="/updateCouchingCenterByAdmin?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
			   
			  str+='<button id="editTrauncate" class="btn btn-primary tag_cnt btn btn-danger"  onclick="showCouchingModal('+data+')" type="button" value="1"><span class="glyphicon glyphicon-trash"></span></button>';
				return str;
					}if (userRole=='USER') {
						  str+='<a href="/showUpdateWordForCouchingByUser?id='+data+'" id="editTrauncate" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
				             
						return str;
					}
											
			  return str;
			
			  
		  }
		 
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
