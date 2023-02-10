package Starcraft2;

import Starcraft2.Marine;
import Starcraft2.Zealot;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("돌격대장 질럿1");
		Marine marine1 = new Marine("귀신잡는해병은 아님");
		
		for(int i=1; i<15
				; i++) {
			zealot1.attack(marine1);
			
		}
		
		marine1.showInfo();
		zealot1.showInfo();
	}
}
