package ch05;

public class Student {

	String name;
	int money;

	// 생성자 생성 - 리턴값 없고 , 클래스 이름과 같다.
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다.
	public void takeBus(Bus bus1) {
		// 지역 변수 선언(아래처럼 선언해도 됨 targetBus랑 주소값 같다)
//		Bus localBus = targetBus;
//		localBus.showInfo();

		System.out.println("버스를 탔습니다.");
		bus1.take(1_000);
		this.money -= 1_000;
	}

	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway1) {
		System.out.println("지하철을 탔습니다.");
		subway1.take(1_200);
		this.money -= 1_200;
	}

	// 상태창
	public void showInfo() {
		System.out.println("학생의 이름 : " + this.name);
		System.out.println("학생의 소지금 : " + this.money);
		System.out.println("======================");
	}
}
