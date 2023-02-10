package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면 만들어주지않는다.
		
		// 4가지 방법으로 객체 생성
		UserInfo userHong = new UserInfo();
		userHong. userId = "hong123";
		userHong. userName = "홍길동";
		userHong.phone = "1234";
		System.out.println(userHong.userId);
		System.out.println(userHong.userName);
		System.out.println(userHong.phone);
		System.out.println("---------------------");

		
		UserInfo userKim = new UserInfo("hong123", "김덕배", "1234");
		System.out.println(userKim.userId);
		System.out.println(userKim.userName);
		System.out.println(userKim.phone);
		System.out.println("---------------------");
		
		UserInfo userLee = new UserInfo("Lee123", "이소룡");
		System.out.println(userLee.userId);
		System.out.println(userLee.userName);
		System.out.println(userLee.phone);
		System.out.println("---------------------");

		
		UserInfo userJun = new UserInfo("Jun123");
		System.out.println(userJun.userId);
		System.out.println(userJun.userName);
		System.out.println(userJun.phone);
		System.out.println("---------------------");


		
	}

}
