package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능 구현
// 랜덤 번호 발생시키는 클래스 1~45
// get, set 사용해도댐
// 6개 번호를 리턴하는 기능, 정렬까지  책임
public class LottoRandomNumber {
	
	private int[] lotto = new int[6];
	
	
	public int[] getLotto() {
		return lotto;
	}


	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}


	// 랜덤값 생성
	public int[] getLottoNumber() {

		Random rd = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = rd.nextInt(45) + 1;
			lotto[i] = j;
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i--;
					break;

				}

			}
		}
	Arrays.sort(lotto);
	return lotto;
	}


}
