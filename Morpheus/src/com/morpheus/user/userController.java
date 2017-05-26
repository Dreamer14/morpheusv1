package com.morpheus.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.morpheus.bean.addProduct;
import com.morpheus.bean.department;
import com.morpheus.bean.issueRecord;
import com.morpheus.bean.measureMent;
import com.morpheus.bean.purchaseRecord;
import com.morpheus.bean.userBean;
import com.morpheus.bean.userCreditional;

/**
 * Servlet implementation class userController
 */
@WebServlet("/userController")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	com.morpheus.util.userControllerUtil controllerUtil=null; 
	userBean  beanObj=new userBean();
	
	userCreditional userLogin= new userCreditional();
	
	
	
	public userCreditional getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(userCreditional userLogin) {
		this.userLogin = userLogin;
	}
	
	
	purchaseRecord purRecord=new purchaseRecord();
issueRecord isseRecord=new issueRecord();
	addProduct addProduct=new addProduct();
	
 ArrayList<addProduct> addproductlist=null;	
 ArrayList<department> departmentList=null;
 ArrayList<measureMent> measureMentList=null;
 
 
 
	
	
	
public ArrayList<measureMent> getMeasureMentList() {
	return measureMentList;
}

public void setMeasureMentList(ArrayList<measureMent> measureMentList) {
	this.measureMentList = measureMentList;
}

public ArrayList<department> getDepartmentList() {
	return departmentList;
}

public void setDepartmentList(ArrayList<department> departmentList) {
	this.departmentList = departmentList;
}

public ArrayList<addProduct> getAddproductlist() {
	return addproductlist;
}

public void setAddproductlist(ArrayList<addProduct> addproductlist) {
	this.addproductlist = addproductlist;
}

public addProduct getAddProduct() {
		return addProduct;
	}

	public void setAddProduct(addProduct addProduct) {
		this.addProduct = addProduct;
	}


ArrayList<purchaseRecord> purlist=null;	
   
   ArrayList<issueRecord> issuelist=null;
	
       
    public ArrayList<issueRecord> getIssuelist() {
	return issuelist;
  }

public void setIssuelist(ArrayList<issueRecord> issuelist) {
	this.issuelist = issuelist;
  }

	public ArrayList<purchaseRecord> getPurlist() {
	return purlist;
}

