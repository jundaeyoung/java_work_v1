package ch04;

import java.util.Scanner;

public class WhileMainTest2 {
	// 메인 작업자(메인쓰레드)
	public static void main(String[] args) {

//		do {
//			
//		}while(조건식);

		// 사용자가 0을 입력하면 프로그램을 종룔하는 코드를 만들어 주세요.
		System.out.println("값을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int userInput = -1;

		int num = 1;
		int sum = 0;
		do {
			System.out.println("값을 입력해주세요.");
			userInput = sc.nextInt();
			// 조건에 관계 없이 한번은 수행되는 반복 문
			// 한번 코드를 수행하고
			// 다시 사용자 입력값을 받고싶다면
			sum += userInput;
			System.out.println("연산된 값 : " + sum);
		} while (true);

//		while(true) {
//			System.out.print("-");
//			
//			//작업자 힘드니깐 1초 잠들어
//			try {
//				// 쓰래드
//				Thread.sleep(100);			
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//		}//end of while

	}// end of main

}// end of class
