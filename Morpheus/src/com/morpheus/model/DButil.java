package com.morpheus.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.morpheus.bean.issueRecord;



public class DButil {
	
	
	public static ArrayList<issueRecord> editIssueRecord(int ids){
		
		   System.out.println("Enter into getAll purchase record method");
		   

			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> issuelist=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from companys where companyid=?";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, ids);
					
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("companyid"));
				   
				    issueReco.setNameInventory(result.getString("jobtitle"));
				    issueReco.setEmail(result.getString("email"));
				    issueReco.setPassword(result.getString("password"));
				    issueReco.setIssueDate(result.getString("address1"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("address2"));
				      issueReco.setReturnDate(result.getString("suburb"));
				     issueReco.setVersionOfInventory(result.getString("state"));
				    
				    issueReco.setIssueToDepartment(result.getString("postcode"));
				    issueReco.setAbn(result.getString("abn"));
				    
				    
				   
				    issuelist.add(issueReco);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return issuelist;
		   }
	public static ArrayList<issueRecord> editadminRecord(int ids){
		
		   System.out.println("Enter into getAll purchase record method");
		   

			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> issuelist=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from account where accountid=?";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, ids);
					
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("accountid"));
				   
				    issueReco.setNameInventory(result.getString("accountname"));
				    issueReco.setEmail(result.getString("adminemail"));
				    issueReco.setPassword(result.getString("password"));
				    issueReco.setIssueDate(result.getString("adminfirstname"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("adminlastname"));
				          
				    
				   
				    issuelist.add(issueReco);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return issuelist;
		   }
	
	
	
	public static ArrayList<issueRecord> editincidentRecord(int ids){
		
		   System.out.println("Enter into getAll purchase record method");
		   

			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> issuelist=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from incidents where incidentid=?";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, ids);
					
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("incidentid"));
				   
				    issueReco.setNameInventory(result.getString("companyid"));
				    issueReco.setEmail(result.getString("employeeid"));
				    issueReco.setPassword(result.getString("incidentdate"));
				    issueReco.setIssueDate(result.getString("severitylevel"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("address"));
				      issueReco.setReturnDate(result.getString("personsinvolved"));
				     issueReco.setVersionOfInventory(result.getString("description"));
				    
				    issueReco.setIssueToDepartment(result.getString("actiontaken"));
				    issueReco.setAbn(result.getString("upload"));
				    
				    
				   
				    issuelist.add(issueReco);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return issuelist;
		   }
	
	public static ArrayList<issueRecord> editEmpRecord(int ids){
		
		   System.out.println("Enter into getAll purchase record method");
		   

			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> issuelist=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from employees where employeeid=?";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, ids);
					
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("employeeid"));
				   
				    issueReco.setNameInventory(result.getString("firstname"));
				    issueReco.setEmail(result.getString("lastname"));
				    issueReco.setPassword(result.getString("address"));
				    issueReco.setIssueDate(result.getString("emailid"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("password"));
				      issueReco.setReturnDate(result.getString("accountid"));
				    
				    
				    
				   
				    issuelist.add(issueReco);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return issuelist;
		   }
	public static ArrayList<issueRecord> editJobRecord(int ids){
		
		   System.out.println("Enter into getAll purchase record method");
		   

			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> issuelist=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from job where jobid=?";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, ids);
					
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("jobid"));
				   
				    issueReco.setNameInventory(result.getString("companyid"));
				    issueReco.setEmail(result.getString("employeeid"));
				    issueReco.setPassword(result.getString("customer"));
				    issueReco.setIssueDate(result.getString("jobtitle"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("description"));
				      issueReco.setReturnDate(result.getString("date"));
				    
				    
				    
				   
				    issuelist.add(issueReco);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return issuelist;
		   }
	 
	
	

