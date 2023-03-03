package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MYArticle {
	public static void main(String[] args) {
		// 파일 입출력 활용해서 코드를 작성해주세요

		FileReader fr = null;
		FileWriter fw = null;

		try {
			// Reader 기반은 2바이트 이상 처리 가능하다. ->한글이 깨지지 않아요.
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			int i;
			fw.write("MVC뉴스\n");
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.write("\n작성자:전");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				// 사전 기반 지식
				// fw 를 작성할 때 스트림이 열려 있으면 잠시 버퍼 공간에 담아두었다가 
				// 스트림이 종료되거나 flush 메서드를 만나면 실제로 file에다가 출력한다.

				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end of main
}
