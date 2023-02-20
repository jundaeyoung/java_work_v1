package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		GenericPrinter<Power> genericPrinter = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
//		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		
		// 재료 넣기
		genericPrinter.setMaterial(new Power());
		genericPrinter2.setMaterial(new Plastic());
		
		// 문제
		// 제네릭을 활용한 프로그램을 작성하고 테스트 해주세요.
		Power userPower = genericPrinter.getMaterial();
		Plastic userPlastic = genericPrinter2.getMaterial();
		
		
		userPlastic.use();
		userPower.making();
		
	}
}
