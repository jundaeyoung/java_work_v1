package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 DB 에 접근해서 기능을 처리해주는 녀석
public class EmployeeDAO  implements IEmployeeDAO {
	
	private DBHelper dbHelper;
	private Connection conn;
//	private Statement stmt;
	// statement 보다 약간 더빠르다. cash 기반
	// 단 첫번째 호출에서는 성능 똑같음
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmployeeDAO(){
//		dbHelper.getConnection().createStatement().execute(null);
		// DBHelper 객체를 가지고 오는 동작
		dbHelper = DBHelper.getInstance();
		// DBHelper 에서 connection 객체를 가지고 오는 동작
		conn = dbHelper.getConnection();
		
	}// end of EmployeeDAO
	
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title){
	ArrayList<EmployeeDTO> list = new ArrayList<>();
	
	String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title "
			+ " FROM employees AS e "
			+ " INNER JOIN titles AS t "
			+ " ON e.emp_no = t.emp_no "
			+ " WHERE t.title = ? " ;
	// prepareStatment 시작 번호는 1번 부터 시작한다. ' ' <- 생략가능 ? 기반으로 사용가능
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			EmployeeDTO dto = new EmployeeDTO();
			System.out.println(rs.getString("emp_no"));
			dto.setEmpNo(rs.getString("emp_no"));
			dto.setFirstName(rs.getString("first_name"));
			dto.setLastName(rs.getString("last_name"));
			dto.setTitle(rs.getString("title"));
			list.add(dto);
		}
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return list;
	}

	
	// 풀 네임받아 직원에 연봉받은 횟수를 반환하는 기능을 만들어 주세요.
	@Override
	public ArrayList<EmployeeDTO> showCountSalary(String firstName, String lastName) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		

		String sql = " SELECT e.first_name,e.last_name ,count(s.salary) AS count "
				+ " FROM employees AS e "
				+ " JOIN salaries AS s "
				+ " ON e.emp_no = s.emp_no "
				+ " GROUP BY e.emp_no "
				+ " HAVING first_name = ? "
				+ " AND last_name = ?  " ;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setCount(rs.getString("count"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}// end of class
