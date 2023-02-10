package ch04;

// 전사 클래스 설계하기
public class Warrior {
	// 상태
	int mana = 200;
	int iceSlash;
	int fireSlash;
	int attack;
	int hp = 100;
	int dragonHp = 1000;

	public Warrior() {

	}

	// 기능
	public void attack(int count) {
		this.mana -= (count * 10);
		this.attack += (40 * count);
		this.dragonHp -= this.attack;
		System.out.println(" 드래곤 에게  : " + this.attack + "만큼의 공격을 가하였습니다.");
		System.out.println(" 드래곤 HP : " + this.dragonHp);

	}

	public void fireSlash(int count) {
		this.mana -= (count * 30);
		this.fireSlash += (100 * count);
		this.dragonHp -= this.fireSlash;

		System.out.println(" 드래곤 에게  : " + this.fireSlash + "만큼의 fireBall 공격을 가하였습니다.");

		System.out.println(" 드래곤 HP : " + this.dragonHp);

	}

	public void iceSlash(int count) {
		this.mana -= (count * 20);
		this.iceSlash = (80 * count);
		this.dragonHp -= this.iceSlash;

		System.out.println(" 드래곤 에게  : " + this.iceSlash + "만큼의 iceBall 공격을 가하였습니다.");

		System.out.println(" 드래곤 HP : " + this.dragonHp);

	}

	public void showInfo() {
		System.out.println("------------ 전사 상태창-------------");
		System.out.println("마나 : 100-" + (this.mana) + "=" + (100 - this.mana));
		System.out.println("적에게 가한 공격량 : " + (this.attack + this.fireSlash + this.iceSlash));
		System.out.println("HP : " + this.hp);

	}

}// end of class
