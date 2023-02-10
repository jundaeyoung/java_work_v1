package ex12;

import java.util.Scanner;

public class MainTest1 {
	public static void main(String[] args) {

		Computer[] computer = new Computer[300];

		Scanner sc = new Scanner(System.in);
		computer[0] = new DeskTop();
		computer[1] = new DeskTop();
		computer[2] = new MyNoteBook();

		// computer.length --> 300
		// 3 개
		for (int i = 0; i < computer.length; i++) {
			if (computer[i] != null) {
				 computer[i].display();
				 if(computer[i] instanceof MyNoteBook) {
					 System.out.println("좋은 노트북을 구매했네요");
				 }
			}
		}
	}
}
