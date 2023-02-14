package Starcraft4;

public class MainTest3 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("돌격대장 질럿1");
		Marine marine1 = new Marine("귀신잡는해병은 아님");
		
		UnitController controller1 = zealot1;
		UnitController controller2 = marine1;
		
		UnitController[] UnitControllers = new UnitController[2];
		UnitControllers[0] = zealot1;
		UnitControllers[1] = marine1;
		
		
		UnitControllers[0].attack();
		marine1.showInfo();
	}
}
