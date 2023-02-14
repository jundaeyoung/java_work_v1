package ch05;

public class UserInfoMysqlDao implements IUserInfoDao{
	// DB 연결은 코드작성( 이름, pw)
	// 질의어 생성
	// 결과 집합
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL :  저장 기능 호출");
		System.out.println("이름 :" + userInfo.getuserName());
		System.out.println("pw : "+ userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL :  수정 기능 호출");
		System.out.println("이름 :" + userInfo.getuserName());
		System.out.println("pw : "+ userInfo.getPw());
		
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MYSQL :  삭제 기능 호출");
		System.out.println("이름 :" + userName);
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MYSQL :  선택 기능 호출");
		System.out.println("이름 :" + userName);
		
	}

	// DAO -> 
	// 앞단에서 던져 준 데이터를 가지고 -- DB에 값을 밀어 넣는 기능
	
	
	
}
