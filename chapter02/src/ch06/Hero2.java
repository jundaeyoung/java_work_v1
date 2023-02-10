package ch06;

public class Hero2 {

	//식을 바로 사용할 수 없다.
	// 메서드 선언을 중첩으로 할 수 없다.
	// 생성자에는 리턴 타입이 없다.(선언부)
	// 클래스 스코프 안에 사용할 수 있는 문법
	// 변수 사용
	// 생성자 사용 가능
	// 메서드 사용 가능
	// 함수 사용 가능
	// 내부 클래스 --> 추후 배움
	
	// 사용불가
	// 메서드 안이나 생성자 안에서 연산 가능
//	private String name = 1 *2 + 10;
	private int hp;
	private int power;
	private double defense;
	private boolean die;
	
	//getter 메서드 직접 만들어 보세요. 5
//	public String getName() {
//		// 메서드 안에 메서드를 선언 할 수 없다.
//		public void printArticle() {
////		return this.name;
//		}
//	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getDie() {
		return this.die;
	}
	public void showInfo() {
		System.out.println("현재 피는 : " +this.hp);
		System.out.println("현재 피는 : " +this.power);
		System.out.println("현재 영 : " +this.die);
//		System.out.println("이름은 : " +this.name);
		System.out.println("현재 방어는 : " +this.defense);
	}
	//setter 메서드 직접 만들어 보세요. 5
	public void setHp(int hp) {
		if(hp<=0) {
			System.out.println("잘못된 값을 주었습니다.");
			return;
		}
		this.hp=hp;
	}
	public void setPower(int power) {

	// 방어적 코드도 추가해보세요.
		
//함수이다 --> 클래스 스코프 범위 밖에는 문법을 작성 할 수 없다.
//		public static int addNumber(int n1, int n2) {
//			return n1+n2;
		}
	}

