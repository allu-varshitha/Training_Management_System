package com.rgt.employee.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	public static Connection requestConnection() {
	String url="jdbc:mysql://localhost:3306/TrainingSystem";
	String user="root";
	String pass="root";
	Connection con=null;
	
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 con= DriverManager.getConnection(url, user, pass);
    	 System.out.println("Connection established");
     }catch(ClassNotFoundException  | SQLException e) {
    	 
    	 e.printStackTrace();
     }
	return con;
	}

}
