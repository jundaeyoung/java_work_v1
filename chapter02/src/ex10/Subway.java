package ex10;

public class Subway {

	int money;
	int subwayLine;
	
	
	public Subway(int subwayLine) {
		this.subwayLine = subwayLine;
		
	}
	public void take(int money) {
		this.money += money;
	}
}
