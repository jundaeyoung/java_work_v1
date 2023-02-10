package ch13;

public class MainTest1 {

	public static void main(String[] args) {
		
	AiCar  aiCar = new AiCar();
	aiCar.run();
	
	System.out.println("===============");
	
	ManualCar manualCar = new ManualCar();
	manualCar.run();

	}
}
