package ch05;

public class Doll extends Item {

	@Override
	public void put() {
		System.out.println("인형을 넣습니다.");
	}

	public void take() {
		System.out.println("인형을 뺍니다.");
	}

}
