<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


     <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>
        Add Company
      </title>
      <link href="css/bootstrap.min.css"
      rel="stylesheet">
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Admins <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="userController?user=addadmin">Add Admin</a>
                  </li>
                  <li>
                    <a href="userController?user=editadmin">View or Edit Admins</a>
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
      
      <script type="text/javascript">

  function validation(){
  
            var companyName=document.getElementById("companyname").value;
            var x = document.forms["myForm"]["email"].value;
            var atpos = x.indexOf("@");
            var dotpos = x.lastIndexOf(".");
            var email=document.getElementById("email").value;
            var password=document.getElementById("password").value;
            var address1=document.getElementById("address1").value;
            var address2=document.getElementById("address2").value;
            var suburb=document.getElementById("suburb").value;
            var state=document.getElementById("state").value;
            var postcode=document.getElementById("postcode").value;
           
            var abn=document.getElementById("abn").value;
  
  if(companyName==""){

          alert("please fill the Company name.")
           return false;
  
         }
  
 
  
 
  if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
      alert("Not a valid e-mail address");
      return false;
  }
  if (password.length < 6 || !letter.test(password) || !number.test(password)) {
	  alert("Password must be atleast 6 characters long.");
      return false;
  }
  
if(address1=="")
    {
  
     alert("please fill the address properly.");
      return false;
 }
if(address2==""){

    alert("please fill the address properly.")
     return false;

   }
if(suburb=="")
  {

   alert("please fill the suburb.");
    return false;
}

if(postcode==""){

alert("please fill the postcode.")
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



 <div class="container">
      <div class="starter-template">
      <br>
      <br>
        <h1>
          Add Company
        </h1>
        <p class="lead">
        </p>
        <form action="userController?user=addcompany" name="myForm" method="post" onsubmit="validation();">
            <div class="row">
        	<div class="col-md-6">
        	<label>
            Company name
            </label><br>
            <input type="text" id="companyname" name="companyname" class="form-control"><br>
            <label>
            Email
            </label><br>
            <input type="text" id="email" name="email" class="form-control"><br>
            <label>
            Password
            </label><br>
            <input type="text" id="password" name="password" class="form-control"><br>
            </div></div>            
            <label>
            Address 1
            </label><br>
            <input type="text" id="address1" class="form-control" name="address1"/><br>
            <label>
            Address 2
            </label><br>
            <input type="text" id="address2" class="form-control" name="address2"><br>
            <label>
            Suburb
            </label><br>
            <input type="text" id="suburb" class="form-control" name="suburb"/><br>
            <label>
            State
            </label><br>
            <input type="text" id="state" class="form-control" name="state"/><br>
			<label>
            Postcode
            </label><br>
            <input type="text" id="postcode" class="form-control" name="postcode"/><br>
            <label>
            ABN
            </label><br>
            <input type="text" id="abn" name="abn" class="form-control"/><br>
            <input type="submit" class="btn btn-default" value="Add Company" onclick="return validation();"/>         
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

