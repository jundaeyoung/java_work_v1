package ch05;

import java.util.Scanner;

public class MainTest2 {

	// 객체 생성

	// 1단계 - 똑같이 사용해보기
	// 2단계 - 실행에 흐름 만들어보기
	public static void main(String[] args) {

		Student studentJun = new Student("전대영", 10000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		Scanner sc = new Scanner(System.in);

		while (bus100.busNumber != 0) {
			System.out.println("어떤 버스를 타시겠습니까? ( 0 을 누르면 종료 )");
			bus100.busNumber = sc.nextInt();
			if (bus100.busNumber == 100) {
				studentJun.takeBus(bus100);
				bus100.showInfo();
				System.out.println("===============");
			} else if (bus100.busNumber == 200) {
				studentJun.takeBus(bus200);
				bus200.showInfo();
				System.out.println("===============");
			}
		}
		while (subwayLine1.lineNumber != 0) {
			System.out.println("몇 호선 지하철을 타시겠습니까? ( 0 을 누르면 종료 )");
			subwayLine1.lineNumber = sc.nextInt();
			if (subwayLine1.lineNumber == 1) {
				studentJun.takeSubway(subwayLine1);
				subwayLine1.showInfo();
			} else if (subwayLine1.lineNumber == 2) {
				studentJun.takeSubway(subwayLine2);
				subwayLine2.showInfo();
			}
		}
		System.out.println("===============");
		studentJun.showInfo();
		System.out.println("===============");
		bus100.showInfo();
		System.out.println("===============");
		bus200.showInfo();
		System.out.println("===============");
		subwayLine1.showInfo();
		System.out.println("===============");
		subwayLine2.showInfo();
		System.out.println("===============");

	}
}
