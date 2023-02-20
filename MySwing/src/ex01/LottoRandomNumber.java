package ex01;

import java.util.Arrays;
import java.util.Random;

// 기능 구현
// 랜덤 번호 발생시키는 클래스 1~45
// get, set 사용해도댐
// 6개 번호를 리턴하는 기능, 정렬까지  책임
public class LottoRandomNumber {

	final int LOTT_NUMBER_SIXE = 6;

	// 6개 난수 발생 배열 리턴하는 기능
	public int[] getLottoNumber() {
		int[] lottoWinNum = new int[6];
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			// 중복 검증
			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum);
		return lottoWinNum;
	}

}
