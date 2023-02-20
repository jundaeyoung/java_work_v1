package ch01;

public class ThreadTest2 extends Worker{

	// 메인 쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습 !
		// 현재 쓰레드가 누군지 알아보는 명령어
		System.out.println("-------main 쓰레드 시작-------");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어내기 (메인 쓰레드가)
		Worker worker1 = new Worker();
		// 너가 위임받은 일을 시작해 --> start();
		worker1.start();

		// Thread 하나 더 생성해보기
		Worker worker2 = new Worker();
		worker2.start();

		System.out.println("-------main 쓰레드 종료-------");


	}// end of main
}// end of class



