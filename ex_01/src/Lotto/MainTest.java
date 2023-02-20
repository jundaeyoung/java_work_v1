package Lotto;

import java.util.Random;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {

		int count = 0;
		int bonus = 0;

		int[] userArr = new int[6];
		int[] lottoArr = new int[7];

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// 사용자 입력
		for (int userInput = 0; userInput < 6; userInput++) {
			System.out.print("로또 번호를 입력 해주세요.");
			int userNum = sc.nextInt();
			userArr[userInput] = userNum;
			// 범위밖의 값 입력
			if (userArr[userInput] <= 0 || userArr[userInput] > 45) {
				System.out.println("잘못된 번호입니다.");
				userInput--;
			}
			// 중복값 제거
			for (int i = 0; i < userInput; i++) {
				if (userArr[userInput] == userArr[i]) {
					System.out.println("중복된 값입니다. 다시 입력해주세요.");
					userInput--;
				}
				// 오름차순 정렬
				if (userArr[userInput] < userArr[i]) {
					int temp = userArr[userInput];
					userArr[userInput] = userArr[i];
					userArr[i] = temp;
				}
			}

			// 사용자 입력 결과값
			System.out.println(userNum);
		}

		// 머신 추첨
		lottoArr[6] = rd.nextInt(45) + 1;
		for (int i = 0; i < 6; i++) {
			lottoArr[i] = rd.nextInt(45) + 1;
			// 중복값 제거
			if (lottoArr[i] == lottoArr[6]) {
				i--;
			}
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] == lottoArr[j]) {
					i--;
				}
			}
		}
//		for(int i = 0; i < lottoArr.length; i++) {
//			lottoArr[i] = rd.nextInt(7) + 1;			
//			for(int j = 0; j < i; j++) {
//				if(lottoArr[i] == lottoArr[j]) {
//					i--;
//				}
//			}
//		}
		// 보너스 번호 중복값 제거
		System.out.print(" 사용자 입력 로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(" " + userArr[i]);

		}
		// 머신 오름차순
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] < lottoArr[j]) {
					int temp = lottoArr[i];
					lottoArr[i] = lottoArr[j];
					lottoArr[j] = temp;
				}

			}
		}
		System.out.println();
		System.out.print(" 당첨 로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(" " + lottoArr[i]);

		}
		System.out.println("  보너스 번호 : " + lottoArr[6]);
		// 사용자 입력 번호와 로또 머신 번호 비교
		System.out.print("당첨된 번호 : ");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (userArr[i] == lottoArr[j]) {
					count++;
					if (userArr[i] == lottoArr[6]) {
						bonus++;
					}
					System.out.print(userArr[i]);
				}
			}
		}
		// 당첨 결과
		System.out.println();
		System.out.println("당첨갯수 : " + count);
		if (count >= 6 && bonus == 0) {
			System.out.println("축하합니다. 1등 입니다.");
		} else if (count >= 5 && bonus == 1) {
			System.out.println("축하합니다. 2등입니다.");
		} else if (count == 5) {
			System.out.println("축하합니다. 3등입니다.");
		} else if (count == 4) {
			System.out.println("축하합니다. 4등입니다.");
		} else if (count == 3) {
			System.out.println("축하합니다. 5등입니다.");
		} else if (count <= 2) {
			System.out.println("아쉽지만 낙첨입니다.");
		}

	}

}