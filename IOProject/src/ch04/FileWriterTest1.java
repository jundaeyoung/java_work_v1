package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {
	public static void main(String[] args) {

		FileWriter fw = null;
		char[] buf = { '반', '갑', '습', '니', '다' };
		try {
			fw = new FileWriter("writer1.txt");
			// fw.write('H');// 문자하나만 출력 -->file
			// fw.write(buf);
			// 대상 , 인덱스 시작값, 길이 값
			fw.write(buf, 1, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
