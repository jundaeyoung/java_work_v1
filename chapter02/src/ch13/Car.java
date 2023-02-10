package ch13;
/**
 * 
 * @author GGG
 * 템플릿 메서드 패턴을 구현
 * 핵심 run() 메서드이다.
 */
public abstract class Car {

	protected abstract void drive();

	protected abstract void stop();

	private void startCar() {
		System.out.println("시동을 켬니다.");
	}

	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	protected abstract void wiper();
	
	// 후크 메서드
	public void washCar() {
		//아무것도 구현안해도 일반 메서드이다.
	}
	
	// 실행의 흐름을 만들어 둔다.
	// 하위 클래스에서 재정의 할수 없게 설계한다. --> final (메서드 앞)
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
