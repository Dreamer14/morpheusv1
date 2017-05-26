<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
  <html lang="en">
    
     <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>
        Welcome!
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
                    <a href="userController?user=admin">Add Admin</a>
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
    
    <div class="container">
    <br><br>
          <h1>
            Welcome, Administrator!
          </h1>
    </font>      
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
    </script>
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
    </script>
    
  </body>
</html>
