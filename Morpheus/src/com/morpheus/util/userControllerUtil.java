package com.morpheus.util;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;

import com.morpheus.model.DButil;

import com.morpheus.bean.addProduct;
import com.morpheus.bean.department;
import com.morpheus.bean.measureMent;
import com.morpheus.bean.purchaseRecord;
import com.morpheus.bean.issueRecord;
import com.morpheus.model.DButil;
import com.morpheus.model.DButil;
import com.morpheus.util.userControllerUtil;
import com.morpheus.model.DButil;

public class userControllerUtil extends HttpServlet {
	
	
static ArrayList<purchaseRecord> purlist=null;
	
	static ArrayList<issueRecord>  issuelist=null;
	
	static ArrayList<addProduct>  addProductList=null;
	
	static ArrayList<department> departmentList=null;
	
	static ArrayList<measureMent> measureMentList=null;
	
	public static boolean checkUser(String email,String password){
		
		  boolean flag=DButil.checkUserLogin(email,password);
		return flag; 
	   }
	public static boolean checkcompany(String email,String password){
		
		  boolean flag=DButil.checkUsercompany(email,password);
		return flag; 
	   }
	public static boolean checkemployee(String email,String password){
		
		  boolean flag=DButil.checkEmployee(email,password);
		return flag; 
	   }
	
	
	 public static ArrayList<issueRecord>  getAllIssueRecord(){
	    	
	    	
  	   issuelist=DButil.getAllIssueRecord();
  	
  	return issuelist;
  }
	 public static ArrayList<issueRecord>  getAlladminRecord(){
	    	
	    	
	  	   issuelist=DButil.getAlladminRecord();
	  	
	  	return issuelist;
	  }
	 
	 
	 public static ArrayList<issueRecord>  getAllempRecord(){
	    	
	    	
	  	   issuelist=DButil.getAllempRecord();
	  	
	  	return issuelist;
	  }
	 
	 public static ArrayList<issueRecord>  getAllincidentRecord(){
	    	
	    	
	  	   issuelist=DButil.getAllincidentRecord();
	  	
	  	return issuelist;
	  }
	 public static ArrayList<issueRecord>  getAlljobRecord(){
	    	
	    	
	  	   issuelist=DButil.getAlljobRecord();
	  	
	  	return issuelist;
	  }
	 
	 
	 public static ArrayList<issueRecord>  getcompanyid(){
	    	
	    	
	  	   issuelist=DButil.getAllIssueRecord();
	  	
	  	return issuelist;
	  }

	
	
	
	
	
	

	public userControllerUtil(String accName,String password,String emailID, String fname,String lname){
  	   
            DButil.addUser(accName,password,emailID,fname,lname);

      }
	public static boolean user(String fname,String lname,String emailID,String password){
	  	   
		boolean flag=  DButil.addUuser(fname,lname,emailID,password);
		return flag;
  }
	
	public static boolean contact(String companyid,String fname,String lname,String emailID,String landline, String mobile){
	  	   
		boolean flag=  DButil.contact(companyid,fname,lname,emailID,landline, mobile);
		return flag;
  }
	
	
	
	
	public static ArrayList<issueRecord>  editIssueRecord(int ids){
    	
	     issuelist=DButil.editIssueRecord(ids);
	
    return issuelist;  	
}
	public static ArrayList<issueRecord>  editadminRecord(int ids){
    	
	     issuelist=DButil.editadminRecord(ids);
	
   return issuelist;  	
}
	public static ArrayList<issueRecord>  editincidentRecord(int ids){
    	
	     issuelist=DButil.editincidentRecord(ids);
	
   return issuelist;  	
}
	
	public static ArrayList<issueRecord>  editempRecord(int ids){
    	
	     issuelist=DButil.editEmpRecord(ids);
	
   return issuelist;  	
}
	public static ArrayList<issueRecord>  editjobRecord(int ids){
    	
	     issuelist=DButil.editJobRecord(ids);
	
  return issuelist;  	
}

	
	
