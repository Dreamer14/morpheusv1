<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>



 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up as User</title>

<script type="text/javascript">

  function validate(){
  
            var firstname=document.getElementById("firstname").value;
            var lastname=document.getElementById("lastname").value;
            var email=document.getElementById("email").value;
            var password=document.getElementById("password").value;
            
  
  if(email==""){

          alert("Please fill the email.")
           return false;
  
         }
  if(password=="")
        {
      
         alert("Please fill the password.");
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
         <h2><center>Sign Up as User</center></h2>
  </div>
      
<form action="userController?user=employee" method="post">    

  <table cellpadding="0" cellspacing="0" border="0" align="center">

      <tr>
             <td><b>First Name:</b></td>
             <td><input type="text" id="firstname" name="firstname"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
            <td><b>Last Name:</b></td><td><input type="text" id="lastname" name="lastname"/></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Email Address:</b></td><td><input type="text" name="email"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>

      </tr>
      <tr>
             <td><b>Password:</b></td>
             <td><input type="text" id="password" name="password"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
      <tr>
             <td><b>Account ID:</b></td>
             <td><input type="text" id="accountid" name="accountid"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
      <tr>
      <tr>
             <td>         </td>
             <td align="right"><input type="submit" value="Sign up as User" onclick="return validate();"/></td>
      </tr>

     </table>
   </form>


<div style="float:left; border:0px solid #000000; height:60px; width:1005px; padding:20px 0 0 0px; background-color:#b7995d; color:#FFFFFF; font-family:Arial, Helvetica, sans-serif; text-align:center; font-size:12px; color:#FFFFFF; margin: 80px 0 0 0;">




          
</div>

  </body>
</html>

