package ch04;

import java.util.Scanner;

public class MainTest5 {

	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100 의 배수이면서 400의 배수인 해는 윤년
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("계산한 년도를 작성해주세요.");
			int i=sc.nextInt();
			
			if (i % 400 == 0 && i % 100 == 0) {
				System.out.println(i+"년은 윤년입니다.");
			} else if (i % 100 == 0 && i % 4 == 0) {
				System.out.println(i+"년은윤년이 아닙니다.");
			} else if (i % 4 == 0) {
				System.out.println(i+"년은윤년입니다.");
			} else {
				System.out.println(i+"년은윤년이 아닙니다.");
			}
		
	}
}
