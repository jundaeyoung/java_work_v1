package ch03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {
		// output3.txt
		// hello world 를 찍어주세요.
		FileOutputStream fos = null;
		byte[] bs = new byte[11];
		String myData = "hello world";
		for (int i = 0; i < bs.length; i++) {
			bs[i] = (byte) Integer.parseInt(myData);
			System.out.println(bs[i]);
		}
		try {
			fos = new FileOutputStream("output4.txt");
			for (int i = 0; i < bs.length; i++) {
				fos.write(bs[i]);

			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of main

}
