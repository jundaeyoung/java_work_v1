package LastLotto;

import java.util.Iterator;
import java.util.Scanner;

public class LottoUser extends Lotto {
	 int[] userArr = new int[6];
	Scanner sc = new Scanner(System.in);

	int i;
	int count;
	int bonus;

	// 번호 받기
	@Override
	public void create() {
		System.out.println("번호 6개를 입력해주세요.");
		for (i = 0; i < userArr.length; i++) {
			userArr[i] = sc.nextInt();
			dedup();
		}
	}

	// 중복 제거
	@Override
	public void dedup() {
		for (int j = 0; j < i; j++) {
			if (userArr[i] == userArr[j]) {
				System.out.println("중복된 값입니다. 다시 입력해주세요.");
				i--;
			}
		}
	}

	// 오름차순
	@Override
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

	@Override
	// 입력한 번호 보기
	public void middleResult() {
		System.out.print("입력한 번호 : ");
		for (int i = 0; i < userArr.length; i++) {
			System.out.print(userArr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void compare() {
		// TODO Auto-generated method stub
		
	}

	

}// end of class
