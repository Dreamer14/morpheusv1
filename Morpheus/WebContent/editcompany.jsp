<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        Morpheus Admin
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

<script type="text/javascript">

function validation(){

          var companyName=document.getElementById("companyname").value;
          
          var x = document.forms["myForm"]["email"].value;
          var atpos = x.indexOf("@");
          var dotpos = x.lastIndexOf(".");
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

    <body>
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
                    <a href="userController?user=editProducts">View or Edit Account</a>
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
          Edit Company
        </h1>
        <p class="lead">
        </p>
 
 <%
     Iterator<issueRecord> itr;
     ArrayList<issueRecord> issuelist=(ArrayList<issueRecord>)request.getAttribute("viewIssueList");

     if(issuelist!=null){
    	 for(itr=issuelist.iterator();itr.hasNext();){

    		 issueRecord su=new issueRecord();	
    	                 su=(issueRecord)itr.next();
  %>

<form action="userController?user=addcompanyRecordSucc" method="post">    
<div class="row">
        	<div class="col-md-6">
        	<input type="hidden" name="hiddenProductID" value="<%=su.getProductID()%>" class="form-control"/><br>
            <label>
            Company Name
            </label><br>
            <input type="text" name="jobtitle"  value="<%=su.getNameInventory()%>" class="form-control"/><br>
            <label>
            Email
            </label><br>
            <input type="text" id="email" name="email" value="<%=su.getEmail()%>" class="form-control"><br>
            <label>
            Password
            </label><br>
            <input type="text" id="password" name="password" value="<%=su.getPassword()%>" class="form-control"><br>
            </div></div>            
            <label>
            Address 1
            </label><br>
            <input type="text" id="address1" value="<%=su.getIssueDate()%>" class="form-control" name="address1"/><br>
            <label>
            Address 2
            </label><br>
            <input type="text" id="address2" value="<%=su.getIssueNoDay()%>" class="form-control" name="address2"><br>
            <label>
            Suburb
            </label><br>
            <input type="text" id="suburb" value="<%=su.getReturnDate()%>" class="form-control" name="suburb"/><br>
            <label>
            State
            </label><br>
            <input type="text" id="state" value="<%=su.getVersionOfInventory()%>" class="form-control" name="state"/><br>
			<label>
            Postcode
            </label><br>
            <input type="text" id="postcode" value="<%=su.getIssueToDepartment()%>" class="form-control" name="postcode"/><br>
            <label>
            ABN
            </label><br>
            <input type="text" id="abn" name="abn" value="<%=su.getAbn()%>" class="form-control"/><br>
            
      
<%}
   }%>

    
            <input type="submit" value="Update" class="btn btn-default" onclick="return validation();"/>
     
   </form>



	
	
	</div>  
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>  
	</font>

</body>
</html>