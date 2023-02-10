package ex_01;

public class Bus {

	int busNum;
	int money;
	int passenger;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	public void take(int passenger) {
		this.passenger += passenger;
		this.money += 1000*passenger;
	}
	public void take1() {
		this.passenger ++;
		this.money += 1000;
	}
	public void takeout(int passenger) {
		this.passenger -= passenger;
	}
	public void showInfo() {
		System.out.println("버스 번호는 : " + busNum);
		System.out.println(" 수익금 : " + money);
		System.out.println(" 승객 수 : " + passenger);
	}
	
}
