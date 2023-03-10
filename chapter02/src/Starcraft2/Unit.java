package Starcraft2;

public class Unit {
	protected String name;
	protected int power;
	protected int hp;
	protected int level=1;
	protected int exp;
	protected boolean isDie;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	// 공격하기 
	public void attack(Unit unit) {
		if (isDie == true) {
			System.out.println("공격할 유닛이 없습니다.");
		} else {
			System.out.println(this.name + "이 " + unit.getName() + " 을 공격합니다.");
			unit.beAttacked(this.power);
			if (unit.getHp() <= 0) {
				exp += 30;
				levelUp(exp);
				unit.setHp(0);
				unit.isDie = true;
			}
		}
	}
	// 레벨업
	public void levelUp(int exp) {
		if(exp>100) {
			level++;
		}
	}
	// 공격 당함
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			unitDie(this); 

		}
		System.out.println(this.name + "이 공격 당합니다. ");
		this.hp -= power;
	}
	// 유닛 죽음
	public void unitDie(Unit unit) {
		unit = null;
		System.out.println("유닛이 죽었습니다.");
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println("레벨 : " + this.level);
		System.out.println("경험치 : " + this.exp);
	}

}
