package ch04;

public class Power extends Material{

	@Override
	public String toString() { // 최상위 클래스인 object에 있다. toString
		return "재료는 파우더 입니다.";
		
	}

	@Override
	public void doprinting() {
		System.out.println("power 재료로 출력 합니다.");
	}
	public void making() {
		System.out.println("power 재료를 사용합니다.");
	}
}
