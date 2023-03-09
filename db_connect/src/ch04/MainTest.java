package ch04;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		// 데이터 베이스에 접근해서 memberTBL에 대한 정보
		// 데이터 베이스에 접근해서 userTBl 에 대한 정보

		UserDAO userDAO = new UserDAO();
		
		// insert 확인
//		UserDTO.insertDto = new UserDTO("뉴진스", "2020", "제주", "010-1234-1234");
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", "2020", "경기도", "010-1234-1234"));
//		System.out.println("rowCount : " + rowCount );
		
		
		
//		// select 확인
//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).getUsername());
//			System.out.print(list.get(i).getBirthYear());
//			System.out.print(list.get(i).getAddr());
//			System.out.print(list.get(i).getMobile());
//			
//			System.out.println();
		//update확인
//		UserDTO dto = new UserDTO("뉴진스", "1995", "부산", "010-2222-2222");
//		int updateRowCount = userDAO.update(dto, dto.getUsername());
//		System.out.println("updateRowCount : " + updateRowCount);
		
		// delete 확인
		// 야스오는 구매 테이블 이력이 없기때문에 유저 테이블에서
		// 바로 삭제 할 수 있다.
		// 이승기는 구매 테이블 이력에 남아있기 때문에
		// 바로 삭제 할 수 없다.
//		userDao.delete("이승기");
		boolean isDelete = userDAO.delete("이승기");
		System.out.println("isDelete : "+isDelete);
		if(isDelete ==false) {
			System.out.println("구매 테이블에 이력이 남아 있을 수 있습니다.");
			
		}
		
	}
}

