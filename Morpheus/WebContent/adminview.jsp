<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.morpheus.bean.adminview"%>
<%@page import="com.morpheus.*"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<html>
<head>

<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css" type="text/css" />

</head>
<body>


    <div style="margin:auto; border:0px solid  #0000CC; width:1000px; font-family:Arial, Helvetica, sans-serif;">
 <div style="float:left; border:0px solid  #0000CC; width:1000px;">

<div style="float:left; border:0px solid red; width:1000px;  font-family:Arial, Helvetica, sans-serif;  background-image:url(images/InsideBanner_234.png); height:150px; background-repeat:no-repeat; text-align:right;">
         <span style="display:block; margin:112px 15px 0 0; font-weight:bold; color:#FFFFFF; font-size:25px; text-align:center;">
			  Morpheus System</span>
 </div>


<div align="right"><a href="userController?user=logout">logout</a></div>


<div style="float:left; height:30px; width:1000px; border:0px solid #000000; font-size:15px; color:#b7995d;">
<b>welcome</b> </div>


<div style="float:left; border:0px solid #000000; background-color:#e9e7e6; width:1000px; height:46px; color:#FFFFFF;">
                
				<ul>
				<li>
				
				
				<div class="dc wid"> 
<a href="#" class="dc">Home</a>
<ul>

</ul>
</div>
</li>



<li>
				<div class="dc">
<a href="#" class="dc">Accounts</a>
<ul>

<li><a href="userController?user=addaccount">Add Account</a></li>
<li><a href="userController?user=editProduct">View/edit Accounts</a></li>

</ul>
</div>
</li>

<li>
				
				
				<div class="dc">
<a href="#" class="dc">Contacts</a>
<ul>
<li><a href="userController?user=addcontact">Add Contact</a></li>
<li><a href="userController?user=editProduct">View/edit Contacts</a></li>
</ul>
</div>
</li>


<li>
				
				
				<div class="dc">
<a href="#" class="dc">Jobs</a>
<ul>
<li><a href="userController?user=addjob">Add Job</a></li>
<li><a href="userController?user=editProduct">View/edit Jobs</a></li>
</ul>
</div>
</li>

<li>
				
				
				<div class="dc">
<a href="#" class="dc">Incidents</a>
<ul>
<li><a href="userController?user=addincident">Add Incident</a></li>
<li><a href="userController?user=editProduct">View/edit Incidents</a></li>
</ul>
</div>
</li>


<li>
				
				
				<div class="dc">
<a href="#" class="dc">Company</a>
<ul>
<li><a href="userController?user=company">Add Company</a></li>
<li><a href="userController?user=editProduct">View/edit Company</a></li>
</ul>
</div>
</li>




</ul>

    </div>
    
    <table>
 
    <tr>
        <td><b>Name</b>&nbsp;</td>
        <td><b>Comapny Name</b>&nbsp;</td>
        <td><b>Email</b>&nbsp;</td>
        <td><b>Account ID</b>&nbsp;</td>
        <td><b>Employee ID</b>&nbsp;</td>
      

    </tr>
    <%
     Iterator<adminview> itr;
     ArrayList<adminview> issueList=(ArrayList<adminview>)request.getAttribute("IssueList");

     if(issueList!=null){
    	 for(itr=issueList.iterator();itr.hasNext();){

    		 adminview su=new adminview();	
    	              su=(adminview)itr.next();
  %>
    
        <tr>
         <td><%=su.getProductID()%></td><td></td>
         <td><%=su.getIssueDate()%></td> <td></td>
         <td><%=su.getNameInventory()%>&nbsp;</td><td></td>
         <td><a href="userController?user=EditIssueRecord&productID=<%=su.getProductID()%>">Edit</a></td>
         <td></td>
         <td></td> 
         <td><a href="userController?user=deleteIssueRecord&productID=<%=su.getProductID()%>">Delete</a></td>
      </tr>
    <tr>  

     </tr>
  
<%} 
    	 
  } %>
    
    </table>

   <div style="float:left; border:1px solid #000000; height:60px; width:1000px; padding:20px 0 0 0px; background-color:#b7995d; color:#FFFFFF; font-family:Arial, Helvetica, sans-serif; text-align:center; font-size:12px; color:#FFFFFF; margin: 300px 0 0 0;">

      <div style="margin:0 0 0 50px; color:#FFFFFF; ">

               <a  href="#">Home</a>
                |	
               <a href="#">About Us</a>
                |
               <a  href="#">Support</a>
               |
               <a href="#">Development</a>
               |
              <a href="#">Contact Us</a>
   </div>
                  <div id="" style="margin:0 0 0 50px;">&copy; Copyright Information Goes Here. All Rights Reserved.</div>
  </div>
       </div>
     </div>
  </body>
</html>
