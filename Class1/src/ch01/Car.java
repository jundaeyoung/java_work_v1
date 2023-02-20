package ch01;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		// 자동차 클래스는 엔진 클래스에 의존합니다.
		// 엔진 클래스가 있어야 생성이 된다.
		this.engine = engine;
		
	}
	
	public void start() {
		// 엔진 스타트가 되어야 자동차가 출발한다.
		engine.start(); // NullPoint..
		System.out.println("Car started");
	}
	
}// end of class
