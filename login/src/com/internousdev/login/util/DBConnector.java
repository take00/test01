package com.internousdev.login.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb_yamada";

	public static String user = "root";
	public static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;

		try{
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return con;
	}

}
