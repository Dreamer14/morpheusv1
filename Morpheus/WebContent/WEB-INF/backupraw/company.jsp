<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>



 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Company</title>

<script type="text/javascript">

  function validation(){
  
            var companyName=document.getElementById("companyname").value;
            var password=document.getElementById("password").value;
            var email=document.getElementById("email").value;
            var address1=document.getElementById("address1").value;
            var address2=document.getElementById("address2").value;
            var suburb=document.getElementById("suburb").value;
            var postcode=document.getElementById("postcode").value;
            var state=document.getElementById("state").value;
            var abn=document.getElementById("abn").value;
  
  if(companyName==""){

          alert("please fill the Company name.")
           return false;
  
         }
  if(password=="")
        {
      
         alert("please fill the password.");
          return false;
     }
  
  
  if(email==""){

      alert("please fill the Email.")
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
  
     <div style="margin:auto; border:0px solid  #0000CC; width:1000px; font-family:Arial, Helvetica, sans-serif;">
 <div style="float:left; border:0px solid  #0000CC; width:1000px;">




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
<li><a href="userController?user=viewcompany">View/edit Company</a></li>
</ul>
</div>
</li>




</ul>

    </div>
  
  
  </div>
  </div>
  
  
  
  
  
      
<form action="userController?user=addcompany" method="post" onsubmit="validation();">    

  <table cellpadding="0" cellspacing="0" border="0" align="center">

     
      
      
      <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Company Name:</b></td><td>
             <input type="text" id="companyname" name="companyname"></td>
      </tr>
      
      
       <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Password</b></td><td>
             <input type="text" id="companyname" name="password"></td>
      </tr>
      
       <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Email</b></td><td>
             <input type="text" id="email" name="email"></td>
      </tr>
      
      <tr>
             <td colspan="2" height="18"></td>

      </tr>
      <tr>
             <td><b>Address 1:</b></td><td>
             <input type="text" id="address1" name="address1"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>
       
      </tr>
      <tr>
             <td><b>Address 2:</b></td><td>
             <input type="text" id="address2" name="address2"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>
       
      </tr>
      <tr>
      
             <td><b>Suburb:</b></td>
             <td><input type="text" id="suburb" name="suburb"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
      
             <td><b>Postcode:</b></td>
             <td><input type="text" id="postcode" name="postcode"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      
      <tr>
      
             <td><b>State:</b></td>
             <td><input type="text" id="state" name="state"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
      
             <td><b>ABN:</b></td>
             <td><input type="text" id="abn" name="abn"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
             <td>         </td>
             <td align="right"><input type="submit" value="Add Company" onclick="return validation();"/></td>
      </tr>

     </table>
   </form>


<div style="float:left; border:0px solid #000000; height:60px; width:1005px; padding:20px 0 0 0px; background-color:#b7995d; color:#FFFFFF; font-family:Arial, Helvetica, sans-serif; text-align:center; font-size:12px; color:#FFFFFF; margin: 80px 0 0 0;">




          <div style="margin:0 0 0 50px; color:#FFFFFF; ">



               <a  href="#">Home</a>
               |	
              <a href="#">About Us</a>
               |
              <a  href="#">Support</a>
               |
               <a href="#">Development</a>
               |
              <a href="#">Conact Us</a>
</div>
                  <div id="" style="margin:0 0 0 50px;">&copy; Copyright Information Goes Here. All Rights Reserved.</div>


</div>

  </body>
</html>

