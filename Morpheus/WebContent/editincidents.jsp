<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>

<%@page import="com.morpheus.bean.issueRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

 <html lang="en">
    
    <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>
      Edit Incidents
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">

<link rel="shortcut icon" href="images/arun.jpg" />
<link type="text/css" href="css/menu.css" rel="stylesheet"/>
<link  rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/jquery.ui.datepicker.css">
<link rel="stylesheet" href="css/jquery.ui.theme.css">
<link rel="stylesheet" href="css/jquery.ui.core.css">
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="js/jquery.ui.core.js" type="text/javascript"></script>
<script src="js/jquery.ui.widget.js" type="text/javascript"></script>
<script src="js/jquery.ui.datepicker.js" type="text/javascript"></script>


<script type="text/javascript">
	$(function() {
		$( "#dateofIssue" ).datepicker();
		//$( "#returnDate" ).datepicker();
	});

	
</script>



<script type="text/javascript">

function validation(){

          var companyName=document.getElementById("companyname").value;
          
          var email=document.getElementById("email").value;
          var password=document.getElementById("password").value;
          
          var address1=document.getElementById("address1").value;
          var address2=document.getElementById("address2").value;
          var suburb=document.getElementById("suburb").value;
          var state=document.getElementById("state").value;
          var postcode=document.getElementById("postcode").value;
         
          var abn=document.getElementById("abn").value;

if(companyName==""){

        alert("please fill the Company ID.")
         return false;

       }
if(password=="")
      {
    
       alert("please fill the Employee ID.");
        return false;
   }


if(email==""){

    alert("please fill the Incident Date.")
     return false;

   }
if(address1=="")
  {

   alert("please fill the Severity Level.");
    return false;
}
if(address2==""){

  alert("please fill the Persons Involved.")
   return false;

 }
if(suburb=="")
{

 alert("please fill the Description.");
  return false;
}

if(postcode==""){

alert("please fill the Action taken.")
return false;

}
if(state=="")
{

alert("please fill the state properly.");
return false;
}
if(abn=="")
{

alert("please write ABN in numerical characters.");
return false;
}
return true;
}
</script>
</head>

<body background="images/binary-star.jpg">
 <div class="container">
      <div class="starter-template">
      <br>
      <br>
        <h1><font color="FFFFFF">
         Edit Incident Record In System</font>
        </h1>

  
   <div class="container">
      <div class="starter-template">   
               <%
     Iterator<issueRecord> itr;
     ArrayList<issueRecord> issuelist=(ArrayList<issueRecord>)request.getAttribute("viewIssueList");

     if(issuelist!=null){
    	 for(itr=issuelist.iterator();itr.hasNext();){

    		 issueRecord su=new issueRecord();	
    	                 su=(issueRecord)itr.next();
  %> 
		<form action="userController?user=addincidentsRecordSucc" method="post">       
  	    <input type="hidden" name="hiddenProductID" value="<%=su.getProductID()%>"/><br>
	    <label><font color="FFFFFF">Company ID</font></label><br>
	    <input type="text" id="companyname" name="jobtitle" value="<%=su.getNameInventory()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Employee ID</font></label><br>
		<input type="text" id="email" name="email" value="<%=su.getEmail()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Incident Date</font></label><br>
 		<input type="text" id="password" name="password" value="<%=su.getPassword()%>" class="form-control"/><br>
 		<label><font color="FFFFFF">Severity Level</font></label><br>
        <input type="text" id="address1" name="address1" value="<%=su.getIssueDate()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Address</font></label><br>
		<input type="text" id="address2" name="address2" value="<%=su.getIssueNoDay()%>" class="form-control"><br>
		<label><font color="FFFFFF">Persons Involved</font></label><br>
		<input type="text" id="suburb" name="suburb" value="<%=su.getReturnDate()%>" class="form-control"><br>
		<label><font color="FFFFFF">Description</font></label><br>
		<input type="text" id="state" name="state" value="<%=su.getVersionOfInventory()%>" class="form-control"><br>
		<label><font color="FFFFFF">Status</font></label><br>
		<input type="text" id="postcode" name="postcode" value="<%=su.getIssueToDepartment()%>" class="form-control"><br>    
<%}
   }%>
<br><br>
    	<input type="submit" value="Update" class="btn btn-default" onclick="return validation();"/>
    
   </form>
</div>
</div>

</body>
</html>       
       
  