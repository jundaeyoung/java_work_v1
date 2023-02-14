package ch04;

public class UserInfoClient {

	//메인 함수 --> 실행하는 코드 작성
	public static void main(String[] args) {
		
		// 사용자한테 정보를 입력 받는다. 
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상, pw 특수 포함
		String inputUserName = " 홍길동 ";
		String inputUserPw = "1234";
		// 위에서 받은 데이터를 object로 타입 변환  --> DTO라고 부름
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		//	userInfo.showInfo();
		
		// 위에는 클라이언트 쪽 코드(개발자 작성)
		
		/////////////////////////////
		
		// 동작이 사용자의 정보를 입력하는 기능이 필요하다면 
		// 필요한 객체를 가져와서 사용하기만 하면 된다.
		UserInfoMysqlDao dao = new UserInfoMysqlDao();
		
		//		dao.insertUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
		
//		dao.insertUserInfo(userInfo); // 저장하는기능
//		dao.updateUserInfo(userInfo); // 수정하는기능
//		dao.deleteUserInfo(userInfo.getuserName()); // 삭제 하는 기능
//		dao.selectUserInfo(userInfo.getuserName()); // 조회 하는 기능
		
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
