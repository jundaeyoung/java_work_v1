package ch03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) {

		
		FileOutputStream fos = null;
		// 현재 output.txt 라는 파일은 없는 상태 (맨 처음)
		try {
			fos = new FileOutputStream("output.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end of main

}
