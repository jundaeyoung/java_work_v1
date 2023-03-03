package ch01;

import java.io.IOException;

public class SystemInTest2 {
// code
	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 엔터를 눌러주세요.");
		int i;
		try {
			// i = System.in.read();
			// 한번 수행되는 코드 --> 반복 (ENTER(\n) 키를 누를때 까지)
			while ((i = System.in.read()) != '\n') {
				// 화면에 출력
				System.out.println(" i: " + i);
				System.out.println("인코딩 : " + (char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main
}// end of class
