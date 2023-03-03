package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MYArticle1 {
	public static void main(String[] args) {
		// 파일 입출력 활용해서 코드를 작성해주세요

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("article.txt");
			fw = new FileWriter("today_article.txt");
			int i;
			while ((i = fr.read()) != -1) {
				fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of main
}
