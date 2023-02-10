package ch04;

import java.util.Iterator;

public class ContinueMainTest1 {

	public static void main(String[] args) {
		// 무시하고 계속 진행하는 continue 문
		// 3의 배수이면 출력하지마세요.
		for (int i = 0; i < 11; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println("현재 값 : " + i); // 7이면 출력하고 싶지 않음
		}

	}

}
