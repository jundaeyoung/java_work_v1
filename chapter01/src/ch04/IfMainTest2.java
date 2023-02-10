package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	// main 함수
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		// 100 ~ 90 --> A
		// 89이하 80이상 B학점 입니다.
		// 79이하 70이상 C학점 입니다.
		// 69이하 60이상 D학점 입니다.
		// 나머지는 F 학점입니다.
		
		char result = 'Z';
		

		if (point <= 100 && point >= 90) {
			result = 'A';
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} 
		//방어적 코드를 작성
		if (result == 'Z') {
			System.out.println("값을 잘못 입력 하였습니다.");
		}else {
		System.out.println(result + "학점입니다.");
		}
	}// end of main

}// end of class
