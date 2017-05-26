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
      View Jobs
      </title>
      <link href="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"
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
                  <li>
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
    <br><br>
          <h1>
            View Jobs
          </h1>
          
          
          <div class="container">
        <table class="table">
        <tbody>         
    <tr>
        <td><b>Job ID</b></td>
		<td><b>Company ID</b></td>
        <td><b>Employee ID</b></td>
        <td><b>Customer</b></td>
        <td><b>Job Title</b></td>
        <td><b>Description</b></td>
        <td><b>Date</b>&nbsp;</td>   
             <td></td> <td></td>
           
    </tr>
</tbody>

<%
     Iterator<issueRecord> itr;
     ArrayList<issueRecord> issueList=(ArrayList<issueRecord>)request.getAttribute("IssueList");

     if(issueList!=null){
    	 for(itr=issueList.iterator();itr.hasNext();){

    		 issueRecord su=new issueRecord();	
    	              su=(issueRecord)itr.next();
  %>
 
      <tr>
         <td><%=su.getProductID()%></td>
     
         
         
         <td><%=su.getNameInventory()%></td>
          <td><%=su.getEmail()%></td> 
           <td><%=su.getPassword()%></td>
         <td><%=su.getIssueDate()%></td> 
          <td><%=su.getIssueNoDay()%></td>
          <td><%=su.getReturnDate()%></td>     
         <td><a href="userController?user=EditjobRecord&productID=<%=su.getProductID()%>" class="btn btn-default">Edit</a></td>
         <td><a href="userController?user=deletejobRecord&productID=<%=su.getProductID()%>" class="btn btn-default">Delete</a></td>
      </tr>

  
<%} 
    	 
  } %>
  </table>

     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
    </script>
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
    </script>
    </div></div>

</body>
</html>