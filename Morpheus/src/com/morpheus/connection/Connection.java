package com.morpheus.connection;

import java.sql.DriverManager;
import com.mysql.jdbc.Driver;

public class Connection {

     public static java.sql.Connection conn=null;
	
     public static java.sql.Connection getConnection(){
    	 
    	 try {
			
    		  Class.forName("com.mysql.jdbc.Driver");
    		  conn=DriverManager.getConnection("jdbc:mysql://localhost/Morpheus","root","");
    		  
    		  System.out.println("Enter into Connection Part"+conn);
    		  
    	       } 
    	 catch (Exception e) {
			
            e.printStackTrace();
			
		}
    	 
    	 return conn;
     }
  }
