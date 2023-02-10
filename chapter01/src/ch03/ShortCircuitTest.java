package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		
		// 관계 논리곱  -> F  --> F , 논리합 -->T --> T
		
		int num1 = 5;
		int i = 0;
		//										         15 <  10 = F     &&		  2  <  10=T
		boolean value = (   (num1 += 10)  <  10 ) && (   (i+=2) <10  );
		System.out.println(value);
		
		System.out.println("================");
		
		System.out.println(num1);  // 15
		// 위의 연산에서 num1에서 false가 나왔기 때문에 
		// i를 연산 하지 않고 바로 false를 출력했기때문에
		// i는 연산되지 않아 0이나온다. ( shortcircuit ) 
		System.out.println(i);    // 0 
		
		System.out.println("=====================");
		//                      25    <   10 = F   ||            2 < 10 = T
		value = ( (num1 += 10) <10 ) || (  (i += 2) < 10  );
		System.out.println(value);
		System.out.println(i);  // 2
		
		// 문제
		
		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요.
		// 그리고 카페 도전 과제 -> 실습 및 리뷰에 문제&답을 올려주세요.
		System.out.println("=======================");
		int num2 = 10;
		int a = 0;
		
		boolean value2 = ( (num2 += 5) < 10 ) && ( (a+=10) < 10  );
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(a);
		
		boolean value3 = ( (num2 += 5) > 10 ) || ( (a+=10) < 10  );
		System.out.println(value3);
		System.out.println(num2);
		System.out.println(a);
		
		
		
		

	}// end of main

} // end of class