public void setPurlist(ArrayList<purchaseRecord> purlist) {
	this.purlist = purlist;
}

	public issueRecord getIsseRecord() {
		return isseRecord;
	}

	public void setIsseRecord(issueRecord isseRecord) {
		this.isseRecord = isseRecord;
	}

	public purchaseRecord getPurRecord() {
		return purRecord;
	}

	public void setPurRecord(purchaseRecord purRecord) {
		this.purRecord = purRecord;
	}

	public userBean getBeanObj() {
		return beanObj;
	}

	public void setBeanObj(userBean beanObj) {
		this.beanObj = beanObj;
	}

	public com.morpheus.util.userControllerUtil getControllerUtil() {
		return controllerUtil;
	}

	public void setControllerUtil(
			com.morpheus.util.userControllerUtil controllerUtil) {
		this.controllerUtil = controllerUtil;
	}

	
	
    public userController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request,HttpServletResponse response){
		 
        System.out.println("Enter into Process Request method");
         
         String userInfo=request.getParameter("user");
         
     System.out.println("value of userInfo is"+userInfo);  
     
     if(userInfo.equalsIgnoreCase("addcompanyRecordSucc")){
    		
  	   System.out.println("Enter into add Issue record method");
  	    
  	   boolean flag=false;
  	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
	   
  	 
     String job=request.getParameter("jobtitle");
     String email=request.getParameter("email");
     String password=request.getParameter("password");
     String address1=request.getParameter("address1");
     String address2=request.getParameter("address2");
     String suburb=request.getParameter("suburb");
     String state=request.getParameter("state");
     String postcode=request.getParameter("postcode");
     String abn=request.getParameter("abn");
     
     System.out.println("fffffffffffff"+postcode);
     System.out.println("mmmmmmmmmmmm"+abn);
  	   
    	   
  	   try {
  		   
  		   
  		   flag=controllerUtil.addIssueRecord(job,email,password,address1, address2, suburb, state, postcode, abn, productID);
  		   System.out.println("fffffffffffff"+flag);
  		   if(flag==true){
  			   

  			   
  			   
  			 issuelist=controllerUtil.getAllIssueRecord();
  	  	      
  	  	      System.out.println("size of list is"+issuelist.size());  
  	  	    
  	  	    request.setAttribute("IssueList", issuelist);
  	  	      
  	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
  	  	   dispatcher.forward(request, response);   
  	  	   
  	  		// response.sendRedirect("purchaseRecord.jsp");
  	  	   
  			   
  			   
  			   
  			   
  			   
  			   
  			   
  		       }
  		   else {
  			 issuelist=controllerUtil.getAllIssueRecord();
 	  	      
 	  	      System.out.println("size of list is"+issuelist.size());  
 	  	    
 	  	    request.setAttribute("IssueList", issuelist);
 	  	      
 	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
 	  	   dispatcher.forward(request, response);   
  		         }
  		     } 
  	    catch (Exception e) {
  		         e.printStackTrace();
  	    }
   	 }
     
     if(userInfo.equalsIgnoreCase("addadminRecordSucc")){
 		
    	   System.out.println("Enter into add Issue record method");
    	    
    	   boolean flag=false;
    	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
  	   
    	 
       String job=request.getParameter("jobtitle");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       String address1=request.getParameter("address1");
       String address2=request.getParameter("address2");
       
       
      
    	   
      	   
    	   try {
    		   
    		   
    		   flag=controllerUtil.addadminRecord(job,email,password,address1, address2, productID);
    		   System.out.println("fffffffffffff"+flag);
    		   if(flag==true){
    			   

    			   
    			   
    			 issuelist=controllerUtil.getAlladminRecord();
    	  	      
    	  	      System.out.println("size of list is"+issuelist.size());  
    	  	    
    	  	    request.setAttribute("IssueList", issuelist);
    	  	      
    	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
    	  	   dispatcher.forward(request, response);   
    	  	   
    	  		// response.sendRedirect("purchaseRecord.jsp");
    	  	   
    			   
    			   
    			   
    			   
    			   
    			   
    			   
    		       }
    		   else {
    			 issuelist=controllerUtil.getAlladminRecord();
   	  	      
   	  	      System.out.println("size of list is"+issuelist.size());  
   	  	    
   	  	    request.setAttribute("IssueList", issuelist);
   	  	      
   	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
   	  	   dispatcher.forward(request, response);   
    		         }
    		     } 
    	    catch (Exception e) {
    		         e.printStackTrace();
    	    }
     	 }
     
     
     if(userInfo.equalsIgnoreCase("addincidentRecordSucc")){
 		
    	   System.out.println("Enter into add Issue record method");
    	    
    	   boolean flag=false;
    	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
  	   
    	 
       String job=request.getParameter("jobtitle");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       String address1=request.getParameter("address1");
       String address2=request.getParameter("address2");
       String suburb=request.getParameter("suburb");
       String state=request.getParameter("state");
       String postcode=request.getParameter("postcode");
       String abn=request.getParameter("abn");
       
       System.out.println("fffffffffffff"+postcode);
       System.out.println("mmmmmmmmmmmm"+abn);
    	   
      	   
    	   try {
    		   
    		   
    		   flag=controllerUtil.addincidentRecord(job,email,password,address1, address2, suburb, state, postcode, abn, productID);
    		   System.out.println("fffffffffffff"+flag);
    		   if(flag==true){
    			   

    			   
    			   
    			 issuelist=controllerUtil.getAllincidentRecord();
    	  	      
    	  	      System.out.println("size of list is"+issuelist.size());  
    	  	    
    	  	    request.setAttribute("IssueList", issuelist);
    	  	      
    	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
    	  	   dispatcher.forward(request, response);   
    	  	   
    	  		// response.sendRedirect("purchaseRecord.jsp");
    	  	   
    			   
    			   
    			   
    			   
    			   
    			   
    			   
    		       }
    		   else {
    			   issuelist=controllerUtil.getAllincidentRecord();
     	  	      
     	  	      System.out.println("size of list is"+issuelist.size());  
     	  	    
     	  	    request.setAttribute("IssueList", issuelist);
     	  	      
     	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
     	  	   dispatcher.forward(request, response);   
     	  	   
    		         }
    		     } 
    	    catch (Exception e) {
    		         e.printStackTrace();
    	    }
     	 }
       
     if(userInfo.equalsIgnoreCase("addincidentsRecordSucc")){
  		
  	   System.out.println("Enter into add Issue record method");
  	    
  	   boolean flag=false;
  	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
	   
  	 
     String job=request.getParameter("jobtitle");
     String email=request.getParameter("email");
     String password=request.getParameter("password");
     String address1=request.getParameter("address1");
     String address2=request.getParameter("address2");
     String suburb=request.getParameter("suburb");
     String state=request.getParameter("state");
     String postcode=request.getParameter("postcode");
     String abn=request.getParameter("abn");
     
     System.out.println("fffffffffffff"+postcode);
     System.out.println("mmmmmmmmmmmm"+abn);
  	   
    	   
  	   try {
  		   
  		   
  		   flag=controllerUtil.addincidentRecord(job,email,password,address1, address2, suburb, state, postcode, abn, productID);
  		   System.out.println("fffffffffffff"+flag);
  		   if(flag==true){
  			   

  			   
  			   
  			 issuelist=controllerUtil.getAllincidentRecord();
  	  	      
  	  	      System.out.println("size of list is"+issuelist.size());  
  	  	    
  	  	    request.setAttribute("IssueList", issuelist);
  	  	      
  	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidentss.jsp");
  	  	   dispatcher.forward(request, response);   
  	  	   
  	  		// response.sendRedirect("purchaseRecord.jsp");
  	  	   
  			   
  			   
  			   
  			   
  			   
  			   
  			   
  		       }
  		   else {
  			   issuelist=controllerUtil.getAllincidentRecord();
   	  	      
   	  	      System.out.println("size of list is"+issuelist.size());  
   	  	    
   	  	    request.setAttribute("IssueList", issuelist);
   	  	      
   	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidentss.jsp");
   	  	   dispatcher.forward(request, response);   
   	  	   
  		         }
  		     } 
  	    catch (Exception e) {
  		         e.printStackTrace();
  	    }
   	 }
     
     
     
     
     
     if(userInfo.equalsIgnoreCase("addjobRecordSucc")){
 		
    	   System.out.println("Enter into add Issue record method");
    	    
    	   boolean flag=false;
    	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
  	   
    	 
       String job=request.getParameter("jobtitle");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       String address1=request.getParameter("address1");
       String address2=request.getParameter("address2");
       String suburb=request.getParameter("suburb");
      
       
      
    	   
      	   
    	   try {
    		   
    		   
    		   flag=controllerUtil.addJobRecord(job,email,password,address1, address2, suburb, productID);
    		   System.out.println("fffffffffffff"+flag);
    		   if(flag==true){
    			   

    			   
    			   
    			 issuelist=controllerUtil.getAlljobRecord();
    	  	      
    	  	      System.out.println("size of list is"+issuelist.size());  
    	  	    
    	  	    request.setAttribute("IssueList", issuelist);
    	  	      
    	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
    	  	   dispatcher.forward(request, response);   
    	  	   
    	  		// response.sendRedirect("purchaseRecord.jsp");
    	  	   
    			   
    			   
    			   
    			   
    			   
    			   
    			   
    		       }
    		   else {
    			   issuelist=controllerUtil.getAlljobRecord();
     	  	      
     	  	      System.out.println("size of list is"+issuelist.size());  
     	  	    
     	  	    request.setAttribute("IssueList", issuelist);
     	  	      
     	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
     	  	   dispatcher.forward(request, response);  
    		         }
    		     } 
    	    catch (Exception e) {
    		         e.printStackTrace();
    	    }
     	 }
     if(userInfo.equalsIgnoreCase("addjobsRecordSucc")){
  		
  	   System.out.println("Enter into add Issue record method");
  	    
  	   boolean flag=false;
  	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
	   
  	 
     String job=request.getParameter("jobtitle");
     String email=request.getParameter("email");
     String password=request.getParameter("password");
     String address1=request.getParameter("address1");
     String address2=request.getParameter("address2");
     String suburb=request.getParameter("suburb");
    
     
    
  	   
    	   
  	   try {
  		   
  		   
  		   flag=controllerUtil.addJobRecord(job,email,password,address1, address2, suburb, productID);
  		   System.out.println("fffffffffffff"+flag);
  		   if(flag==true){
  			   

  			   
  			   
  			 issuelist=controllerUtil.getAlljobRecord();
  	  	      
  	  	      System.out.println("size of list is"+issuelist.size());  
  	  	    
  	  	    request.setAttribute("IssueList", issuelist);
  	  	      
  	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
  	  	   dispatcher.forward(request, response);   
  	  	   
  	  		// response.sendRedirect("purchaseRecord.jsp");
  	  	   
  			   
  			   
  			   
  			   
  			   
  			   
  			   
  		       }
  		   else {
  			   issuelist=controllerUtil.getAlljobRecord();
   	  	      
   	  	      System.out.println("size of list is"+issuelist.size());  
   	  	    
   	  	    request.setAttribute("IssueList", issuelist);
   	  	      
   	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
   	  	   dispatcher.forward(request, response);  
  		         }
  		     } 
  	    catch (Exception e) {
  		         e.printStackTrace();
  	    }
   	 }
     
     
     
     if(userInfo.equalsIgnoreCase("addempRecordSucc")){
 		
    	   System.out.println("Enter into add Issue record method");
    	    
    	   boolean flag=false;
    	 int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
  	   
    	 
       String job=request.getParameter("jobtitle");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       String address1=request.getParameter("address1");
       String address2=request.getParameter("address2");
       String suburb=request.getParameter("suburb");
      
    	   
      	   
    	   try {
    		   
    		   
    		   flag=controllerUtil.addEmpRecord(job,email,password,address1, address2, suburb, productID);
    		   System.out.println("fffffffffffff"+flag);
    		   if(flag==true){
    			   

    			   
    			   
    			 issuelist=controllerUtil.getAllempRecord();
    	  	      
    	  	      System.out.println("size of list is"+issuelist.size());  
    	  	    
    	  	    request.setAttribute("IssueList", issuelist);
    	  	      
    	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
    	  	   dispatcher.forward(request, response);   
    	  	   
    	  		// response.sendRedirect("purchaseRecord.jsp");
    	  	   
    			   
    			   
    			   
    			   
    			   
    			   
    			   
    		       }
    		   else {
    			   issuelist=controllerUtil.getAllempRecord();
     	  	      
     	  	      System.out.println("size of list is"+issuelist.size());  
     	  	    
     	  	    request.setAttribute("IssueList", issuelist);
     	  	      
     	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
     	  	   dispatcher.forward(request, response);  
    		         }
    		     } 
    	    catch (Exception e) {
    		         e.printStackTrace();
    	    }
     	 }
       
       
     
     
     
     
     if(userInfo.equalsIgnoreCase("EditCompanyRecord")){
    		
    	    String ID=request.getParameter("productID").toString();
    	    
    	    int ids=Integer.parseInt(ID);
    	    
    	     
    	 try {
    		
    		 issuelist=controllerUtil.editIssueRecord(ids);
    		 
    	     request.setAttribute("viewIssueList", issuelist);
    		
    	   
    	   
    	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editcompany.jsp");
    	   dispatcher.forward(request, response);
    	   
    	   
    	  
    	    } 
    	catch (Exception e) {
    		 e.printStackTrace();
    	    	} 
    	    }
     
     if(userInfo.equalsIgnoreCase("EditadminRecord")){
 		
 	    String ID=request.getParameter("productID").toString();
 	    
 	    int ids=Integer.parseInt(ID);
 	    
 	     
 	 try {
 		
 		 issuelist=controllerUtil.editadminRecord(ids);
 		 
 	     request.setAttribute("viewIssueList", issuelist);
 		
 	   
 	   
 	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editadmin.jsp");
 	   dispatcher.forward(request, response);
 	   
 	   
 	  
 	    } 
 	catch (Exception e) {
 		 e.printStackTrace();
 	    	} 
 	    }
     if(userInfo.equalsIgnoreCase("EditincidentRecord")){
 		
 	    String ID=request.getParameter("productID").toString();
 	    
 	    int ids=Integer.parseInt(ID);
 	    
 	     
 	 try {
 		
 		 issuelist=controllerUtil.editincidentRecord(ids);
 		 
 	     request.setAttribute("viewIssueList", issuelist);
 		
 	   
 	   
 	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editincident.jsp");
 	   dispatcher.forward(request, response);
 	   
 	   
 	  
 	    } 
 	catch (Exception e) {
 		 e.printStackTrace();
 	    	} 
 	    }

     if(userInfo.equalsIgnoreCase("EditincidentsRecord")){
  		
  	    String ID=request.getParameter("productID").toString();
  	    
  	    int ids=Integer.parseInt(ID);
  	    
  	     
  	 try {
  		
  		 issuelist=controllerUtil.editincidentRecord(ids);
  		 
  	     request.setAttribute("viewIssueList", issuelist);
  		
  	   
  	   
  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editincidents.jsp");
  	   dispatcher.forward(request, response);
  	   
  	   
  	  
  	    } 
  	catch (Exception e) {
  		 e.printStackTrace();
  	    	} 
  	    }

      
     if(userInfo.equalsIgnoreCase("EditEmpRecord")){
 		
 	    String ID=request.getParameter("productID").toString();
 	    
 	    int ids=Integer.parseInt(ID);
 	    
 	     
 	 try {
 		
 		 issuelist=controllerUtil.editempRecord(ids);
 		 
 	     request.setAttribute("viewIssueList", issuelist);
 		
 	   
 	   
 	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editemployee.jsp");
 	   dispatcher.forward(request, response);
 	   
 	   
 	  
 	    } 
 	catch (Exception e) {
 		 e.printStackTrace();
 	    	} 
 	    }

  
     if(userInfo.equalsIgnoreCase("EditjobRecord")){
  		
  	    String ID=request.getParameter("productID").toString();
  	    
  	    int ids=Integer.parseInt(ID);
  	    
  	     
  	 try {
  		
  		 issuelist=controllerUtil.editjobRecord(ids);
  		 
  	     request.setAttribute("viewIssueList", issuelist);
  		
  	   
  	   
  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editjob.jsp");
  	   dispatcher.forward(request, response);
  	   
  	   
  	  
  	    } 
  	catch (Exception e) {
  		 e.printStackTrace();
  	    	} 
  	    }
     if(userInfo.equalsIgnoreCase("EditjobRecords")){
   		
   	    String ID=request.getParameter("productID").toString();
   	    
   	    int ids=Integer.parseInt(ID);
   	    
   	     
   	 try {
   		
   		 issuelist=controllerUtil.editjobRecord(ids);
   		 
   	     request.setAttribute("viewIssueList", issuelist);
   		
   	   
   	   
   	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editjobs.jsp");
   	   dispatcher.forward(request, response);
   	   
   	   
   	  
   	    } 
   	catch (Exception e) {
   		 e.printStackTrace();
   	    	} 
   	    }
      
     
     if(userInfo.equalsIgnoreCase("viewcompany")){

  	   System.out.println("enter into IssueRecord jsp for list the record>>>>>>>>>>>");    
  	   
  	   HttpSession sessoin=request.getSession(true);
  	   
  	
  try {
  	      issuelist=controllerUtil.getAllIssueRecord();
  	      
  	      System.out.println("size of list is"+issuelist.size());  
  	    
  	    request.setAttribute("IssueList", issuelist);
  	      
  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
  	   dispatcher.forward(request, response);   
  	   
  		// response.sendRedirect("purchaseRecord.jsp");
  	   } 
  	
  	 catch (Exception e) {
  	    }
     }
     
     if(userInfo.equalsIgnoreCase("viewemployee")){

    	   System.out.println("enter into IssueRecord jsp for list the record>>>>>>>>>>>");    
    	   
    	   HttpSession sessoin=request.getSession(true);
    	   
    	
    try {
    	      issuelist=controllerUtil.getAllempRecord();
    	      
    	      System.out.println("size of list is"+issuelist.size());  
    	    
    	    request.setAttribute("IssueList", issuelist);
    	      
    	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
    	   dispatcher.forward(request, response);   
    	   
    		// response.sendRedirect("purchaseRecord.jsp");
    	   } 
    	
    	 catch (Exception e) {
    	    }
       }
       
     
     
     if(userInfo.equalsIgnoreCase("loginUser")){
    	 
	     System.out.println("Enter into login user method");
	     
	     HttpSession sessoin=request.getSession(true);
	  
	   boolean flag=false;     
	   String emailID=request.getParameter("email");
  	   String password=request.getParameter("password");
  	   
  	   
  	 userLogin.setUserName(emailID);
  	 userLogin.setPassword(password);
  	 
  	           sessoin.setAttribute("userEmail", userLogin);
  	   
  	   System.out.println("email ID of user is"+emailID+"password is>>"+password);  
  	   
  	   
  	try {
		
  		    flag=controllerUtil.checkUser(emailID,password);
  		 
  		if(flag==true){
  			 
  			   System.out.println("Enter into if part when login"+flag);	
  			   
  			
  	          RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/userAccount.jsp");
  	          dipatcher.forward(request, response);
  			 
  		   }
  		else{
  			  System.out.println("Enter into else part when else part");
  			  
  			 
 			   String dataD="UserName and password not match with database."; 
			   
			   request.setAttribute("wrongUserName", dataD);
  			  
  			 
  			  RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/index.jsp");
	          dipatcher.forward(request,response);
  			
  		    }
  	    } 
  	   catch (Exception e) {
	 	    e.printStackTrace();
      	}
  	  }

     
     if(userInfo.equalsIgnoreCase("logincompany")){
    	 
	     System.out.println("Enter into login user method");
	     
	     HttpSession sessoin=request.getSession(true);
	  
	   boolean flag=false;     
	   String emailID=request.getParameter("email");
  	   String password=request.getParameter("password");
  	   
  	   
  	 userLogin.setUserName(emailID);
  	 userLogin.setPassword(password);
  	 
  	           sessoin.setAttribute("userEmail", userLogin);
  	   
  	   System.out.println("email ID of user is"+emailID+"password is>>"+password);  
  	   
  	   
  	try {
		
  		    flag=controllerUtil.checkcompany(emailID,password);
  		 
  		if(flag==true){
  			 
  			   System.out.println("Enter into if part when login"+flag);	
  			   
  			 issuelist=controllerUtil.getAllIssueRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
  	          RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/userCompany.jsp");
  	          dipatcher.forward(request, response);
  			 
  		   }
  		else{
  			  System.out.println("Enter into else part when else part");
  			  
  			 
 			   String dataD="UserName and password not match with database."; 
			   
			   request.setAttribute("wrongUserName", dataD);
  			  
  			 
  			  RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/index.jsp");
	          dipatcher.forward(request,response);
  			
  		    }
  	    } 
  	   catch (Exception e) {
	 	    e.printStackTrace();
      	}
  	  }
    
 if(userInfo.equalsIgnoreCase("loginemployee")){
    	 
	     System.out.println("Enter into login user method");
	     
	     HttpSession sessoin=request.getSession(true);
	  
	   boolean flag=false;     
	   String emailID=request.getParameter("email");
  	   String password=request.getParameter("password");
  	   
  	   
  	 userLogin.setUserName(emailID);
  	 userLogin.setPassword(password);
  	 
  	           sessoin.setAttribute("userEmail", userLogin);
  	   
  	   System.out.println("email ID of user is"+emailID+"password is>>"+password);  
  	   
  	   
  	try {
		
  		    flag=controllerUtil.checkemployee(emailID,password);
  		 
  		if(flag==true){
  			 
  			   System.out.println("Enter into if part when login"+flag);	
  			   
  			 issuelist=controllerUtil.getAllIssueRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
  	          RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/userEmployee.jsp");
  	          dipatcher.forward(request, response);
  			 
  		   }
  		else{
  			  System.out.println("Enter into else part when else part");
  			  
  			 
 			   String dataD="UserName and password not match with database."; 
			   
			   request.setAttribute("wrongUserName", dataD);
  			  
  			 
  			  RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/index.jsp");
	          dipatcher.forward(request,response);
  			
  		    }
  	    } 
  	   catch (Exception e) {
	 	    e.printStackTrace();
      	}
  	  }
    
     
     
     
     if(userInfo.equalsIgnoreCase("registerUser")){
    	 boolean flag=false;
    	
	       String fname=request.getParameter("fname");
	       String lname=request.getParameter("lname");
	       String email=request.getParameter("Email");
	       String password=request.getParameter("password");
	      
  try {
	    	 
	  flag=controllerUtil.user(fname,lname,email,password);
	   
	   if(flag==true){
		   
		   response.sendRedirect("userAccount.jsp");
		   
	       }
	   else {
		   response.sendRedirect("userAccount.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }

     
     
     if(userInfo.equalsIgnoreCase("contact")){
    	 boolean flag=false;
    	 String companyid=request.getParameter("companyid");
	       String fname=request.getParameter("firstname");
	       String lname=request.getParameter("lastname");
	       String email=request.getParameter("email");
	       String land=request.getParameter("landline");
	       String mobile=request.getParameter("mobile");
	       
	       
	      
  try {
	    	 
	  flag=controllerUtil.contact(companyid,fname,lname,email,land, mobile);
	   
	   if(flag==true){
		   
		   response.sendRedirect("userAccount.jsp");
		   
	       }
	   else {
		   response.sendRedirect("userAccount.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }

     if(userInfo.equalsIgnoreCase("addemployee")){
    	 boolean flag=false;
    	
	       String fname=request.getParameter("fname");
	       String lname=request.getParameter("lname");
	       String address=request.getParameter("address");
	       String email=request.getParameter("email");
	       String password=request.getParameter("password");
	       String companyid=request.getParameter("accountid");
	       System.out.println("gggggggggggggggg"+password);
	       
	      
  try {
	    	 
	  flag=controllerUtil.employee(fname,lname,address,email,password,companyid);
	   
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAllempRecord();
 	      
 	      System.out.println("size of list is"+issuelist.size());  
 	    
 	    request.setAttribute("IssueList", issuelist);
 	      
 	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
 	   dispatcher.forward(request, response);   
	       }
	   else {
		   response.sendRedirect("employee.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }

     if(userInfo.equalsIgnoreCase("incident")){
    	 boolean flag=false;
    	
	       String companyid=request.getParameter("companyid");
	       String empid=request.getParameter("employeeid");
	       String date=request.getParameter("date");
	       String level=request.getParameter("level");
	       String address=request.getParameter("address");
	       String invloved=request.getParameter("involved");
	       String description=request.getParameter("description");
	       String action=request.getParameter("action");
	       String upload=request.getParameter("upload");
	       
	       
	      
  try {
	    	 
	  flag=controllerUtil.incident(companyid,empid,date,level,address,invloved, description, action,upload);
	   
	   if(flag==true){
		   

		   issuelist=controllerUtil.getAllincidentRecord();
 	      
 	      System.out.println("size of list is"+issuelist.size());  
 	    
 	    request.setAttribute("IssueList", issuelist);
 	      
 	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
 	   dispatcher.forward(request, response);   
		   
	       }
	   else {
		   response.sendRedirect("userAccount.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }


     
     if(userInfo.equalsIgnoreCase("jobs")){
    	 boolean flag=false;
    	
	       String companyid=request.getParameter("companyid");
	       String empid=request.getParameter("employeeid");
	       String job=request.getParameter("jobtitle");
	       String address1=request.getParameter("address1");
	       String address2=request.getParameter("address2");
	       String suburb=request.getParameter("suburb");
	       
	       
	       
	      
  try {
	    	 
	  flag=controllerUtil.job(companyid,empid,job,address1,address2,suburb);
	   
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAlljobRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
	  	   dispatcher.forward(request, response);  
		   
	       }
	   else {
		   response.sendRedirect("jobs.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }

     if(userInfo.equalsIgnoreCase("addcompany")){
    	 boolean flag=false;
    	
	       
	      
	       String job=request.getParameter("companyname");
	       String email=request.getParameter("email");
	       String password=request.getParameter("password");
	       String address1=request.getParameter("address1");
	       String address2=request.getParameter("address2");
	       String suburb=request.getParameter("suburb");
	       String state=request.getParameter("state");
	       String postcode=request.getParameter("postcode");
	       String abn=request.getParameter("abn");
	       String logo=request.getParameter("logo");
	       
	       
	       
	      
  try {
	    	 
	  flag=controllerUtil.company(job,email,password,address1,address2,suburb, state, postcode,abn,logo);
	   
	   if(flag==true){
		   issuelist=controllerUtil.getAllIssueRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
	  	   dispatcher.forward(request, response);  
	       }
	   else {
		   response.sendRedirect("company.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }
     if(userInfo.equalsIgnoreCase("addadmin")){
    	 boolean flag=false;
    	
	       
	      
	       String job=request.getParameter("companyname");
	       String email=request.getParameter("email");
	       String password=request.getParameter("password");
	       String address1=request.getParameter("address1");
	       String address2=request.getParameter("address2");
	      
  try {
	    	 
	  flag=controllerUtil.admin(job,email,password,address1,address2);
	   
	   if(flag==true){
		   issuelist=controllerUtil.getAlladminRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
	  	   dispatcher.forward(request, response);  
	       }
	   else {
		   response.sendRedirect("company.jsp");
	         }
	     } 
  catch (Exception e) {
		       e.printStackTrace();
	         }
	      }

    


if(userInfo.equalsIgnoreCase("registerUserSucc")){
	  
	       System.out.println("enter into registerUserSucc method");
	     
	       
	       //String userName=beanObj.getUserName();
	       //String password=beanObj.getPassword();
	       //String emailID=beanObj.getEmail();
	       
	       
	       String accName=request.getParameter("accName");
	       String emailID=request.getParameter("emailID");
	       String fname=request.getParameter("fname");
	       String lname=request.getParameter("lname");
	       String password=request.getParameter("password");
	       
	       
	       System.out.println("us11111er Name of>>>>"+accName+">>>password of>>"+password+">>>>email id of"+emailID);
	    
	       beanObj.setUserName(accName);
	       beanObj.setUserName(password);
	       beanObj.setUserName(emailID);
	       beanObj.setUserName(fname);
	       beanObj.setUserName(lname);
	       
	     System.out.println("value from object"+beanObj.getUserName());  
	       
	       
	       System.out.println("user Name of>>>>"+accName+">>>password of>>"+password+">>>>email id of"+emailID);
	       
    try {
	    	   
	    	   com.morpheus.util.userControllerUtil  user=new com.morpheus.util.userControllerUtil(accName,password,emailID,fname,lname);
	        	
	    	   
	    	  RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/index.jsp"); 
	    	  dispatcher.forward(request, response);
	    	   
	    	   
	    	   //response.sendRedirect("index.jsp");	
		
	        } 
    catch (Exception e) {
  		       e.printStackTrace();
	         }
	      }

if(userInfo.equalsIgnoreCase("loginUser")){
	 
	     System.out.println("Enter into login user method");
	     
	     HttpSession sessoin=request.getSession(true);
	  
	   boolean flag=false;     
	   String emailID=request.getParameter("email");
 	   String password=request.getParameter("password");
 	   
 	   
 	 userLogin.setUserName(emailID);
 	 userLogin.setPassword(password);
 	 
 	           sessoin.setAttribute("userEmail", userLogin);
 	   
 	   System.out.println("email ID of user is"+emailID+"password is>>"+password);  
 	   
 	   
 	try {
		
 		    flag=controllerUtil.checkUser(emailID,password);
 		 
 		if(flag==true){
 			 
 			   System.out.println("Enter into if part when login"+flag);	
 			   
 			
 	          RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/userAccount.jsp");
 	          dipatcher.forward(request, response);
 			 
 		   }
 		else{
 			  System.out.println("Enter into else part when else part");
 			  
 			 
			   String dataD="UserName and password not match with database."; 
			   
			   request.setAttribute("wrongUserName", dataD);
 			  
 			 
 			  RequestDispatcher dipatcher=getServletContext().getRequestDispatcher("/index.jsp");
	          dipatcher.forward(request,response);
 			
 		    }
 	    } 
 	   catch (Exception e) {
	 	    e.printStackTrace();
     	}
 	  }


if(userInfo.equalsIgnoreCase("purchaseRecord")){
	
	   System.out.println("enter into purchase record jsp for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
 try {
	     
	      
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/purchaseRecord.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		
   	}
	}

if(userInfo.equalsIgnoreCase("purchaseRecordReport")){
	
	   System.out.println("enter into purchase record jsp for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/purchaseRecordReport.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		
	}
	}


if(userInfo.equalsIgnoreCase("IssueRecord")){

	   System.out.println("enter into IssueRecord jsp for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
  try {
	     
	      
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/issueRecord.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	
	 catch (Exception e) {
	    }
     }

if(userInfo.equalsIgnoreCase("IssueRecordReport")){

	   System.out.println("enter into IssueRecord jsp for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	     
	      
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/issueRecorReport.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	
	 catch (Exception e) {
	    }
  }
if(userInfo.equalsIgnoreCase("logout")){
	
	 try {
		
	      response.sendRedirect("index.jsp");
		 
		 
	     } 
	 catch (Exception e) {
		   e.printStackTrace();
	    }
	   }
if(userInfo.equalsIgnoreCase("addaccount")){
	
	    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
	  
	try {
		 
		
		     
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/account.jsp");
		   dispatcher.forward(request, response);   
		  
		      //response.sendRedirect("addIssueRecord.jsp");
	      } catch (Exception e) {
		          e.printStackTrace();
	      }
	
     }
if(userInfo.equalsIgnoreCase("addcontact")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/contact.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }
if(userInfo.equalsIgnoreCase("addincident")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/incidents.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }

if(userInfo.equalsIgnoreCase("addincidents")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/incidentss.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }


if(userInfo.equalsIgnoreCase("addjob")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/jobs.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }
if(userInfo.equalsIgnoreCase("addjobs")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/jobss.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }

if(userInfo.equalsIgnoreCase("addjobss")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/jobss.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }

if(userInfo.equalsIgnoreCase("AddIssueRecord")){
	
    System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
  
try {
	 
	
	
	     
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/addIssueRecord.jsp");
	   dispatcher.forward(request, response);   
	  
	      //response.sendRedirect("addIssueRecord.jsp");
      } catch (Exception e) {
	          e.printStackTrace();
      }

 }



if(userInfo.equalsIgnoreCase("AddPurchaseRecord")){
	
	            System.out.println("Enter into the addIssueRecord method>>>>>>>>>>>");
	 	
	  try {
		
		     
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/addPurchaseRecord.jsp");
		   dispatcher.forward(request, response);   
		  
		      //response.sendRedirect("addIssueRecord.jsp");
	      } catch (Exception e) {
		          e.printStackTrace();
	      }
	    
	   }
if(userInfo.equalsIgnoreCase("addpurchaseRecordSucc")){
	
	 System.out.println("Enter into add Issue record method");
	    
	   boolean flag=false;
	   
	   String namemorpheus=request.getParameter("nameofmorpheus");
	   String purchaseDate=request.getParameter("purchagedate");
	   
	      //String versionmorpheus=request.getParameter("versionofmorpheus"); 
	   
	   String amountofmorpheus=request.getParameter("amountofmorpheus");
	   String vendorName=request.getParameter("vendorName");
	   
	     //String quality=request.getParameter("quality");
	   
	   
	   
	   try {
		   
		   
		   flag=controllerUtil.addPurchaseRecord(namemorpheus,purchaseDate,amountofmorpheus,vendorName);
		   
		   if(flag==true){
			   
			   response.sendRedirect("userAccount.jsp");
			   
		       }
		   else {
			   response.sendRedirect("userAccount.jsp");
		         }
		     } 
	    catch (Exception e) {
		         e.printStackTrace();
	      }
      }
if(userInfo.equalsIgnoreCase("EditPurchaseRecord")){
	
	    String ID=request.getParameter("productID").toString();
	    
	    int ids=Integer.parseInt(ID);
	     
 try {
	 
	   
	   
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editPurchaseRecord.jsp");
	   dispatcher.forward(request, response);
	   
	   
	  
	    } 
	catch (Exception e) {
		 e.printStackTrace();
       	} 
       }

if(userInfo.equalsIgnoreCase("EditAddProduct")){
	
   String ID=request.getParameter("productID").toString();
   
   int ids=Integer.parseInt(ID);
    
try {
	 
	   
	
  
  
  RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editProductData.jsp");
  dispatcher.forward(request, response);
  
  
 
   } 
catch (Exception e) {
	 e.printStackTrace();
   	} 
   }





if(userInfo.equalsIgnoreCase("EditIssueRecord")){
	
   String ID=request.getParameter("productID").toString();
   
   int ids=Integer.parseInt(ID);
   
    
try {
	
	
	
  
  
  RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/editIssueRecord.jsp");
  dispatcher.forward(request, response);
  
  
 
   } 
catch (Exception e) {
	 e.printStackTrace();
   	} 
   }


if(userInfo.equalsIgnoreCase("updatePurchaseRecordSucc")){
	
	  boolean flag=false;
	
	   String namemorpheus=request.getParameter("nameofmorpheus");
	   String purchaseDate=request.getParameter("purchagedate");
	   //String versionmorpheus=request.getParameter("versionofmorpheus"); 
	   String amountofmorpheus=request.getParameter("amountofmorpheus");
	   String vendorName=request.getParameter("vendorName");
	   //String quality=request.getParameter("quality");
	   
	   int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
	   
	
	
	 try{
		
		 flag=controllerUtil.updatePurchaseRecord(namemorpheus,purchaseDate,amountofmorpheus,vendorName,productID);
		   
		   if(flag==true){
			   
			   response.sendRedirect("userAccount.jsp");
			   
		       }
		   else {
			   response.sendRedirect("userAccount.jsp");
		         }
		  } 
	  catch (Exception e) {
		 e.printStackTrace();
	}
	
	
       }


if(userInfo.equalsIgnoreCase("updateProduct")){
	
	  boolean flag=false;
	  
	  HttpSession session=request.getSession(true);
	
	   String nameProduct=request.getParameter("productName");
	   String productDesc=request.getParameter("productDesc");
	   String productType=request.getParameter("productType"); 
	  
	   int productID=Integer.parseInt(request.getParameter("hiddenProductID"));
	   
	
	
	 try{
		
		 session.setAttribute("userEmail", userLogin);
		 
		 flag=controllerUtil.updateProduct(nameProduct,productDesc,productType,productID);
		   
		   if(flag==true){
			   
			   response.sendRedirect("userAccount.jsp");
			   
		       }
		   else {
			   response.sendRedirect("userAccount.jsp");
		         }
		  } 
	  catch (Exception e) {
		 e.printStackTrace();
	}
	
	
     }




if(userInfo.equalsIgnoreCase("AddProduct")){
	
	 System.out.println("Enter into add product method");
	
	   try {
		 
		
			  
			     
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/addProduct.jsp");
			dispatcher.forward(request, response);   
			
		   //response.sendRedirect("addProduct.jsp");
		   
	       } 
	  catch (Exception e) {
		     e.printStackTrace();
        }
      }

if(userInfo.equalsIgnoreCase("viewcompanyddd")){
	
	 System.out.println("Enter into add product method");
	
	   try {
		 
		
			  
			     
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
			dispatcher.forward(request, response);   
			
		   //response.sendRedirect("addProduct.jsp");
		   
	       } 
	  catch (Exception e) {
		     e.printStackTrace();
       }
     }



if(userInfo.equalsIgnoreCase("company")){
	
	 System.out.println("Enter into add product method");
	
	   try {
		 
		
			  
			     
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/company.jsp");
			dispatcher.forward(request, response);   
			
		   //response.sendRedirect("addProduct.jsp");
		   
	       } 
	  catch (Exception e) {
		     e.printStackTrace();
       }
     }



if(userInfo.equalsIgnoreCase("addProductDatabase")){
	
	 System.out.println("Enter into add product into database");
	 
	  boolean flag=false;
	   String nameProduct=request.getParameter("nameofmorpheus");
	   String descOfProduct=request.getParameter("decrProduct");
	   String netAmountProduct=request.getParameter("netAmount");
	   String unitMearueMent=request.getParameter("measureMentName");
	   
try {
		   
		   
		   flag=controllerUtil.addProduct(nameProduct,descOfProduct,netAmountProduct,unitMearueMent);
		   
		   if(flag==true){
			   
			   response.sendRedirect("userAccount.jsp");
			   
		       }
		   else {
			   response.sendRedirect("userAccount.jsp");
		         }
		     } 
	    catch (Exception e) {
		         e.printStackTrace();
	      }

	    }

if(userInfo.equalsIgnoreCase("editProduct")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAllIssueRecord();
      
      System.out.println("size of list is"+issuelist.size());  
    
    request.setAttribute("IssueList", issuelist);
      
   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
   dispatcher.forward(request, response);    
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }
if(userInfo.equalsIgnoreCase("editadmin")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAlladminRecord();
      
      System.out.println("size of list is"+issuelist.size());  
    
    request.setAttribute("IssueList", issuelist);
      
   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
   dispatcher.forward(request, response);    
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }


if(userInfo.equalsIgnoreCase("editProductsss")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAllincidentRecord();
      
      System.out.println("size of list is"+issuelist.size());  
    
    request.setAttribute("IssueList", issuelist);
      
   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
   dispatcher.forward(request, response);    
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }

if(userInfo.equalsIgnoreCase("editProductssss")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAllincidentRecord();
      
      System.out.println("size of list is"+issuelist.size());  
    
    request.setAttribute("IssueList", issuelist);
      
   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidentss.jsp");
   dispatcher.forward(request, response);    
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }


if(userInfo.equalsIgnoreCase("editProducts")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAllempRecord();
    
    System.out.println("size of list is"+issuelist.size());  
  
  request.setAttribute("IssueList", issuelist);
    
 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
 dispatcher.forward(request, response);   
 
	// response.sendRedirect("purchaseRecord.jsp");
 } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }

if(userInfo.equalsIgnoreCase("editProductss")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAlljobRecord();
    
    System.out.println("size of list is"+issuelist.size());  
  
  request.setAttribute("IssueList", issuelist);
    
 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
 dispatcher.forward(request, response);   
 
	// response.sendRedirect("purchaseRecord.jsp");
 } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }

if(userInfo.equalsIgnoreCase("editProductsse")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAlljobRecord();
    
    System.out.println("size of list is"+issuelist.size());  
  
  request.setAttribute("IssueList", issuelist);
    
 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
 dispatcher.forward(request, response);   
 
	// response.sendRedirect("purchaseRecord.jsp");
 } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }


if(userInfo.equalsIgnoreCase("editProductssss")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	  
	      
	issuelist=controllerUtil.getAlljobRecord();
    
    System.out.println("size of list is"+issuelist.size());  
  
  request.setAttribute("IssueList", issuelist);
    
 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
 dispatcher.forward(request, response);   
 
	// response.sendRedirect("purchaseRecord.jsp");
 } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }



if(userInfo.equalsIgnoreCase("employee")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	   
	      
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/employee.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }


if(userInfo.equalsIgnoreCase("admin")){
	System.out.println("enter into edit product for list the record>>>>>>>>>>>");    
	   
	   HttpSession sessoin=request.getSession(true);
	   
	
try {
	   
	      
	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/account.jsp");
	   dispatcher.forward(request, response);   
	   
		// response.sendRedirect("purchaseRecord.jsp");
	   } 
	 catch (Exception e) {
		        e.printStackTrace();
       	}
        }




if(userInfo.equalsIgnoreCase("deletecompanyffff")){
	
	      String productID=request.getParameter("productID").toString();
	      
	      int productIDs=Integer.parseInt(productID);
	
	      boolean flag=false;
      try {
   	   
   	  
   	    
   	   if(flag==true){
   		   
   		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/addViewProduct.jsp");
   		   dispatcher.forward(request, response); 
   		   
   		     
   	          }
   	   else {
   		   
   		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/addViewProduct.jsp");
   		   dispatcher.forward(request, response); 
			
		        } 
   	   } 
      catch (Exception e) {
		     e.printStackTrace();
   	   }	
       }

if(userInfo.equalsIgnoreCase("deleteIssueRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteIssueRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAllIssueRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewcompany.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/issueRecord.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }

if(userInfo.equalsIgnoreCase("deleteadminRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteadminRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAlladminRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewadmin.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }
if(userInfo.equalsIgnoreCase("deleteempRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteEmpRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAllempRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewemployee.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }

if(userInfo.equalsIgnoreCase("deleteincidentRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteincidentRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAllincidentRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidents.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }
if(userInfo.equalsIgnoreCase("deleteincidentsRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteincidentRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAllincidentRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidentss.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewincidentss.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }


if(userInfo.equalsIgnoreCase("deletejobRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteJobRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAlljobRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobs.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }

if(userInfo.equalsIgnoreCase("deletejobsRecord")){
	
    String productID=request.getParameter("productID").toString();
   
    int productIDs=Integer.parseInt(productID);

   boolean flag=false;
   
try {
	   
	 
	 flag=controllerUtil.deleteJobRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   issuelist=controllerUtil.getAlljobRecord();
	  	      
	  	      System.out.println("size of list is"+issuelist.size());  
	  	    
	  	    request.setAttribute("IssueList", issuelist);
	  	      
	  	   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
	  	   dispatcher.forward(request, response);  
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewjobss.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
 }


if(userInfo.equalsIgnoreCase("DeletePurchaseRecord")){
	
     String productID=request.getParameter("productID").toString();
  
   int productIDs=Integer.parseInt(productID);

  boolean flag=false;
  
try {
	   
	 flag=controllerUtil.deletePurchaseRecord(productIDs); 
	
	  // request.setAttribute("productList", addproductlist);
	    
	    
	   if(flag==true){
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/purchaseRecord.jsp");
		   dispatcher.forward(request, response); 
		   
		     
	          }
	   else {
		   
		   RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/purchaseRecord.jsp");
		   dispatcher.forward(request, response); 
		
	        } 
	   } 
catch (Exception e) {
	     e.printStackTrace();
	   }	
}

     
     
     
     
     
     
     
	
	
	}
}
