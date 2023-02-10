package ex_01;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
			}
		}
	}
}