	public static ArrayList<issueRecord> getAllIssueRecord(){
		
		   System.out.println("Enter into getAll issue record method");
		   
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> listPur=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from companys";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("companyid"));
				   
				    issueReco.setNameInventory(result.getString("jobtitle"));
				    issueReco.setEmail(result.getString("email"));
				    issueReco.setPassword(result.getString("password"));
				    issueReco.setIssueDate(result.getString("address1"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("address2"));
				      issueReco.setReturnDate(result.getString("suburb"));
				     issueReco.setVersionOfInventory(result.getString("state"));
				    
				    issueReco.setIssueToDepartment(result.getString("postcode"));
				    issueReco.setAbn(result.getString("abn"));
				 
				    listPur.add(issueReco);
				    System.out.println(listPur);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return listPur;
		   }
	public static ArrayList<issueRecord> getAlladminRecord(){
		
		   System.out.println("Enter into getAll issue record method");
		   
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> listPur=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from account";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("accountid"));
				   
				    issueReco.setNameInventory(result.getString("accountname"));
				    issueReco.setEmail(result.getString("adminemail"));
				    issueReco.setPassword(result.getString("password"));
				    issueReco.setIssueDate(result.getString("adminfirstname"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("adminlastname"));
				      
				    listPur.add(issueReco);
				    System.out.println(listPur);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return listPur;
		   }
	
	
	
	public static ArrayList<issueRecord> getAllempRecord(){
		
		   System.out.println("Enter into getAll issue record method");
		   
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> listPur=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from employees";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("employeeid"));
				   
				    issueReco.setNameInventory(result.getString("firstname"));
				    issueReco.setEmail(result.getString("lastname"));
				    issueReco.setPassword(result.getString("address"));
				    issueReco.setIssueDate(result.getString("emailid"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("accountid"));
				      
				 
				    listPur.add(issueReco);
				    System.out.println(listPur);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return listPur;
		   }
	public static ArrayList<issueRecord> getAllincidentRecord(){
		
		   System.out.println("Enter into getAll issue record method");
		   
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> listPur=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from incidents";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    issueReco.setProductID(result.getInt("incidentid"));
					   
				    issueReco.setNameInventory(result.getString("companyid"));
				    issueReco.setEmail(result.getString("employeeid"));
				    issueReco.setPassword(result.getString("incidentdate"));
				    issueReco.setIssueDate(result.getString("severitylevel"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("address"));
				      issueReco.setReturnDate(result.getString("personsinvolved"));
				     issueReco.setVersionOfInventory(result.getString("description"));
				    
				    issueReco.setIssueToDepartment(result.getString("actiontaken"));
				    issueReco.setAbn(result.getString("upload"));
				      
				 
				    listPur.add(issueReco);
				    System.out.println(listPur);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return listPur;
		   }
	
	public static ArrayList<issueRecord> getAlljobRecord(){
		
		   System.out.println("Enter into getAll issue record method");
		   
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
		   
			issueRecord issueReco=null;
		 
		   ArrayList<issueRecord> listPur=new ArrayList<issueRecord>();
		 
		 
		   try {
			      String query ="select * from job";

					Connection conn = com.morpheus.connection.Connection.getConnection();
					pstmt = conn.prepareStatement(query);
					result=pstmt.executeQuery();
					
			while(result.next())	{
				  
				    System.out.println("enter into result set====================");
				    
				    issueReco=new issueRecord();
				    
				    issueReco.setProductID(result.getInt("jobid"));
				   
				    issueReco.setNameInventory(result.getString("companyid"));
				    issueReco.setEmail(result.getString("employeeid"));
				    issueReco.setPassword(result.getString("customer"));
				    issueReco.setIssueDate(result.getString("jobtitle"));
				    
				    
				      issueReco.setIssueNoDay(result.getString("description"));
				      issueReco.setReturnDate(result.getString("date"));
				      
				 
				    listPur.add(issueReco);
				    System.out.println(listPur);
				    
				    }
		         } 
		    catch (Exception e) {
				 e.printStackTrace();
			 }
		    return listPur;
		   }
	
	
	public static boolean addUser(String userName,String password, String emailID, String fname,String lname){
		
	    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>"+userName);
	
		boolean flag = false;
		PreparedStatement pstmt = null;
		
		String query ="insert into account(accountname,adminemail,adminfirstname,adminlastname,password) values (?,?,?,?,?)";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userName);
			pstmt.setString(2, emailID);
			pstmt.setString(3, fname);
			pstmt.setString(4, lname);
			pstmt.setString(5, password);
			
			if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
public static boolean addUuser(String fname,String lname,String emailID,String password){
		
	    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>"+fname);
	
		boolean flag = false;
		PreparedStatement pstmt = null;
		
		String query ="insert into employee(firstname,lastname,emailid,password) values (?,?,?,?,?)";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, fname);
			pstmt.setString(2, emailID);
			pstmt.setString(3, fname);
			pstmt.setString(4, lname);
			pstmt.setString(5, password);
			
			if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

public static boolean contact(String companyid,String fname,String lname,String emailID,String landline, String mobile){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>"+fname);

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into contacts(companyid,firstname,lastname,email,landline,mobile) values (?,?,?,?,?,?)";
	
	try {
		
		Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, companyid);	
		pstmt.setString(2, fname);
		pstmt.setString(3, lname);
		pstmt.setString(4, emailID);
		pstmt.setString(5, landline);
		pstmt.setString(6, mobile);
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}
public static boolean employee(String fname,String lname,String address,String email,String password,String companyid){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>"+fname);

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into employees(firstname,lastname,address,emailid,password,accountid) values (?,?,?,?,?,?)";
	
	try {
		
		Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);	
		pstmt.setString(1, fname);
		pstmt.setString(2, lname);
		pstmt.setString(3, address);
		pstmt.setString(4, email);
		pstmt.setString(5, password);
		pstmt.setString(6, companyid);
		
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}
	

public static boolean job(String companyid,String empid,String job,String address1,String address2,String suburb){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>");

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into job(companyid,employeeid,customer,jobtitle,description,date) values (?,?,?,?,?,?)";
	
	try {
				Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);	
		pstmt.setString(1, companyid);
		pstmt.setString(2, empid);
		pstmt.setString(3, job);
		pstmt.setString(4, address1);
		pstmt.setString(5, address2);
		pstmt.setString(6, suburb);
		
		
		
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}


public static boolean company(String job,String email,String password,String address1,String address2,String suburb,String state,String postcode, String abn, String logo
){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>");

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into companys(jobtitle,email,password,address1,address2,suburb,state,postcode,abn) values (?,?,?,?,?,?,?,?,?)";
	
	try {
			Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);	
		
		pstmt.setString(1, job);
		pstmt.setString(2, email);
		pstmt.setString(3, password);
		pstmt.setString(4, address1);
		pstmt.setString(5, address2);
		pstmt.setString(6, suburb);
		pstmt.setString(7, state);
		pstmt.setString(8, postcode);
		pstmt.setString(9, abn);
		
		
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}
public static boolean admin(String job,String email,String password,String address1,String address2){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>");

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into account(accountname,adminemail,password,adminfirstname,adminlastname) values (?,?,?,?,?)";
	
	try {
			Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);	
		
		pstmt.setString(1, job);
		pstmt.setString(2, email);
		pstmt.setString(3, password);
		pstmt.setString(4, address1);
		pstmt.setString(5, address2);
		
		
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}


public static boolean incident(String companyid,String empid,String date,String level,String address,String invloved,String description,String action,String upload){
	
    System.out.println("Insert into adduser mehtod>>>> morpheus System>>>>>>>>>>>>>>>>>>");

	boolean flag = false;
	PreparedStatement pstmt = null;
	
	String query ="insert into incidents(companyid,employeeid,incidentdate,severitylevel,address,personsinvolved,description,actiontaken,upload) values (?,?,?,?,?,?,?,?,?)";
	
	try {
		
		Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);	
		pstmt.setString(1, companyid);
		pstmt.setString(2, empid);
		pstmt.setString(3, date);
		pstmt.setString(4, level);
		pstmt.setString(5, address);
		pstmt.setString(6, invloved);
		pstmt.setString(7, description);
		pstmt.setString(8, action);
		pstmt.setString(9, upload);
		
		
		if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
}
	
 

 public static boolean addIssueRecord(String job,String email,String password,String address1, String address2, String suburb, String state, String postcode, String abn,int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update companys SET jobtitle=?,email=?,password=?,address1=?,address2=?, suburb=?, state=?, postcode=?,abn=? where companyid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
		
			pstmt.setString(1, job);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, address1);
			pstmt.setString(5, address2);
			pstmt.setString(6, suburb);
			pstmt.setString(7, state);
			pstmt.setString(8, postcode);
			pstmt.setString(9, abn);
			pstmt.setInt(10, productID);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag; 
   }
 
public static boolean addadminRecord(String job,String email,String password,String address1, String address2, int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update account SET accountname=?,adminemail=?,password=?,adminfirstname=?,adminlastname=?where accountid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
		
			pstmt.setString(1, job);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, address1);
			pstmt.setString(5, address2);
			
			pstmt.setInt(6, productID);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag; 
   }
public static boolean addincidentRecord(String job,String email,String password,String address1, String address2, String suburb, String state, String postcode, String abn,int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update incidents SET companyid=?,employeeid=?,incidentdate=?,severitylevel=?,address=?, personsinvolved=?, description=?, actiontaken=?,upload=? where incidentid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
		
			pstmt.setString(1, job);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, address1);
			pstmt.setString(5, address2);
			pstmt.setString(6, suburb);
			pstmt.setString(7, state);
			pstmt.setString(8, postcode);
			pstmt.setString(9, abn);
			pstmt.setInt(10, productID);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag; 
   }
 
 
public static boolean addJobRecord(String job,String email,String password,String address1, String address2, String suburb,int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update job SET companyid=?,employeeid=?,customer=?,jobtitle=?,description=?, date=? where jobid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
		
			pstmt.setString(1, job);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, address1);
			pstmt.setString(5, address2);
			pstmt.setString(6, suburb);
			
			pstmt.setInt(7, productID);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag; 
   }
public static boolean addEmpRecord(String job,String email,String password,String address1, String address2, String suburb, int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update employees SET firstname=?,lastname=?,address=?,emailid=?,password=?, accountid=? where employeeid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
		
			pstmt.setString(1, job);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, address1);
			pstmt.setString(5, address2);
			pstmt.setString(6, suburb);
			
