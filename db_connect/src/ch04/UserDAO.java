package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO implements IUserDAO {

	private DBClient dbClient;

	public UserDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<UserDTO> select() {
		ArrayList<UserDTO> list = new ArrayList<>();
		Connection conn = dbClient.getconConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM userTBL ");

			while (rs.next()) {
				String username = rs.getString("username");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String moblie = rs.getString("mobile");
				UserDTO dto = new UserDTO(username, birthYear, addr, moblie);
				list.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public int insert(UserDTO dto) {
		String sqlFormat = "INSERT INTO "
				+ "			userTBL(username, birthYear,addr, mobile) "
				+ " 		VALUES ('%s', '%S', '%s','%s') ";
		String sql = String.format(sqlFormat, dto.getUsername(),dto.getBirthYear(),
											  dto.getAddr(),dto.getMobile());
		
		Connection conn = dbClient.getconConnection();
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.err.println("잘 확인해주세요.");

			}
			
		}
		
		
		return resultRowCount;
	}

	@Override
	public int update(UserDTO dto, String targetUserName) {
		
		String sqlFormat = "UPDATE userTBL "
				+ "	SET birthYear = '%s', addr = '%s', "
				+ "		mobile = '%s' "
				+ "	WHERE username = '%s' " ;
		String sql = String.format(sqlFormat, dto.getBirthYear(),dto.getAddr(),
				dto.getMobile(),targetUserName);
		
		int resultRow = 0;
		
		try(
			Connection conn = dbClient.getconConnection();
			Statement stmt = conn.createStatement();
			){			
				resultRow = stmt.executeUpdate(sql);		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public boolean delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM userTBL "
				+ "WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);
		
		Connection conn = dbClient.getconConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			isOk = false;
			// 실행의 흐름이 여기로 빠졌을 경우
			// 구매 테이블에 데이터가 남아 있어서 유저 테이블에
			// 삭제가 불가능하다.
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isOk;
	}

}
