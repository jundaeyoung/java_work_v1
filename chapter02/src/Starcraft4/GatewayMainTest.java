package Starcraft4;

public class GatewayMainTest {
	public static void main(String[] args) {

		GateWay gateway1 = new GateWay();
		Zealot[] zealots = gateway1.createZealot(3);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
	

	}
}
