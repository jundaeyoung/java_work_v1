package ch04;

public class GameTest {

	public static void main(String[] args) {

		Warrior warrior = new Warrior();
		warrior.attack(2);
		warrior.fireSlash(1);
		warrior.iceSlash(2);
		warrior.iceSlash(2);
		
		warrior.showInfo();
		
		System.out.println("------------------------");
		Wizard wizard = new Wizard();
		wizard.attack(2);
		wizard.fireBall(1);
		wizard.iceBall(2);
		wizard.hill(3);

	
		
		wizard.showInfo();
	}

}
