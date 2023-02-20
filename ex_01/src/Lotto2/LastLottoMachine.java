package Lotto2;

import java.util.Random;

public class LastLottoMachine extends LastLotto{

	 int[] randomArr = new int[6];
	Random rd = new Random();
	int i;

	// 랜덤 값 생성하기
	public void create() {
		for (i = 0; i < randomArr.length; i++) {
			randomArr[i] = rd.nextInt(6) + 1;
			dedup();
		}

	}

	// 중복 막기
	public void dedup() {
		for (int j = 0; j < i; j++) {
			if (randomArr[i] == randomArr[j]) {
				i--;
			}
		}
	}

	// 오름차순
	public void ascending() {
		for (int i = 0; i < randomArr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp;
				if (randomArr[i] < randomArr[j]) {
					temp = randomArr[i];
					randomArr[i] = randomArr[j];
					randomArr[j] = temp;
				}
			}
		}
	}
	// 결과값 출력하기
	public void result() {
		for(int i=0; i<randomArr.length; i++) {
			System.out.print(randomArr[i]+" ");
		}
		System.out.println();
	}

}
