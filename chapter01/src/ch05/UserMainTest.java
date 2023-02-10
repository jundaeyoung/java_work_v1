package ch05;

import java.util.Scanner;

public class UserMainTest {

	// 메인 함수
	public static void main(String[] args) {
//		User user1 = new User();

//		Scanner scanner= new Scanner(System.in);
		
//		int userInput1 = scanner.nextInt();
//		//nextInt()  개행 문자를 제거 하지 않았기 때문에 
//		// 바로 아래 코드가 동작하고 완료 되어진다.
//		System.out.println(userInput1);
//		scanner.nextLine();
//		System.out.println("이름을 입력해주세요.");
//		String name = scanner.nextLine();
//		System.out.println("name : " + userInput1);
//		
		
		// 스캐너를 활용해서 값을 입력 받고 화면에 뿌려주세요.
		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		// 정보를 출력해주세요.
		System.out.println("==================");
		// 코드 작성
		User userjun = new User();
		
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("이름을 입력해주세요.");
		userjun.name = scanner.nextLine();
		System.out.println("이름 : " + userjun.name);
		
		System.out.println("아이디를 입력해주세요.");
		userjun.id = scanner.nextLine();
		System.out.println("id : " + userjun.id);
		
		System.out.println("전화번호를 입력해주세요.");
		userjun.tel = scanner.nextLine();
		System.out.println("전화번호 : " + userjun.tel);
		
		System.out.println("주소를 입력해주세요.");
		userjun.location = scanner.nextLine();
		System.out.println("주소 : " + userjun.location);
		
		System.out.println("이메일을 입력해주세요.");
		userjun.email = scanner.nextLine();
		System.out.println("email : " + userjun.email);
		System.out.println("==================");
		
		
		
		
		
		
//		user1.name = "전대영";
//		user1.id = "jdy1787";
//		user1.tel = "01024790492";
//		user1.location = "부산광역시 동래구 쇠미로";
//		user1.email = "jdy1787@naver.com";

		System.out.println(userjun.name);
		System.out.println(userjun.id);
		System.out.println(userjun.tel);
		System.out.println(userjun.location);
		System.out.println(userjun.email);

	}// end of main
}// end of class
