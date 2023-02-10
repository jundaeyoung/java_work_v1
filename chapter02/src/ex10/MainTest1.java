package ex10;

public class MainTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student("James",5000);
		Student student2 = new Student("Tomas",10000);
		Student student3 = new Student("Edward",20000);
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Taxi taxi1 = new  Taxi("카카오택시");
	
		student1.takeBus(bus1);
		student2.takeSubway(subway1);
		student3.takeTaxi(taxi1);
		
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
	}
}
