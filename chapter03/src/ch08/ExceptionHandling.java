package ch08;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		// try - catch - finally
		// finally ? 언제 사용할까?
		Scanner sc = new Scanner(System.in);

		try {
			int result = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close(); // 자원 해제 용도로도 많이 사용된다.
		}

	}
}
