package com.morpheus.bean;

public class issuecompany {

	int companyid;
	int employeeid;
	
	String jobtitle;
	String email;
	String password;
	String address1;
	String address2;
	String suburb;
	String state;
	String postcode;
	String abn;
	
	
	
	public int getProductID() {
		return companyid;
	}
	public void setProductID(int productID) {
		this.companyid = productID;
	}
		
		public int getEmployeeID() {
			return employeeid;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeid = employeeID;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	public String getNameInventory() {
		return jobtitle;
	}
	public void setNameInventory(String nameInventory) {
		this.jobtitle = nameInventory;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
	}
	public String getIssueDate() {
		return address1;
	}
	public void setIssueDate(String issueDate) {
		this.address1 = issueDate;
	}
	public String getIssueNoDay() {
		return address2;
	}
	public void setIssueNoDay(String issueNoDay) {
		this.address2 = issueNoDay;
	}
	public String getReturnDate() {
		return suburb;
	}
	public void setReturnDate(String returnDate) {
		this.suburb = returnDate;
	}
	public String getVersionOfInventory() {
		return state;
	}
	public void setVersionOfInventory(String versionOfInventory) {
		this.state = versionOfInventory;
	}
	public String getIssueToDepartment() {
		return postcode;
	}
	public void setIssueToDepartment(String issueToDepartment) {
		this.postcode = issueToDepartment;
	}
	
	public String getAbn() {
		return abn;
	}
	public void setAbn(String Abn) {
		this.abn = Abn;
}
	
	
	
}
