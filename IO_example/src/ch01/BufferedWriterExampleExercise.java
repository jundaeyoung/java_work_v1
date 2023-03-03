package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExampleExercise {

	public static void main(String[] args) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("너무 피곤해");
			writer.newLine();
			writer.write("집갈래");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end of main
}
