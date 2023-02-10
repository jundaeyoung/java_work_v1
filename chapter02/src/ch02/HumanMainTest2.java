package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//스캐너를 활용해서 값을 할당해 주세요.
		Human human = new Human();
		System.out.println("이름을 입력해주세요.");
		human.name=scanner.nextLine();
		System.out.println("키를 입력해주세요.");
		human.height=scanner.nextInt();
		System.out.println("몸무게를 입력해주세요.");
		human.weight=scanner.nextInt();
		System.out.println("남자인가요?");
		human.isMan=scanner.nextBoolean();
		
		
		//심화 / 0번 입력시에 showInfo 호출 기능 만들어 보기
		human.num=scanner.nextInt();
		System.out.println("0을 입력하여 상태창을 출력하세요");
		 if (human.num==0) {
				human.showInfo();
			 }

		// 스캐너를 통해서 showInfo 메서드 호출 기능 만들어보기
		//마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요.
	}

}
