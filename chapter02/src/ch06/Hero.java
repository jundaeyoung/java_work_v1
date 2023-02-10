package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;
	
	public void defense(double defense) {
		this.defense = defense;
	}
	public void hill(int hp) {
		this.hp += hp;
	}
	public void power(int ammer) {
		power += ammer;
	}
	public void die(boolean die) {
		this.die = die;
	}
	public void name(String name) {
		this.name = name;
	}
	//getter 메서드 직접 만들어 보세요. 5
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public boolean getDie() {
		return this.die;
	}
	public String getName() {
		return this.name;
	}
	public double getDefense() {
		return this.defense;
	}
	public void showInfo() {
		System.out.println("현재 피는 : " +this.hp);
		System.out.println("현재 피는 : " +this.power);
		System.out.println("현재 영 : " +this.die);
		System.out.println("이름은 : " +this.name);
		System.out.println("현재 방어는 : " +this.defense);
	}
	//setter 메서드 직접 만들어 보세요. 5
	public void setHp(int hp) {
		if(hp<=0) {
			System.out.println("잘못된 값을 주었습니다.");
			return;
		}
		this.hp=hp;
	}
	public void setPower(int power) {

	// 방어적 코드도 추가해보세요.
	}}
