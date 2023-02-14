package ch02;

public interface RemoteController {
	// 모든 변수는 --> public static final
	// 모든 메서드는 --> 추상 메서드이다.

	// 인터페이스란 ?
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도

	// 특성
	// 멤버 변수, 일반 구현 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 멤버로 가질 수 있다.
	// 인터페이스는 표준, 약속(강제성 있는 규칙) , 규칙

	// 추상 클래스보다 추상화가 더 높다.
	
	public static final int SERIAL_NUMBER = 100; // 상수만 가질수 있다.

	public abstract void turnOn();

//	public abstract void turnOff();

	// 메서드 --> 추상 메서드
	void turnOff(); //abstract 생략가능 why -> 인터페이스에선 추상 메서드로 사용하기로 
																					//	약속했기 때문에 생략 가능!!
	
}
