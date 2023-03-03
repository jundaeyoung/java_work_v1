package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 ENTER를 누르세요.");
		int i;

		try {
			// 한 바이트 씩 키보드의 값을 일력받아 읽어라.
			// ab를 입력하면 97(a)만 출력된다.
			// 입력
			i = System.in.read();
			// 출력
			System.out.println(i);
			// 컴퓨터 문자표(미리 약속), 인코딩 : 정수값을 문자열로 변환
			System.out.println((char) i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of main

}// end of class
