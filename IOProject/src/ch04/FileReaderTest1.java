package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
	public static void main(String[] args) {

		// 문자 단위로 읽어 들이는 스트링
		FileReader fr = null;

		try {
			fr = new FileReader("output2.txt");
			int temp = fr.read();
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of main
}
