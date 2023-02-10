package ex13;

import java.util.Random;

public class MainTest {
	public static void main(String[] args) {

		// 우리반 학생 이름들을 배열에 담아 주세요.
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요.
		int i;
		int number;

		int[] myNumbers = new int[10];
		int num;

		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		for (i = 0; i < myNumbers.length; i++) {
			num = 0;
			for (number = 0; number < myNumbers.length; number++) {

				if (myNumbers[i] < myNumbers[number]) {
					//10 = 0
					num=myNumbers[i];
					//100 = 0
					myNumbers[i] = myNumbers[number];
					myNumbers[number]=num;
				}

			}
			
		}
		for(int j=0;j<10;j++) {
		System.out.println(myNumbers[j]);
		}
	}
}
