package ch06;

public class MainTest1 {

	// 1. 리턴값이 int, 매개변수 n1,n2,n3 이름은 intAdd
	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	// 3. 리턴값이 void, 매개변수는 String article, 함수 이름은 printArticle 출력

	//1
	static int intAdd(int n1, int n2, int n3) {
		int add = n1 + n2 + n3;
		return add;
	}
	//2
	static double doubleAdd(double n1, double n2) {
		double dAdd = n1 + n2;
		System.out.println(dAdd);
		return dAdd;
	}
	//3
	static void printArticle(String a) {
		System.out.println(a);
		//void에는 return값 없다.
	}

	// 테스트 - 실행 코드 main
	public static void main(String[] args) {
		// 호출해서 수행
		System.out.println(intAdd(1, 2, 3));

		doubleAdd(2.2, 3.3);

		printArticle(" 대영 ");

	}
}
