package ch05;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// 생성자 생성
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 사람을 태우다.
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	//
	public void showInfo() {
		System.out.println("버스번호 : " + this.busNumber);
		System.out.println("승객 수 : " + this.passengerCount);
		System.out.println("수익 금액 : " + this.money);
	}

}// end of class
