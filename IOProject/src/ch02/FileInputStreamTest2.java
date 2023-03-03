package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	// code
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			int i;
			// file은 마지막에 읽을 값이 없다면 -1을 반환합니다.
			System.out.println(">>>>기사 시작<<<<");
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println("\n>>>>기사 종료<<<<");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없어요.");
		} catch (IOException e) {
			System.out.println("입력 스트립 동작시 오류");
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end of main
}// end of class
