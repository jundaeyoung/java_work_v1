package ch12;

public class Person extends Human {
	@Override
	public void hunt() {
		super.hunt();  // super. 부모 클래스인 Human에서 메서드를 호출하라!!
		System.out.println("사람이 사냥을 합니다.");
	}
}
