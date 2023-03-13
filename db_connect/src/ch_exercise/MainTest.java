package ch_exercise;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		// select 확인
		ArrayList<UserDTO> list = userDAO.select("이승기");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getEmail() + "\t");
			System.out.println();
		}
		
		// DELETE 확인
//		userDAO.delete();
	}
}
