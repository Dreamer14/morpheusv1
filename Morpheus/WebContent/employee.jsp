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
        Add Employee
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">
      

<script type="text/javascript">

  function validation(){
  
            var fname=document.getElementById("fname").value;
            var password=document.getElementById("password").value;
            var email=document.getElementById("email").value;
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
          Add Employee
        </h1>
        <p class="lead">
        </p>
        <form action="userController?user=addemployee" method="post" onsubmit="validation();">
            <div class="row">
        	<div class="col-md-6">
        	<label>
            First Name
            </label><br>
            <input type="text" id="fname" name="fname" class="form-control"><br>
            <label>
            Last Name
            </label><br>
            <input type="text" id="lname" class="form-control" name="lname"><br>
            </div></div>
            <label>
            Address
            </label><br>
            <input type="text" id="address" class="form-control" name="address"/><br>
			<label>
            Email
            </label><br>
            <input type="text" id="email" class="form-control" name="email"/><br>
            <label>
            Password
            </label><br>
            <input type="password" id="password" class="form-control" name="password"><br>
            
            
           
            <input type="submit" class="btn btn-default" value="Add Employee" onclick="return validation();"/>         
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

