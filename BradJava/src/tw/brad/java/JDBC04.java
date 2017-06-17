package tw.brad.java;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class JDBC04 {
	public static void main(String[] args) {
		try{
		// Establish the connection. 
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(false);
			ds.setServerName("localhost");
			ds.setPortNumber(1433); 
			ds.setUser("sa");
			ds.setPassword("sa");
			ds.setDatabaseName("Northwind");
			Connection conn = ds.getConnection();
			System.out.println("OK2");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
