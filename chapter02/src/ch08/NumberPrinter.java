package ch08;

public class NumberPrinter {

	private int id;
	// private static int waitNumber;
	// public static int waitNumber;
    public static int waitNumber;

	// 생성자는 제일 먼저 실행 되고 한번만 실행된다.
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	// 번호표를 출력 합니다.
	public void printWaitNumber() {
		System.out.println(" 대기순번 " + waitNumber);
		waitNumber++;
	}
}
