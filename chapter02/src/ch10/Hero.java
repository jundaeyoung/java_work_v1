package ch10;

public class Hero {

	private String name;
	private int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public static void main(String[] args) {
		
		Warrior warrior = new Warrior("전사", 50);
	
	}

}
class Warrior extends Hero {
		
		private String warriorName;
		private int warriorHp;
		
		
		public Warrior(String name, int hp) {
			super(name,hp);
			this.warriorName= name;
			this.warriorHp = hp;
			
		}
		public void comboAttack() {
			System.out.println("콤보공격을 하였습니다.");
		}
	}

//	class Archer extends Hero {
//		public void fireArrow() {
//			System.out.println("불화살 공격을 하였습니다.");
//		}
//	}
//	class Wizard extends Hero { 
//		public void freezing() {
//			System.out.println("얼음 공격을 하였습니다.");
//		}
//	}