			pstmt.setInt(7, productID);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag; 
   }
 
 
 public static boolean addPurchaseRecord(String namemorpheus,String purchaseDate,String amountofmorpheus,String vendorName){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="insert into purchase_record(nameofmorpheus,purchage_date,amountofmorpheus,vendor_name) values (?,?,?,?)";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, namemorpheus);
			pstmt.setString(2, purchaseDate);
			
			//pstmt.setString(3, versionmorpheus);
			
			pstmt.setString(3, amountofmorpheus);
			pstmt.setString(4, vendorName);
			
			//pstmt.setString(6, quality);
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   return flag;
    }
 
public static boolean addProduct(String nameOfProduct,String descriptionProduct,String netAmount,String unitMearueMent){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="insert into fixedAsset_info(product_name,description_Product,netAmount,unit_measurement) values (?,?,?,?)";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, nameOfProduct);
			pstmt.setString(2, descriptionProduct);
			pstmt.setString(3, netAmount);
			pstmt.setString(4, unitMearueMent);
			
			
			
		if(pstmt.executeUpdate() == 1)	{
				flag = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   return flag;
    }

 
 
 
 
 
 
 
 
 
public static boolean updatePurchaseRecord(String namemorpheus,String purchaseDate,String amountofmorpheus,String vendorName,int productID){
 
 boolean flag=false;
 
 PreparedStatement pstmt = null;
	
	String query ="update purchase_record SET nameofmorpheus=?,purchage_date=?,amountofmorpheus=?,vendor_name=? where product_ID=?";
	
	try {
		
		Connection conn = com.morpheus.connection.Connection.getConnection();
		
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, namemorpheus);
		pstmt.setString(2, purchaseDate);
		//pstmt.setString(3, versionmorpheus);
		pstmt.setString(3, amountofmorpheus);
		pstmt.setString(4, vendorName);
		//pstmt.setString(6, quality);
		pstmt.setInt(5, productID);
		
		
	if(pstmt.executeUpdate() == 1)	{
			flag = true;				
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
return flag;
 
    }

public static boolean updateProduct(String nameProduct,String productDesc,String productType,int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="update fixedAsset_info SET product_name=?,description_Product=?,netAmount=? where product_ID=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, nameProduct);
			pstmt.setString(2, productDesc);
			pstmt.setString(3, productType);
			pstmt.setInt(4, productID);
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }


public static boolean deletePoductID(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from fixedAsset_info where product_ID=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }

public static boolean deleteIssueRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from companys where companyid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }
public static boolean deleteadminRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from account where accountid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }
public static boolean deleteJobRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from job where jobid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }

