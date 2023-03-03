package ch06;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExerMainTest1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("TEST");
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");

			DataInputStream dis = new DataInputStream(fis);

			char a = dis.readChar();
			int b = dis.readInt();
			float c = dis.readFloat();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(dis.readUTF());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main
}
