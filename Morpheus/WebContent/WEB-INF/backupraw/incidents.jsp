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
  
            var incidentid=document.getElementById("incidentid").value;
            var companyid=document.getElementById("companyid").value;
            var employeeid=document.getElementById("employeeid").value;
            
            
            
  
  if(incidentid==""){

          alert("please fill the incidentid.")
           return false;
  
         }
  if(companyid=="")
        {
      
         alert("please fill the companyid.");
          return false;
     }
  if(employeeid=="")
  {

   alert("please fill the employeeid.");
    return false;
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
         <h2>Incident Reports</h2>
  </div>
      
<form action="userController?user=incident" method="post">    

  <table cellpadding="0" cellspacing="0" border="0" align="center">

      
      
      <tr>
            <td><b>Company Id:</b></td><td>
            <input type="text" id="companyid" name="companyid"/></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td></tr>

      <tr>
             <td><b>Employee Id:</b></td><td>
             <input type="text" id="employeeid" name="employeeid"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>

      </tr>
      <tr>
             <td><b>Incident date:</b></td><td>
             <input type="text" id="incidentdate" name="date"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>
       
      </tr>
      <tr>
             <td><b>Severity level</b></td><td>
             <input type="text" id="severitylevel" name="level"></td>
      </tr>
      <tr>
             <td colspan="2" height="18"></td>
       
      </tr>
      <tr>
      
             <td><b>Address:</b></td>
             <td><input type="text" id="address" name="address"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
      
             <td><b>Persons Involved:</b></td>
             <td><input type="text" id="personsinvolved" name="involved"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      
      <tr>
      
             <td><b>Brief description:</b></td>
             <td><input type="text" id="briefdesc" name="description"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
      <tr>
      
             <td><b>Action Taken:</b></td>
             <td><input type="text" id="actiontaken" name="action"/></td></tr>
      <tr>
             <td colspan="2" height="18"></td>
  
      </tr>
     
      <tr>
             <td>         </td>
             <td align="left"><input type="file" value="Upload files" name="upload" /></td>
             <td align="right"><input type="submit" value="Lodge Report" onclick="return validate();"/></td>
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

