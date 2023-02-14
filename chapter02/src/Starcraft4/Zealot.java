package Starcraft4;

/**
 * @author 전대영
 */
public class Zealot extends Unit  implements UnitController {

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack() {

	}
	public void beAttacted() {
		
	}
}
