<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>

<%@page import="com.morpheus.bean.issueRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%><html>
<html lang="en">
    
    <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>
      Edit Employee
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">
      
      <script type="text/javascript">

  function validation(){
  
            var fname=document.getElementById("fname").value;
            var password=document.getElementById("password").value;
            var x = document.forms["myForm"]["email"].value;
            var atpos = x.indexOf("@");
            var dotpos = x.lastIndexOf(".");
            var address=document.getElementById("address").value;
            var lname=document.getElementById("lname").value;
            var accountid=document.getElementById("accountid").value;

  
  if(fname==""){

          alert("Please complete details.")
           return false;
  
         }
  if(lname=="")
        {
      
         alert("Please complete details.");
          return false;
     }
  
  
  if(email==""){

      alert("Please complete details.")
       return false;

     }if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
    	    alert("Not a valid e-mail address");
    	    return false;
    	}
    	if (password.length < 6 || !letter.test(password) || !number.test(password)) {
    		  alert("Password must be atleast 6 characters long.");
    	    return false;
    	}
if(address=="")
    {
  
     alert("Please complete details.");
      return false;
 }
if(password==""){

    alert("Please complete details.")
     return false;

   }
if(email=="")
  {

   alert("Please complete details.");
    return false;
}

if(accountid==""){

alert("Please complete details.")
 return false;

}
return true;
}
</script>
    </head>

</head>

<body background="images/binary-star.jpg">
 <div class="container">
      <div class="starter-template">
      <br>
      <br>
        <h1><font color="FFFFFF">
         Edit Employee Record In System</font>
        </h1>

 
 <%
     Iterator<issueRecord> itr;
     ArrayList<issueRecord> issuelist=(ArrayList<issueRecord>)request.getAttribute("viewIssueList");

     if(issuelist!=null){
    	 for(itr=issuelist.iterator();itr.hasNext();){

    		 issueRecord su=new issueRecord();	
    	                 su=(issueRecord)itr.next();
  %>

   <div class="container">
      <div class="starter-template">    
		<form action="userController?user=addempRecordSucc" method="post" onsubmit="validation();">    
  	    <input type="hidden" name="hiddenProductID" value="<%=su.getProductID()%>"/><br>
	    <label><font color="FFFFFF">First Name</font></label><br>
	    <input type="text" id="fname" name="jobtitle" value="<%=su.getNameInventory()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Last Name</font></label><br>
		<input type="text" id="email" name="email" value="<%=su.getEmail()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Address</font></label><br>
 		<input type="text" id="password" name="password" value="<%=su.getPassword()%>" class="form-control"/><br>
 		<label><font color="FFFFFF">Email ID</font></label><br>
        <input type="text" id="address" name="address1" value="<%=su.getIssueDate()%>" class="form-control"/><br>
		<label><font color="FFFFFF">Password</font></label><br>
		<input type="text" id="lname" name="address2" value="<%=su.getIssueNoDay()%>" class="form-control"><br>
	

     
<%}
   }%>
<br><br>
    	<input type="submit" value="Update" class="btn btn-default" onclick="return validation();"/>
    
   </form>

</div>

</body>
</html>