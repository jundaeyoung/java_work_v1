package ch01;

public class DataType2 {

	// 코드의 시작점 -main 함수
	public static void main(String[] args) {

		char name; //변수에 선언 2byte 공간에 문자를 담을 수 있다.
		char a;
		char initial;
		
		//값을 초기화 하는 방법
		name = 'A'; // 홀 따옴표를 사용해야 한다.
		name = 'b';
		// name = 'ab'( 하나의 문자만 담을 수 있다.)
		System.out.println(name); //변수를 통해 값을 출력
		
		System.out.println('p'); // 바로 값을 입력해 출력
		System.out.println('C'); // 바로 값을 입력해 출력
		
	}// end of main

} //end of class
