package ch04;

// 마법사 클래스 설계하기
public class Wizard {
	// 상태
	int mana = 100;
	int iceBall;
	int fireBall;
	int attack;
	int hp=100;
	int hill;
	int dragonHp=1000;
	
	//기능
	public void attack(int count) {
		this.mana -= (count*10);
		this.attack = (40*count);
		this.dragonHp = this.dragonHp-this.attack;
		System.out.println(" 드래곤 에게  : " + this.attack + "만큼의 공격을 가하였습니다.");
		System.out.println(" 드래곤 HP : " + this.dragonHp);

		
	}
	public void fireBall(int count) {
		this.mana -= (count*30);
		this.fireBall += (100*count);
		this.dragonHp = this.dragonHp-this.fireBall;
		System.out.println(" 드래곤 에게  : " + this.fireBall + "만큼의 fireBall 공격을 가하였습니다.");

		System.out.println(" 드래곤 HP : " + this.dragonHp);

	}
	public void iceBall(int count) {
		this.mana -= (count*20);
		this.iceBall += (80*count);
		this.dragonHp = this.dragonHp-this.iceBall;
		System.out.println(" 드래곤 에게  : " + this.iceBall + "만큼의 iceBall 공격을 가하였습니다.");

		System.out.println(" 드래곤 HP : " + this.dragonHp);

	}
	public void hill(int count) {
		this.mana += (count*30);
	}
	
	public void showInfo() {
		System.out.println("------------ 마법사 상태창-------------");
		System.out.println("마나 : 100-"+(this.mana)+ "="+(100-this. mana));
		System.out.println("적에게 가한 공격량 : "+ (this.attack+this.fireBall+this.iceBall));
		System.out.println("HP : " + this.hp);
	}
	
	
}// end of class
