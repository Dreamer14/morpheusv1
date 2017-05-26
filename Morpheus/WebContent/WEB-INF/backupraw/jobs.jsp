<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>



 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>

<script type="text/javascript">

  function validate(){
  
            var jobtitle=document.getElementById("jobtitle").value;
            var address1=document.getElementById("address1").value;
            var address2=document.getElementById("address2").value;
            var suburb=document.getElementById("suburb").value;
            var state=document.getElementById("state").value;
            var postcode=document.getElementById("postcode").value;
            
  
  if(userName==""){

          alert("please fill the username.")
           return false;
  
         }
  if(password=="")
        {
      
         alert("please fill the password.");
          return false;
     }
   return true;
  }
</script>

</head>







<body>
  
     <div style="float:center; border:1px solid #000000; width:100%;  font-family:Arial, Helvetica, sans-serif; font-size:25px; background-image:url(images/InsideBanner_2.png); height:100PX; background-repeat:no-repeat; text-align:right;">
              <span style="display:block; margin:90px 15px 0 0; font-weight:bold; color:#FFFFFF;"></span>
	 </div>







 <div align="right"><a href="userController?user=logout">logout</a></div>
  <div>
         <h2><center>Contacts</center></h2>
  </div>
      
<form action="userController?user=jobs" method="post">    

  <table cellpadding="0" cellspacing="0" border="0" align="center">

      <tr>
             <td><b>companyid:</b></td><td><input type="text" id="companyid" name="companyid"></td><br>
      </tr>
      <tr>
             <td><b>employeeid:</b></td><td><input type="text" id="employeeid" name="employeeid"></td>
      </tr>
             <td><b>Job Title:</b></td>
             <td><input type="text" id="jobtitle" name="jobtitle"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
            <td><b>Address1:</b></td><td><input type="text" id="address1" name="address1"/></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Address2::</b></td><td><input type="text" id="address2" name="address2"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>

      </tr>
      <tr>
             <td><b>Suburb:</b></td>
             <td><input type="text" id="suburb" name="suburb"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
     
      <tr>
             <td><b>State:</b></td>
             <td><input type="text" id="state" name="state"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
             
              <tr>
             <td><b>Post Code:</b></td>
             <td><input type="text" id="postcode" name="postcode"/></td></tr>
             <tr>
             
      <tr>
             <td colspan="2" height="18"></td>
      <tr>
             <td>         </td>
             <td align="right"><input type="submit" value="Submit" onclick="return validate();"/></td>
      </tr>

     </table>
   </form>


<div style="float:left; border:0px solid #000000; height:60px; width:1005px; padding:20px 0 0 0px; background-color:#b7995d; color:#FFFFFF; font-family:Arial, Helvetica, sans-serif; text-align:center; font-size:12px; color:#FFFFFF; margin: 80px 0 0 0;">




          
</div>

  </body>
</html>

