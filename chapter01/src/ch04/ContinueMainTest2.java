package ch04;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {

		// 스캐너를 사용해서 사용자에 정수 값을 입력받아서 배수에 갯수를
		// 출력하는 프로그램을 만들어 보세요.
		// 테스트 값은 1000, ( 3 입력하면 ) 3의 배수가 몇개 있는지 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		final int MULTIPLE = sc.nextInt();
		System.out.println(" 몇까지 확인 하겠습니까?");
		final int MAX = sc.nextInt();

		int count = 0;
		for (int num = 1; num < MAX; num++) {
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			}
		}
		System.out.println(MULTIPLE + "의 배수는 : " + count + "개 입니다.");
	}

}
