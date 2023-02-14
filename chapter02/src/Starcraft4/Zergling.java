package Starcraft4;

/**
 * @author 전대영
 */
public class Zergling extends Unit  implements UnitController{

	// 생성자
	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
