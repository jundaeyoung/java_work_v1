package Lotto2;

import java.util.Random;

public class MainTest {


	
	public static void main(String[] args) {

		Lottomachine lottoMachine = new Lottomachine();
		LottoUser lottoUser = new LottoUser();

		lottoMachine.deDup();
		lottoMachine.ascending();
		lottoUser.create();
		lottoUser.ascending();
		lottoUser.print();
		lottoMachine.compare();

		
		
		// 비교 하기
//		System.out.print("맞춘 갯수 : ");
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 7; j++) {
//				if (lottoMachine.machineArr[j] == lottoUser.userArr[i]) {
//					System.out.print(lottoMachine.machineArr[j]+ " ");
//					count++;
//				}
//
//			}
//			if(lottoUser.userArr[i]==lottoMachine.machineArr[6]) {
//				System.out.print(lottoMachine.machineArr[i]+ " ");
//				count++;
//				bonus++;
//			}
//		}
//		System.out.println();
//		System.out.println("맞춘 개수 : " + count);
//		
	}

	

}