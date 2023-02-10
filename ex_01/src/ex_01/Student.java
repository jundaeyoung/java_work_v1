package ex_01;

public class Student {
	

	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus busNum) {
		busNum.take1();
		this.money -= 1000;
		System.out.println(name + " 은 버스를 탔습니다.");
	}
	public void showInfo() {
		System.out.println("남은 잔액은 : " + this.money);
	}
}
