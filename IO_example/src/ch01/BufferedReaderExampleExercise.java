package ch01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExampleExercise {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = reader.readLine();
			while (input != null) {
				System.out.println("입력:");
				input = reader.readLine();
				System.out.println("입력한값 : " + input);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
