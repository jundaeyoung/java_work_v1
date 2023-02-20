package Lotto2;

import java.util.Scanner;

public class LottoUser {

	static int[] userArr = new int[6];
	Scanner sc = new Scanner(System.in);
	int i = 0;

	public void create() {
		System.out.println("번호 6개를 입력해주세요.");

		for (i = 0; i < 6; i++) {
			userArr[i] = sc.nextInt();
			deDup();
		}
	}

	// 중복 제거
	public void deDup() {
		for (int j = 0; j < i; j++) {
			if (userArr[i] == userArr[j]) {
				System.out.println("중복된 번호입니다. 다시 입력해주세요.");
				i--;
			}
		}

	}

	public void ascending() {
		int temp;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (userArr[i] < userArr[j]) {
					temp = userArr[i];
					userArr[i] = userArr[j];
					userArr[j] = temp;

				}

			}
		}
	}

	public static void result(int count, int bonus) {
		if (count >= 5 && bonus != 1) {
			System.out.println("1등입니다.축하합니다.");
		} else if (count >= 5 && bonus == 1) {
			System.out.println("2등입니다. 축하합니다.");
		} else if (count == 5) {
			System.out.println("3등입니다. 축하합니다.");
		} else if (count == 4) {
			System.out.println("4등입니다. 축하합니다.");
		} else if (count == 3) {
			System.out.println("5등입니다. 축하합니다.");
		} else if (count < 3) {
			System.out.println("낙첨입니다.");
		}

	}
	
	public void print() {
		System.out.print("로또 머신 : ");
		for (int i = 0; i < 7; i++) {
			System.out.print(Lottomachine.machineArr[i] + " ");
		}
		System.out.print("보너스 점수 : "+Lottomachine.machineArr[6]);
		System.out.println();
		System.out.print("사용자 입력 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(userArr[i] + " ");
		}
		System.out.println();
		
	}

}// end of class