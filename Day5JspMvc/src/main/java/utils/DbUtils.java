package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	
	public static Connection cn;
	
	public static void openConnection() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/player";
		
		cn=DriverManager.getConnection(url,"root","suraj@123");
	}
	
	public static void closeConnection() throws SQLException {
		if(cn!=null)
			cn.close();
	}

	public static Connection getCn() {
		return cn;
	}
	
	

}
