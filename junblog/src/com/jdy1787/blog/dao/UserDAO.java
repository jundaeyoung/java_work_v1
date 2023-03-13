package com.jdy1787.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdy1787.blog.dto.UserDTO;
import com.jdy1787.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbhelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbhelper = new DBHelper();
		conn = dbhelper.getConnection();
	}
	
	
	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user " + "	(username ,password,email,address,userRole,createDate) "
				+ " VALUES(? , ? , ? , ? , ? , now()) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser 함수에서 오류발생");
			e.printStackTrace();
		}
		
		
		return resultRow;
	}

	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		String query =" SELECT * "
				+ " FROM user "
				+ " WHERE username = ? "
				+ " AND password = ? ";
		
		try {
			pstmt  = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;
			}
		} catch (SQLException e) {
			System.out.println(">> userDAO 회원찾기시 에러 발생 <<");
			e.printStackTrace();
		}
		
		return resultUser;
	}


	@Override
	public UserDTO delete(String username, String password) {
		String query = " DELETE FROM user "
				+ " WHERE username = 'jun1' "
				+ "	AND password = '1234' ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			System.out.println("userDAO 회원탈퇴시 에러발생");
			e.printStackTrace();
		}
		
		return null;
	}

}
