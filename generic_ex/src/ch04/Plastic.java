package ch04;

public class Plastic extends Material{

	@Override
	public String toString() {
		return "플라스틱 입니다.";
		
	}

	@Override
	public void doprinting() {
		System.out.println("plastic 재료로 출력 합니다.");		
	}
	public void use() {
		System.out.println("플라스틱 재료를 사용합니다.");
	}
}
