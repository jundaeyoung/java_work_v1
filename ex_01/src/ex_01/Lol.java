package ex_01;

public class Lol {
	String name;
	int attack;
	int hp;
	int skillq;
	int skillw;
	int skille;
	int skillr;
	int dragonHp = 1000;
	int xp = 1;
	int level=1;

	public Lol(String name) {
		this.name = name;
	}

	public void home() {
		this.hp = 100;
	}

	public void skillq(int count) {
		System.out.println("상대방에서 스킬 Q를 사용하여 " + 30 * count + " 데미지를 주었습니다.");
		this.dragonHp -= 30 * count;
	}

	public void skillw(int count) {
		System.out.println("상대방에서 스킬 w를 사용하여 " + 10 * count + " 데미지를 주었습니다.");
		this.dragonHp -= 10 * count;
	}

	public void skille(int count) {
		System.out.println("상대방에서 스킬 e를 사용하여 " + 20 * count + " 데미지를 주었습니다.");
		this.dragonHp -= 20 * count;
	}

	public void skillr(int count) {
		System.out.println("상대방에서 스킬 r를 사용하여 " + 60 * count + " 데미지를 주었습니다.");
		this.dragonHp -= 60 * count;
	}

	public void showInfo() {
		if (this.dragonHp > 0) {
			System.out.println("총" + (1000 - this.dragonHp) + "의 데미지를 주어" + this.dragonHp + "남았습니다.");
		} else {
			System.out.println("축하합니다. 드래곤을 처치 하였습니다.");
			System.out.println("경험치를 획득합니다.");
			this.xp+=1000;
			while(this.xp>200) {
				this.level++;
				this.xp-=200;
				System.out.println("축하합니다. 레벨업 하였습니다.");
				System.out.println(this.level);
		}
		

		}
	}

}
