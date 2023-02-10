package ex_01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student("전대영 ", 10000);
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		
		bus1.take(2);
		bus2.take(2);
		bus1.takeout(2);
		
		student1.takeBus(bus1);
		student1.showInfo();
		
		bus1.showInfo();
		bus2.showInfo();
	}

}
