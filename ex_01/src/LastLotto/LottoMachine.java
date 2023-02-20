package LastLotto;

import java.util.Random;

public class LottoMachine extends Lotto {

	 int[] machineArr = new int[7];
	Random rd = new Random();
	int i;


	// 번호 받기
	@Override
	public void create() {
		// 보너스 번호 따로 받기
		machineArr[6] = rd.nextInt(7) + 1;
		for (i = 0; i < machineArr.length; i++) {
			machineArr[i] = rd.nextInt(7) + 1;
			dedup();
		}
	}

	// 중복 제거
	@Override
	public void dedup() {
		for (int j = 0; j < i; j++) {
			if (machineArr[i] == machineArr[j]) {
				i--;
			}
		}
	}

	// 오름차순
	@Override
	public void ascending() {
		for (int i = 0; i < machineArr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp;
				if (machineArr[i] < machineArr[j]) {
					temp = machineArr[i];
					machineArr[i] = machineArr[j];
					machineArr[j] = temp;
				}
			}
		}
	}

	@Override
	// 랜덤 번호 보기
	public void middleResult() {
		System.out.print("랜덤머신 번호 : ");
		for (int i = 0; i < machineArr.length-1; i++) {
			System.out.print(machineArr[i] + " ");
		}
		System.out.print("  보너스 번호 : ");
		System.out.print(machineArr[6]);
		System.out.println();
	}

	@Override
	public void compare() {
		// TODO Auto-generated method stub
		
	}

}// end of class
