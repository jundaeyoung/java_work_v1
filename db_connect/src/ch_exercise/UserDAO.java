package ch_exercise;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class UserDAO implements IUserDAO{

	private DBClient dbClient;
	PreparedStatement pstmt;
	Connection conn;
	public UserDAO() {
		initData();
	}
	private void initData() {
		dbClient = new DBClient();
	}
	
	
	@Override
	public ArrayList<UserDTO> select(String content) {
		ArrayList<UserDTO> list = new ArrayList<>();
		conn = dbClient.getConnection();
		pstmt = null;
		ResultSet rs = null;
		String sqlFormat = " SELECT * "
				+ " FROM user "
				+ " where name "
				+ " =  ?  " ;
		String sql = String.format(sqlFormat);
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, content);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				UserDTO dto = new UserDTO(id, name, email);
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//	@Override
//	public int insert(UserDTO dto) {
//		String sqlFormat = " INSERT INTO user "
//				+ " VALUES "
//				+ "	(?,?,?) ";
//		String sql = String.format(sqlFormat,dto.getId(),dto.getName(),dto.getEmail());
//		Connection conn = dbClient.getConnection();
//		Statement stmt = null;
//		int resultRowCount = 0;
//		try {
//			stmt = conn.createStatement();
//			resultRowCount = stmt.executeUpdate(sql);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				conn.close();
//				stmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//				System.err.println("잘 확인해주세요.");
//
//			}
//			
//		}
		
		
//		return resultRowCount;
//	}
	@Override
	public int update(UserDTO dto, String targetUser) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(String username) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(UserDTO dto) {
		
		String sql = " INSERT INTO user "
				+ " VALUES "
				+ "	(?,?,?) ";
		conn = dbClient.getConnection();
		int resultRowCount = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return resultRowCount;
	}


}
