package ch12;

public abstract class Computer {

	
	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("턴온합니다.");
	}
	public void turnOff() {
		System.out.println("턴오프합니다.");
	}
}