	public static boolean employee(String fname,String lname,String address,String email,String password,String companyid){
	  	   
		boolean flag=  DButil.employee(fname,lname,address,email,password,companyid);
		return flag;
  }
	public static boolean incident(String companyid,String empid,String date,String level,String address,String invloved,String description,String action,String upload){
	  	   
		boolean flag=  DButil.incident(companyid,empid,date,level,address,invloved,description,action,upload);
		return flag;
  }
	public static boolean job(String companyid,String empid,String job,String address1,String address2,String suburb){
	  	   
		boolean flag=  DButil.job(companyid,empid,job,address1,address2,suburb);
		return flag;
  }
	public static boolean company(String job,String email,String password,String address1,String address2,String suburb,String state,String postcode, String abn, String logo){
	  	   
		boolean flag=  DButil.company(job,email,password,address1,address2,suburb,state,postcode,abn,logo);
		return flag;
  }
	
	public static boolean admin(String job,String email,String password,String address1,String address2){
	  	   
		boolean flag=  DButil.admin(job,email,password,address1,address2);
		return flag;
  }
	 
	
	public static boolean addIssueRecord(String job,String email,String password,String address1, String address2, String suburb, String state, String postcode, String abn,int productID){
		 
		 boolean flag=DButil.addIssueRecord(job,email,password,address1, address2, suburb, state, postcode, abn,productID);
		 
		 return flag;
	 }
	public static boolean addadminRecord(String job,String email,String password,String address1, String address2,int productID){
		 
		 boolean flag=DButil.addadminRecord(job,email,password,address1, address2, productID);
		 
		 return flag;
	 }
	public static boolean addincidentRecord(String job,String email,String password,String address1, String address2, String suburb, String state, String postcode, String abn,int productID){
		 
		 boolean flag=DButil.addincidentRecord(job,email,password,address1, address2, suburb, state, postcode, abn,productID);
		 
		 return flag;
	 }
	public static boolean addJobRecord(String job,String email,String password,String address1, String address2, String suburb,int productID){
		 
		 boolean flag=DButil.addJobRecord(job,email,password,address1, address2, suburb, productID);
		 
		 return flag;
	 }
	
	public static boolean addEmpRecord(String job,String email,String password,String address1, String address2, String suburb, int productID){
		 
		 boolean flag=DButil.addEmpRecord(job,email,password,address1, address2, suburb, productID);
		 
		 return flag;
	 }
	public static boolean addPurchaseRecord(String namemorpheus,String purchaseDate,String amountofmorpheus,String vendorName)  {
		
		 boolean flag=DButil.addPurchaseRecord(namemorpheus,purchaseDate,amountofmorpheus,vendorName);
		
       return flag;		
	 }
	
	
	public static boolean addProduct(String nameOfProduct,String descriptionofProduct,String netAmount,String unitMearueMent)  {
		
		 boolean flag=DButil.addProduct(nameOfProduct,descriptionofProduct,netAmount,unitMearueMent);
		
      return flag;		
	 }
	
	
	
   
   public static boolean updatePurchaseRecord(String namemorpheus,String purchaseDate,String amountofmorpheus,String vendorName,int productID)  {
		
		 boolean flag=DButil.updatePurchaseRecord(namemorpheus,purchaseDate,amountofmorpheus,vendorName,productID);
		
      return flag;		
	 }
   
   public static boolean updateProduct(String nameProduct,String productDesc,String productType,int productID)  {
		
		 boolean flag=DButil.updateProduct(nameProduct,productDesc,productType,productID);
		
    return flag;		
	 }
   
   public static boolean deleteProductID(int productID){
	   
    
	    boolean flag=DButil.deletePoductID(productID);
	   
          return flag;  
       }
   
   public static boolean deleteIssueRecord(int productID){
	   
	    
	    boolean flag=DButil.deleteIssueRecord(productID);
	   
         return flag;  
      }
   public static boolean deleteadminRecord(int productID){
	   
	    
	    boolean flag=DButil.deleteadminRecord(productID);
	   
        return flag;  
     }
   public static boolean deleteEmpRecord(int productID){
	   
	    
	    boolean flag=DButil.deleteEmpRecord(productID);
	   
        return flag;  
     }
   
   public static boolean deleteincidentRecord(int productID){
	   
	    
	    boolean flag=DButil.deleteincidentRecord(productID);
	   
       return flag;  
    }
   public static boolean deleteJobRecord(int productID){
	   
	    
	    boolean flag=DButil.deleteJobRecord(productID);
	   
       return flag;  
    }
   
   public static boolean deletePurchaseRecord(int productID){
	   
	    
	    boolean flag=DButil.deletePurchaseRecord(productID);
	   
        return flag;  
     }
   
	
	
	
	

}
