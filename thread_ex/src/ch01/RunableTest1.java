package ch01;

import javax.swing.JFrame;

// 생성방법, 사용방법을 이미 학습
// 만약 코드가 JFrame을 상속 받았다면 자바는 단일 상속을 지원하기 때문에 다중 상속을 할 수 없다.
// 그래서 인터페이스인 Runnable 구현 방법을 알아야한다.

public class RunableTest1 {

	public static void main(String[] args) {
		// 사용 하는방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
//		subWorker.start(); <-- 현재 start 메서드가 없다.!!
//   	subWorker 기능을 구현했지 thread를 상속받은건 아니다.
//		thread 기능인 start메소드가 없는 상태이다.
		
		// !!!
		// 생각하는 방법 == start() 메서드는 thread가 가지고 있다.
		// 쓰레드를 생성할 때 생성자에 Runnable 타입을 넣을수 있다고 확인 - 문서 코드 힌트
		Thread thread1 =  new Thread(subWorker);
		Thread thread2 =  new Thread(subWorker);
		// 시작 시점은 이벤트를 받던지 연산 후에 하던지 여러분들이 실행 시킬 수 있다.
		thread1.start();
		thread2.start();

	}// end of main
}// end of class

class SubWorker extends JFrame implements Runnable {
	// 설계 하는 방법

	// 나중에 쓰레드가 동작해야 하는 부분을 run 안에서 작성 함
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("i : " + i + "\n");
		}
	}

}
