package ex10;

public class Taxi {

	String name;
	int money;
	
	public Taxi(String name) {
		this.name = name;
		
	}

	public void take(int money) {
		this.money +=money;
	}
}
