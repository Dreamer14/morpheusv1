<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

  
<%@page import="com.morpheus.bean.userBean"%>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.png">
    <title>
      Morpheus Management System
    </title>
 	<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/morpheus.css" rel="stylesheet">
    <script type="text/javascript">


function validate(){

    var userName=document.getElementById("name").value;
    var password=document.getElementById("password").value;
    
    if(userName==""){

         alert("Please enter the email.");
         return false;
    
     }
    if(password=="")
    {
        
         alert("Please enter the password.");
         return false;
     }
    return true;
}




</script>
</head>
 
 
  <%
        if(request.getAttribute("wrongUserName")!=null){
 
        String data=request.getAttribute("wrongUserName").toString();
        
        
        %>
   
   <td align="center" style="color: red;"><center><%=data%></center></td>
   

   <%} %>
   
    
  <body background="images/binary-star.jpg">
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp">Morpheus</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-center">
          <li>
              <a href="AboutUs.html">About Us</a>
            </li>
            <li>
              <a href="HowItWorks.html">How it works</a>
            </li>
            <li>
              <a href="Downloads.html">Downloads</a>
            </li>
            <li>
              <a href="PlansAndPricing.html">Plans & Pricing</a>
            </li>
            <li>
              <a href="ContactUs.html">Contact</a>
            </li>
          </ul>
          
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>

</head>

 
     <div class="jumbotron">
      <div class="container"><font color="FFFFFF">
        <h1>
          Morpheus Health and Safety Management System
        </h1>
        <p>
          Designed for companies and employees to provide an online management system
        of reports, tasks, records, and more.
        </p></font>
        <p>
          <a href="AboutUs.html" class="btn btn-primary btn-lg">About Us »</a>
        </p>
 </div>
    </div>
    
          
         <div class="container">
          <div class="row">
      <div class="starter-template">
 
  
     
     
     
      <div class="col-md-6">
      <h1><font color="FFFFFF">
          Employee Log-in
      	</font></h1>
        <p class="lead">
        </p>
            <form action="userController?user=logincompany" method="post">
            <fieldset>
            <label><font color="FFFFFF">
              Email
            </font></label>
            <br>
            <input type="text" id="name" name="email" class="form-control"/>
            <br>
            <label><font color="FFFFFF">Password</font></label>
            <input type="password" id="password" name="password" class="form-control"/>
            <br>
            <tr><td align="center"><input type="submit"  class="btn btn-default" value="Employee Log-in" onClick="return validate();"> </td>
			<td><input type="hidden" name="user" value="loginUser"></td>
			</tr> 
			</fieldset>     
        </form>             
        </div>
       
      </div>     
    </div>
    <!-- /.container -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
    </script>
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
    </script>
  </body>

</html>
</head>
