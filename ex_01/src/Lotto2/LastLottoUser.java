package Lotto2;

import java.util.Scanner;

public class LastLottoUser extends LastLotto {

	LastLottoMachine lottomachine= new LastLottoMachine();
	
	Scanner sc = new Scanner(System.in);
	int[] userArr = new int[6];
	int i;
	int count;
	int bonus;

	// 번호 입력 받기
	public void create() {
		System.out.println("번호 6자리를 입력해주세요.");
		for (i = 0; i < userArr.length; i++) {
			userArr[i] = sc.nextInt();
			dedup();
		}
	}

	// 중복값은 받지 않기
	public void dedup() {
		for (int j = 0; j < i; j++) {
			if (userArr[i] == userArr[j]) {
				System.out.println("중복된 값입니다. 다시 입력해주세요.");
				i--;
			}
		}
	}

	// 오름차순
	public void ascending() {
		for (int i = 0; i < userArr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp;
				if (userArr[i] < userArr[j]) {
					temp = userArr[i];
					userArr[i] = userArr[j];
					userArr[j] = temp;
				}
			}
		}
	}

	// 결과 값 출력하기
	public void result() {
		for (int i = 0; i < userArr.length; i++) {
			System.out.print(userArr[i] + " ");
		}
		System.out.println();

	}

	public void compare() {
		lottomachine.create();
		for (int i = 0; i < userArr.length; i++) {
			for (int j = 0; j < userArr.length; j++) {
				if(userArr[i] == lottomachine.randomArr[j]) {
				count++;
				}
			}
		}
		System.out.println("맞춘 갯수 : " + count);
		if (count >= 6) {
			System.out.println("축하합니다. 1등입니다.");
		} else if (count >= 5) {
			System.out.println("축하합니다. 2등입니다.");
		} else if (count >= 4) {
			System.out.println("축하합니다. 3등입니다.");
		} else if (count >= 3) {
			System.out.println("축하합니다. 4등입니다.");
		} else if (count >= 2) {
			System.out.println("축하합니다. 5등입니다.");
		} else {
			System.out.println("낙첨입니다.");

		}
	}


}