public static boolean deleteEmpRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from employees where employeeid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }

public static boolean deleteincidentRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from incidents where incidentid=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }


public static boolean deletePurchaseRecord(int productID){
	 
	 boolean flag=false;
	 
	 PreparedStatement pstmt = null;
		
		String query ="delete  from purchase_record where product_ID=?";
		
		try {
			
			Connection conn = com.morpheus.connection.Connection.getConnection();
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productID);
			
			
	   if(pstmt.executeUpdate() == 1)	{
	 		flag = true;				
		 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return flag;
	 
	    }



	
	
	
	

	
	 public static boolean checkUserLogin(String emailID,String password){
			
		    System.out.println("Insert into checkUSer mehtod>>>>Morpheus>>>>>>>>>>>>>>>>>>"+emailID);
		
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
			
			
			String query ="select * from account where adminemail=? and password=?";
			   
		
			try {
				
				Connection conn = com.morpheus.connection.Connection.getConnection();
				System.out.println("eeeeeeeeeeeeeeeeeeeeeeeee"+conn);
				pstmt = conn.prepareStatement(query);
				
			System.out.println("query of user is"+query);
			
			
				pstmt.setString(1, emailID);
				pstmt.setString(2, password);
				
				result=pstmt.executeQuery();
				
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh"+result);		
				
		  if(result.next())	{
			  
			    System.out.println("enter into result set====================");
					flag = true;				
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
	 
	 public static boolean checkEmployee(String emailID,String password){
			
		    System.out.println("Insert into checkUSer mehtod>>>>Morpheus>>>>>>>>>>>>>>>>>>"+emailID);
		
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
			
			
			String query ="select * from employees where emailid=? and password=?";
			   
		
			try {
				
				Connection conn = com.morpheus.connection.Connection.getConnection();
				System.out.println("eeeeeeeeeeeeeeeeeeeeeeeee"+conn);
				pstmt = conn.prepareStatement(query);
				
			System.out.println("query of user is"+query);
			
			
				pstmt.setString(1, emailID);
				pstmt.setString(2, password);
				
				result=pstmt.executeQuery();
				
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh"+result);		
				
		  if(result.next())	{
			  
			    System.out.println("enter into result set====================");
					flag = true;				
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
	 
	 public static boolean checkUsercompany(String emailID,String password){
			
		    System.out.println("Insert into checkUSer mehtod>>>>Morpheus>>>>>>>>>>>>>>>>>>"+emailID);
		
			boolean flag = false;
			PreparedStatement pstmt = null;
			ResultSet result=null;
			
			
			String query ="select * from companys where email=? and password=?";
			   
		
			try {
				
				Connection conn = com.morpheus.connection.Connection.getConnection();
				System.out.println("eeeeeeeeeeeeeeeeeeeeeeeee"+conn);
				pstmt = conn.prepareStatement(query);
				
			System.out.println("query of user is"+query);
			
			
				pstmt.setString(1, emailID);
				pstmt.setString(2, password);
				
				result=pstmt.executeQuery();
				
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh"+result);		
				
		  if(result.next())	{
			  
			    System.out.println("enter into result set====================");
					flag = true;				
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
		}
	 
	 
	
}
