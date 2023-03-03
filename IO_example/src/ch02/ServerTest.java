package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	// 클라이언트로 연결받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 담당하는 소켓 필요
	Socket socket;

	public ServerTest() {
		initData();
	}

	private void initData() {
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			// 클라이언트 접속 대기(여기서 들어올때까지 대기하고있음)
			// -> 클라이언트가 들어오면 소켓 반환
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결완료");
			// 스트림 연결( 입력 스트림 ) -> 대상 : 소켓
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 데이터를 읽는 명령
			System.out.println(reader.readLine() + " \n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServerTest();
	}// end of main
}
