package ch04;

public class WhileMainTest1 {
//main 작업자
	public static void main(String[] args) {

		// 1 ~ 10 연산코드
		int num = 1;
		int sum = 0;
		int userInput = 345;
		// while(조건식) {수행문};
		while (num <= userInput) {
			System.out.println(" 현재 값 : " + num); // 무한 루프에 조심
			// sum = sum + num;
			sum += num;
			num++;
		}
		System.out.println(" 연산에 대한 결과 값 : " + sum + " 입니다.");

	}// end of main

}// end of class
