package ex11;

public class Archer extends Hero {
	
	public Archer(String name, int hp) {
		super(name, hp); // super 키워드는 부모 생성자를 호출 하는 녀셕이다.
	}
	
	void fireArror() {
		System.out.println(name + " 가 불화살 공격 합니다.");
	}
	
}