package ch08;

import java.io.FileInputStream;

public class MainTest2 {

	public static void main(String[] args) {

		try {
			int result = 10 / 0;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println(" 0으로는 나눌수 없습니다.");
		}
		
		Calculator cal = new Calculator();
		try {
			cal.Selector();
		} catch (Exception e) {
			System.out.println("0으로는 나눌수 없습니다.");
		}

		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리 까지 작성해 주세요.
		// 1. try
		// 2. 클래스 설계 throws 활용
	}
}

class Calculator {

	public void Selector() throws ArithmeticException {
		int result1 = 10 / 0;

	}
}

// throws는 클래스 설계
