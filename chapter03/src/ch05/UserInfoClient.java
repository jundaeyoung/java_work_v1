package ch05;

public class UserInfoClient {

	static String dbName = "MYSQL"; // MYSQL을 MSSQL로 바꾸면 그대로 사용가능
	
	//메인 함수 --> 실행하는 코드 작성
	public static void main(String[] args) {
		
		// 사용자한테 정보를 입력 받는다. 
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상, pw 특수 포함
		String inputUserName = " 홍길동 ";
		String inputUserPw = "1234";
		// 위에서 받은 데이터를 object로 타입 변환  --> DTO라고 부름
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) { 			//MYSQL을 MSSQL로 바꾸면 그대로 사용가능
			dao = new UserInfoMysqlDao();
		}else {
			dao = new UserInfoMsSqlDao();
		}

		dao.insertUserInfo(userInfo);
			
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
