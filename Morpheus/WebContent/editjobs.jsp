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
    </head>

<body background="images/binary-star.jpg">
 <div class="container">
      <div class="starter-template">
      <br>
      <br>
        <h1><font color="FFFFFF">
         Edit Job Record In System</font>
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
<form action="userController?user=addjobsRecordSucc" method="post">    
<input type="hidden" name="hiddenProductID" value="<%=su.getProductID()%>"/>
	    <label><font color="FFFFFF">Company ID</font></label><br>
		<input type="text" id="companyname" name="jobtitle" value="<%=su.getNameInventory()%>" class="form-control"/><br>
	    <label><font color="FFFFFF">Employee ID</font></label><br>
        <input type="text" id="email" name="email" value="<%=su.getEmail()%>" class="form-control"/><br>
	    <label><font color="FFFFFF">Customer</font></label><br>
		<input type="text" id="password" name="password" value="<%=su.getPassword()%>" class="form-control"/><br>
	    <label><font color="FFFFFF">Job Title</font></label><br>
	    <input type="text" id="address1" name="address1" value="<%=su.getIssueDate()%>" class="form-control"/><br>
	    <label><font color="FFFFFF">Description</font></label><br><input type="text" id="address2" name="address2" value="<%=su.getIssueNoDay()%>" class="form-control"><br>
 	    <label><font color="FFFFFF">Date</font></label><br><input type="text" id="suburb" name="suburb" value="<%=su.getReturnDate()%>" class="form-control"><br>
  <%}
   }%>
   <br><br>
   		<input type="submit" value="add" onclick="return validate();" class="btn btn-default">
   
   </form>

</div>

</body>
</html>