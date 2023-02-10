package ch10;

public class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("부모 메서드");
		return n1 * n2;
	}

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		// cal2에 multiply 메서드가 있는지 확인
		// cal2에 multiply 메서드가 없다면 부모 클래스에
		// 있는 메서드를 확인한다.
		// 부모에 있는 multiply메서드를 재 정의한다면 --> 오버 라이드라고 한다.

		System.out.println(cal2.multiply(100, 100));
		System.out.println(cal2.multiply(0, 100));
	}
}

class Cal2 extends Cal {
	// sum
	// multiply

	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	// 오버라이드 != 오버로딩
	// 오버라이드 : 재정의 한다. ( 부모에 있는 메서드를 재정의 한다.)

	// 조건 : 메서드 모양이 똑같아야한다.
//	public int multiply(int n1, int n2) {
//		System.out.println("자식 메서드");
//		if (n1 == 0 || n2 == 0) {
//			System.out.println(" 0을 입력하였습니다. ");
//		}
//		return n1 * n2;
//	}

	// 주석 + 힌트
	@Override // 어노테이션
	public int sum(int n1, int n2) {
		System.out.println("n1 :" + n1 + " 을 입력 하였습니다. ");
		return super.sum(n1, n2);
	}

}
