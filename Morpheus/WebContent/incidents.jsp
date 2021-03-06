<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<html lang="en">
  <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>
        Add Incident
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">
      
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

}if(password=="")
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


 <body background="images/binary-star.jpg"><font color="FFFFFF">
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="userCompany.jsp">Home</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Employee Contacts <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=employee">Add Employee</a>
                  </li>
                  <li>
                    <a href="userController?user=editProducts">View or Edit Employee</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Activity <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addjob">Add Jobs</a>
                  </li>
                  <li>
                    <a href="userController?user=editProductss">View or Edit Jobs</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Incidents <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li  class="active">
                    <a href="userController?user=addincident">Add Incident</a>
                  </li>
                  <li>
                    <a href="userController?user=editProductsss">View or Edit Incident</a>
                  </li>
                </ul>
              </li>             
            </ul>
            <form class="navbar-form navbar-right">
              <a href="userController?user=logout" class="btn btn-success">Logout</a>
            </form>
          </div>
          <!--/.navbar-collapse -->
        </div>
      </div>
      
      
      
<div class="container">
      <div class="starter-template">
      <br>
      <br>
        <h1>
          Add Incident
        </h1>
        <p class="lead">
        </p>
        <form action="userController?user=incident" method="post">
        	<div class="row">
        	<div class="col-md-6">
            <label>
            Company ID
            </label><br>
            <input type="text" id="companyname" name="companyid" class="form-control"/><br>
			<label>
            Incident Date
            </label><br>
            <input type="text" id="email" name="date" class="form-control"/><br>
            </div>            
            <div class="col-md-6">
            <label>
            Employee ID
            </label><br>
            <input type="text" id="password" name="employeeid" class="form-control"/><br>                       
			<label>
            Severity Level
            </label><br>
           	<input type="text" id="address1" name="level" class="form-control"><br>
            </div>
            </div>
            <label>
            Address
            </label><br>
            <input type="text" id="address2" name="address" class="form-control"/><br>   
            <label>
           	Persons Involved
            </label><br>
            <input type="text" id="suburb" name="involved" class="form-control"/><br>  
            <label>
            Brief Description
            </label><br>
            <input type="text" id="state" name="description" class="form-control"/><br> 
            <label>
            Action Taken
            </label><br>
            <input type="text" id="postcode" name="action" class="form-control"/><br>  
            <label>
            Attach File
            </label><br>
            <input type="file" class="btn btn-default" value="Upload files" name="upload" /> <br>       
            <input type="submit" class="btn btn-default" value="Lodge Report" onclick="return validate();"/>         
        </form>
     </div>
    </div>
    <!-- /.container -->
    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
    </script>
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
    </script>
    
  </body>
</html>

