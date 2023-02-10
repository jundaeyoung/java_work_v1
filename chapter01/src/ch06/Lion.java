package ch06;

/**
 * 
 * 함수를 선언하는 코드방법 함수를 사용하는 코드 방법
 */
public class Lion {

	// 정수를 반환하는 함수이다.
	// addNumber에서 값을 받으면 int 형태로 반환한다.
	// 함수를 설계하는 코드를 작성
	static int addNumber(int n1, int n2) { // 함수의 선언부

		// 함수 구현부(body)
		int result; // 지역변수
		result = n1 + n2;
		return result; // 리턴 키워드를 만나면
						// 실행의 제어권 반납 ( 실행된 곳으로 돌아감 )
	}

	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + "반갑습니다~~!!");

	}

	// 매개 변수가 없는 함수를 설계
	static int calcSum() {

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum;

	}

	// calcSum2 , 정수 값 3개를 받아서 덧셈 연산후 결과를 반환 하시오. -->리턴 결과는 double
	static double calcSum2(int n1, int n2, int n3) {

		double sum = 0;
		sum = n1 + n2 + n3;
		return sum;

	}
	
	// calcSum3 정수값 1, 실수값 1, 논리값 1개 받고
	// " 정수값 : " , [ ] , 실수값 [ ] , 논릭밧 [ ]  <---- 문자열로 연산하고 
	// 리턴타입은 String으로 만들어 주세요.

	static String calcSum3(int n1, double n2, boolean n3) {
		
		System.out.println("정수값 : " + n1);
		System.out.println("실수값 : " + n2);
		System.out.println("논리값 : " + n3);
		return "";
	}
	
	
	
	
	// main 함수 - 텅 빈, 리턴값이 없다.
	public static void main(String[] args) {

		// 함수호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);

		System.out.println("myNumber : " + myNumber);

		// 함수 호출 2
		// 함수 호출할 때는 모양 맞추기 이다.
		sayHello("애쉬 ");
		sayHello("티모 ");
		sayHello("바론 ");

		int calResult = calcSum();
		System.out.println(calResult);
		System.out.println(calcSum()); // 위와 똑같이 실행된다.

		System.out.println(calcSum2(2, 4, 2));
		
		calcSum3(1,2.2,true);

	}// end of main

	 // 함수란 자바에서 객체와 상관없이 독립적으로 
	 // 어떠한 기능을 수행하는 일련에 코드 묶음이다. 
	
} // end of class
