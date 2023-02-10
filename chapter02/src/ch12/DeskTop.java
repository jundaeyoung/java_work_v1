package ch12;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크탑에서 디스플레이를 출력합니다.");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑에서 타이핑을 출력합니다.");

	}

}
