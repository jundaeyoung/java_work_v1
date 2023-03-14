package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.BlogDTO;
import com.tenco.blog.utils.DBHelper;

public class BlogDAO implements IBlogDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public BlogDAO() {

		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int save(String title, String content, int userId) {
		int resultRowCount = 0;
		String query = " INSERT INTO board(title,content,userId) " + " VALUES " + "	( ? , ? , ?) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			resultRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">>blogDAO save에서 에러발생<<");
			e.printStackTrace();
		}
		return resultRowCount;
	}

	@Override
	public BlogDTO select(int boardId) {
		BlogDTO blogDTO = null;
		String query = "SELECT * FROM board WHERE id = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BlogDTO dto = new BlogDTO();
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setReadCount(rs.getInt("readCount"));
				dto.setUserId(rs.getInt("userId"));
				blogDTO = dto;
			}
		} catch (Exception e) {
			System.out.println(">>blog select 에러 발생<<");
			e.printStackTrace();
		}
		return blogDTO;
	}

	@Override
	public void update(BlogDTO dto,String targetBuyName) {
		String query = " update board "
				+ " set title = '두번째 게시글' "
				+ " WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getUserId());
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(int boardId) {
		String query = " DELETE FROM board WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> blogDAO delete 에러 발생 <<");
			e.printStackTrace();
		}

	}

}
