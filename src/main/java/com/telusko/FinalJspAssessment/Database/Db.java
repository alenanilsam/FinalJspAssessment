package com.telusko.FinalJspAssessment.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
public Connection getConn() throws SQLException {
	
	final String url = "jdbc:mysql://localhost:3306/ecart";
	final String user = "root";
	final String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);
	return con;
}
}
