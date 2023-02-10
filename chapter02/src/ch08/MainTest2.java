package ch08;

public class MainTest2 {
	public static void main(String[] args) {
		
		// 클래스 안에 멤버 변수를 선언 할려면
		// 반드시 먼저 메모리에 올려야 한다.
		
		// 수행 요청 -클래스이름.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);
		
		// 정리
		// static은 문법적으로 class xxx{ } 안에 작성을 하지만 static 이라는 키워드를 
		// 가진 녀석은 잠시 자리만 빌려서 문법만 쓸뿐 메모리를 사용하는 영역은 미리 뜨는
		// static 영역이다.
	}
}
