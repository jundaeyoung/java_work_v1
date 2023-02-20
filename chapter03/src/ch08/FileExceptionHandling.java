package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {
	public static void main(String[] args) {

		// 파일 <-- IO
		FileInputStream fis = null;

//		try {
//			fis = new FileInputStream("temp"); // < - 예외가 발생할수 있는 코드
//
//		} catch (FileNotFoundException f) {
//			System.out.println("temp라는 파일이 없습니다.");
//		}
		
		// try- catch-finally
		
		try {
			fis = new FileInputStream("test1.txt");
			return;
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("파일명 확인해주세요.");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 반드시 수행되는 코드
			// 심지어 return 키워드를 사용하더라도 수행이 된다 ( 아주 강력한 녀석  )
			System.out.println("finally 수행!!!!");
		}
		System.out.println("비정상 종료 되지 않았어요");
			
		
		
	}// end of main
}// end of class
