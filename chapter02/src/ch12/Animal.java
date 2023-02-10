package ch12;

// 추상 클래스이다.
// 강제성이 생김 : 추상메서드를 포함하고 있으면 반드시 추상 클래스가 되어야한다.
public abstract class Animal {

	// 추상 클래스란 ?  ( abstract class )
	// 하나 이상의 추상 메서드를 포함하거나 abstract 키워드를 가진 클래스를 추상 클래스라고 한다.
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	// 이 녀석은 추상 메서드이다.
	public abstract void hunt(); 
}
