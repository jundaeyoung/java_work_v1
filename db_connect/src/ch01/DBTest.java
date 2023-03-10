package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	// 준비물
	// 자바코드서 MySQL 서버 접속을 해야 하기 때문에 필요사항
	// 계정 정보, 비밀번호
	// 접속경로 : URL(주소)
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	private static final String USERNAME = "root";
	private static final String PASSWORLD = "1234"; // 본인 pw 작성
	private static final String URL = "jdbc:mysql://localhost:3306/showdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	// DB 접근 기술 - 필요한 클래스들이 있다.
	static Connection connect; // 커넥션 연결 객체
	static Statement stmt; // 문자열들을 SQL 변경하거나 명령문을 실행시켜주는 녀석
	static ResultSet rs;

	public static void main(String[] args) {

		// 드라이버 로드 - 컴파일 시점에 선언해서 사용하는 방법이 아닌 동적 로딩
		// 동적 로딩이란 실행시에 객체를 메모리에 올리는 것을 말한다.
		try {
			// 클래스가 없을수도 있기 때문에 예외처리해준다.
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Driver <- 동작을 시켜야함
			connect = DriverManager.getConnection(URL, USERNAME, PASSWORLD);
			// 연결객체에서 Statement 녀석을 뽑아낼수 있음
			stmt = connect.createStatement();

			String sql = "SELECT * FROM userTBL ";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String username = rs.getString("username");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				System.out.println(username + "," + birthYear + "," + addr + "," + mobile);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
