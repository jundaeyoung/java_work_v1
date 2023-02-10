package Starcraft2;

public class Unit {
	protected String name;
	protected int power;
	protected int hp;
	protected int level;

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
	
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + " 을 공격합니다.");
		unit.beAttacked(this.power);
		if(unit.getHp() <= 0) {
		level++;
		}
	}

	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			return; // return 값을 반환할때 사용할수 있고
					// 실행의 종료를 시킬수도 있다.
		}
		System.out.println(this.name + "이 공격 당합니다. ");
		this.hp -= power;
	}
	public void unitdie(Unit unit) {
		if(this.hp<=0) {
			unit=null;
			System.out.println("유닛이 죽었습니다.");
		}
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println("레벨 : " + this.level);
	}

}
