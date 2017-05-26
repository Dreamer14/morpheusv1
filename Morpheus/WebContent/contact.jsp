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
        Add Contact
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">
      
<script type="text/javascript">

  function validate(){
  
            var firstname=document.getElementById("firstname").value;
            var lastname=document.getElementById("lastname").value;
            var email=document.getElementById("email").value;
            var landline=document.getElementById("landline").value;
            var mobile=document.getElementById("mobile").value;
  
  	if(firstname==""){

          alert("Please complete details.")
           return false;
  
         }
  	if(lastname=="")
        {
      
         alert("Please complete details.");
          return false;
     }
	if(email==""){

          alert("Please complete details.")
           return false;
  
         }
	if(landline==""){

          alert("Please complete details.")
           return false;
  
         }
	if(mobile==""){

          alert("Please complete details.")
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
            <a class="navbar-brand" href="userAccount.jsp">Home</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Accounts <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addaccount">Add Account</a>
                  </li>
                  <li>
                    <a href="userController?user=editProduct">View or Edit Account</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contacts <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li class="active">
                    <a href="userController?user=addcontact">Add Contact</a>
                  </li>
                  <li>
                    <a href="userController?user=editProduct">View or Edit Contact</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Jobs <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addjob">Add Jobs</a>
                  </li>
                  <li>
                    <a href="userController?user=editProduct">View or Edit Jobs</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Incidents <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addincident">Add Incident</a>
                  </li>
                  <li>
                    <a href="userController?user=editProduct">View or Edit Incident</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Companies <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addcompany">Add Companies</a>
                  </li>
                  <li>
                    <a href="userController?user=editProduct">View or Edit Companies</a>
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
          Add Contact
        </h1>
        <p class="lead">
        </p>
        <form action="userController?user=contact" method="post">
            <label>
            Company ID
            </label><br>
            <input type="text" id="companyid" class="form-control" name="companyid"/><br>
            <label>
            First Name
            </label><br>
            <input type="text" id="firstname" class="form-control" name="firstname"/><br>
            <label>
            Last Name
            </label><br>
            <input type="text" id="lastname" class="form-control" name="lastname"/><br>     
			<label>
            Email
            </label><br>
            <input type="text" id="email" class="form-control" name="email"/><br>
			<label>
            Landline
            </label><br>
            <input type="text" id="landline" class="form-control" name="landline"/><br>
            Mobile
            </label><br>
            <input type="text" id="mobile" class="form-control" name="mobile"/><br>                          
            <input type="submit" class="btn btn-default" value="Add Contact" onclick="return validate();"/>         
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