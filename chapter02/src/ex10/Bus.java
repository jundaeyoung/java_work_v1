package ex10;

public class Bus {

	int money;
	int BusNum;
	
	public Bus(int BusNum) {
		this.BusNum = BusNum;
	}
	
	public void take(int money) {
		this.money +=money;
	}
}
