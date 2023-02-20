package ch05;

public class Ball extends Item{

	@Override
	public void put() {
		System.out.println("인형을 넣습니다.");
	}

	@Override
	public void take() {
		System.out.println("인형을 뺍니다.");
		
	}

}
