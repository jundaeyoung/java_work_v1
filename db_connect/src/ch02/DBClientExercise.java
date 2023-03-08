package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBClientExercise {

	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static final String DB_NAME = "mydb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_name = "root";
	private static final String DB_PASSWORLD = "1234";
	
	
	private Connection conn;
	private Statement state;
	private ResultSet rs;
	
	public DBClientExercise() {
	}
	
	public Connection getconConnection() {
		if(conn==null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST,DB_PORT,DB_NAME,DB_CHARSET);
		}
		return conn;
	}
	
}
