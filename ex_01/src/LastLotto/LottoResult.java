package LastLotto;

public class LottoResult extends Lotto {

	public void compare() {
		
		LottoUser lottoUser = new LottoUser();
		LottoMachine lottomachine = new LottoMachine();

		int count = 0;
		int bonus = 0;
		
		// 번호를 넣는 동작 처리 
		
		
		
		System.out.print("맞춘 번호 : ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lottoUser.userArr[i] == lottomachine.machineArr[j]) {
					System.out.print(lottomachine.machineArr[j] + " ");
					count++;
				}

			}
			if (lottoUser.userArr[i] == lottomachine.machineArr[6]) {
				System.out.print(lottomachine.machineArr[6] + " ");
				bonus++;
			}
		}

		System.out.println();
		System.out.println("맞춘 개수 : " + count);
		result(count, bonus);
	}

	// 당첨 결과 보기
	public void result(int count, int bonus) {
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

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dedup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ascending() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void middleResult() {
		// TODO Auto-generated method stub
		
	}

}
