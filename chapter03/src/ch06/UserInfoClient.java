package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "Oracle"; // MYSQL을 MSSQL로 바꾸면 그대로 사용가능
	private static Object inputUserSelect;
	
	//메인 함수 --> 실행하는 코드 작성
	public static void main(String[] args) {
		
	// UserInfoOracleDao 만들어 주세요
	// 스캐너 통해서 사용자 이름, 사용자 비번을 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름을 입력해주세요");
		String inputUserName = sc.nextLine();
		System.out.println("사용자 비번을 입력해주세요");
		String inputUserPw = sc.nextLine();
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		System.out.println("1번 저장하기 2번 수정하기");
		String inputUserSelect = sc.nextLine();

		
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("Oracle")) { 
			dao = new UserInfoOracleDao();
		}else if(UserInfoClient.dbName.equals("MYSQL")){
			dao = new UserInfoMySqlDao();
		}else {
			dao = new UserInfoMsSqlDao();

		}

		if(inputUserSelect.equals("1")) {
			dao.insertUserInfo(userInfo);
		}else {
		dao.updateUserInfo(userInfo); // 수정하는기능
		}
	//흐름 만들기
	//1. 저장기능, 2 수정기능
	// dbName을 변경해 가면서 코드 동작 확인해 주세요!
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
