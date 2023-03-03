package ch02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 측 코드
// 소켓 통신을 할려면 소켓이 필요하다.( 서버 측 연결을 담당하는 포트 번호를 알아야한다.)
public class ClientFile {
//	final String IP = "192.168.0.75";
	final String IP = "localhost";

	Socket socket;
	BufferedWriter bufferedWriter;

	public ClientFile() {
		try {
			System.out.println("1. 클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP, 11000);
			System.out.println("2. 소켓으로 연결완료");

			// 소켓에다가 버퍼 스트림 연결
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			bufferedWriter.write("안녕 글 잘 가니?" + "\n"); // 문장의 끝 확인
			bufferedWriter.flush(); // 물 내리기 ( 버퍼 비우기 )
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new ClientFile();
	}
}
