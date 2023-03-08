package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class exer {

	private static final String USERNAME = "root";
	private static final String PASSWORLD = "1234";
	private static final String URL = "jdbc:mysql://localhost:3306/showdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	static Connection connect;
	static Statement state;
	static ResultSet rs;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(URL,USERNAME,PASSWORLD);
			state = connect.createStatement();
			
			String sql = "SELECT * FROM userTBL";
			rs=state.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
