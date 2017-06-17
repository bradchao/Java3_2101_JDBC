package tw.brad.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class ODBC {
	public static void main(String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = 
				DriverManager.getConnection("jdbc:odbc:brad");
			
			System.out.println("Driver OK");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
