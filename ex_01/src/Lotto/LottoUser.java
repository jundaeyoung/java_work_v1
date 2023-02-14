package Lotto;

import java.util.Random;
import java.util.Scanner;

public class LottoUser {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random(45);

		int[] userArr = new int[6];

		for (int i = 0; i < 6; i++) {
			System.out.print("로또 번호를 입력 해주세요.");
			if (sc.nextInt() <= 0 || sc.nextInt() >= 45) {
				System.out.println("잘못된 번호입니다.");
			} else {
				userArr[i] = sc.nextInt();
			}
		}

	}

}