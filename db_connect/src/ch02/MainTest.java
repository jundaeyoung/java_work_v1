package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {
	public static void main(String[] args) {
		
		DBClient client = new DBClient();
		Connection conn = client.getconConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM student ";
			ResultSet rs = stmt.executeQuery(queryStr);// 결과를 ResultSet에 담김
			// 결과를 뽑는 기술
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				
				System.out.print("id : "+id+" \t");
				System.out.print("id : "+name+" \t");
				System.out.print("id : "+grade+" \t");
				System.out.print("id : "+schoolId+" \t");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
