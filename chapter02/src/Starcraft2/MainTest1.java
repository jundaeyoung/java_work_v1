package Starcraft2;

import Starcraft2.Marine;
import Starcraft2.Zealot;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot(" 질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 =  new Zergling("저글링1");
		Zergling zergling2 =  new Zergling("저글링2");
		
//		for(int i=1; i<17; i++) {
//			zealot1.attack(marine1);
//			
//		}
//		for(int i=1; i<19; i++) {
//			marine1.attack(zergling1);
//		}
		for(int i=1; i<20; i++) {
		}
		marine1.attack(zergling1);
		marine1.attack(zergling1);
		marine1.attack(zergling2);
		
		marine1.showInfo();
		zealot1.showInfo();
		zergling1.showInfo();
		zergling2.showInfo();
	}
}
