package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	 static Connection con; 
	 static String url; 
	 public static Connection getConnection() { 
		 try { String url = "jdbc:odbc:" + "contratista"; 
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		 try { con = DriverManager.getConnection(url,"root","160903"); 
		 } catch (SQLException ex) { 
			 ex.printStackTrace(); 
			 } 
		 } catch(ClassNotFoundException e) { 
			 System.out.println(e); 
			 } 
		 return con; 
		 }
	 }

