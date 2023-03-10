package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {

	private DBClient dbClient;

	public BuyDAO() {
		initData();

	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buyTBL ");

			while (rs.next()) {
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				BuyDTO dto = new BuyDTO(username, prodName, price, amount);
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public int insert(BuyDTO dto) {
		String sqlFormat = "INSERT INTO\r\n " + "	buyTBL(username,prodName,price,amount )\r\n "
				+ "VALUES ('%s','%s',%d,%d )";
		String sql = String.format(sqlFormat, dto.getUsername(), dto.getProdName(), dto.getPrice(), dto.getAmount());

		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int update(BuyDTO dto, String targetBuyName) {
		String sqlFormat = "UPDATE buyTBL "
				+ "SET prodName =%d "
				+ "WHERE username ='%s' ";
		
		String sql = String.format(sqlFormat, dto.getPrice(),targetBuyName);
		
		int resultRow = 0 ;
		
		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			resultRow = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultRow;
	}

	@Override
	public void delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE From buyTBL "
				+ "WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			isOk = false;
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}


}
