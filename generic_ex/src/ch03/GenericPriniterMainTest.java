package ch03;

public class GenericPriniterMainTest {

	public static void main(String[] args) {

		Power power = new Power();
		Plastic plastic = new Plastic();

		// 사용방법
		GenericPriniter<Power> genericPriniter = new GenericPriniter<>();
		
		// 재료 넣기
		// 최상위 클래스인 Object를 활용하는것보다
		// 안정적인 코드를 만들 수 있다.
		// 또한 가독성도 높아진다.
		//	genericPriniter.SetMaterial(plastic);  
		genericPriniter.SetMaterial(power); // 
		
		// 재료 꺼내기
		// 다운캐스팅을 안해도된다.
		 Power userpPower = genericPriniter.getMaterial();
		// 잘못된 타입을대입하면 컴파일 시점에 오류를 잡아준다.
		// Plastic userpower = genericPriniter.getMaterial();
		
		 // 결론 :  보다 가독성 높고 안정적인 프로그래밍을 만들 수 있다.
		 // 같은 변수이름 같은 기능이라면 제네릭 프로그래밍을 설계 하면된다.
		
		
	}// end of main
}
