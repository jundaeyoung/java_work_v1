package Lotto2;

import java.util.Random;
import java.util.Scanner;

public class Lottomachine {

	static int[] machineArr = new int[7];
	Random rd = new Random();
	int count = 0;
	int bonus = 0;

	// 랜덤값 받기
	// 중복값 제거하기
	public void deDup() {
		machineArr[6] = rd.nextInt(34) + 1;
		for (int i = 0; i < 7; i++) {
			machineArr[i] = rd.nextInt(7) + 1;
			for (int j = 0; j < i; j++) {
				if (machineArr[i] == machineArr[j]) {
					i--;
				}
			}

		}
	}

	// 오름차순
	public void ascending() {
		int temp;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				if (machineArr[i] < machineArr[j]) {
					temp = machineArr[j];
					machineArr[j] = machineArr[i];
					machineArr[i] = temp;
				}
			}
		}

	}

	public void compare() {
		System.out.print("맞춘 갯수 : ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (machineArr[j] == LottoUser.userArr[i]) {
					System.out.print(machineArr[j] + " ");
					count++;
				}
			}
			if (LottoUser.userArr[i] == machineArr[6]) {
				System.out.print(machineArr[i] + " ");
				count++;
				bonus++;
			}
		}
		System.out.println();
		System.out.println("맞춘 개수 : " + count);
		LottoUser.result(count, bonus);
	}
}