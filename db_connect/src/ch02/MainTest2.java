package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {
	public static void main(String[] args) {

		DBClient client = new DBClient();
		DBClient.setDB_NAME("showdb");
//		dbClient.setDB_NAME("showdb");

		// DB 접근 구현 코드 처리
		// 자료 구조 선언, 담을 데이터를 클래스로 모델링
		ArrayList<City> list = new ArrayList<>();
		Connection connection = client.getconConnection();
		try {
			Statement state = connection.createStatement();
			String str = "SELECT * FROM city";
			ResultSet rs = state.executeQuery(str);
			
			while(rs.next()) {
				City city = new City(rs.getInt("city_id"), rs.getString("name"));
				list.add(city);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}

class City {
	private int city_id;
	private String name;

	public City(int city_id, String name) {
		super();
		this.city_id = city_id;
		this.name = name;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", name=" + name + "]";
	}

}
