package ch01; // 파일들을 모아둔 폴더이다. 폴더를 패키지라고 부른다.

public class DataType1 {

	// 코드 시작점 : main 함수
	public static void main(String[] args) {
		
		// 데이터 타입의 종류(크게 2가지)
		// 1. 기본 데이터 타입( primitve data type )
		// 2. 참조 타입 ( Reference Type )
		
		// 정수형(1, 10, 300) 데이터 타입
		// 크기가 다를 수 있다.
		byte b; // 1바이트 크기(8bit) 127~-128
		short s; //2바이트 크기(16bit)
		int i; //4바이트 크기 (32bit)
		long l; //8바이트 크기(64bit)
		
		b = 127;
		b = -128;
		// 데이터 타입 byte는 127부터 -128까지 담을 수 있다.
		
		s = 128;
		// s = 2000000000; (안들어감)
		
		// int는 약 +-21억 까지의 정수를 담을 수 있다.
		i=2100000000;
		// i=2200000000; ( 안들어감 )
		
		// L value = R value (Left value = Right value)
		// 컴퓨터 정수값에 기본 단위는 int 이다.
		//l = 2200000000; // <- 접미사를 붙여주어야 한다.
		l = 2200000000L; // 뒤에 L을 붙인다. (대 소문자 둘다 가능)
		
		// 출력 해주세요.
		// 문제 : short 데이터 타입에 범위는??
		
		System.out.println("-32,768~+32,767");
	} // end of main

} // end of class
