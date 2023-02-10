package ch04;

public class Subway {
	// 상태
	int lineNumber; // 호선
	int passengerCount; // 승객수
	int money; // 요금
	// 기능
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	// 태우다
	public void take(int count) {
		this.passengerCount += count;
		this.money += (1000*count);
		
	}

	// 내리다
	public void takeOff(int count) {
		this.passengerCount -= count;
		this.money -= (1000*count);
	}

	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("지하철 호선 번호 : " + this.lineNumber);
		System.out.println("승객 수 : " + this.passengerCount);
		System.out.println("수익금 : " + this.money);
	}
}
