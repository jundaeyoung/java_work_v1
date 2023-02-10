package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리 하고 싶다면 - 배열(자료구조)
		Book[] books = new Book[10]; // 배열 선언 ( 메모리 고간 만들어 두기 )
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하다", "이지성");
		books[4] = new Book("사피엔스", "유반하라리");

		books[9] = new Book("d", "D");
		// books[5] = new Book("홍길동전 "," 허균"); java.lang.ArrayIndexOutOfBoundsException
		// 오류

		// books.length = 배열의 길이 (10)
		// i값이 5에서 오류발생
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle());
			} else {
				continue;
			}
		}
		// 주의 1
		// 인덱스 크기는 n - 1 개다
		// 배열의 길이와 인덱스의 길이는 다르다.
		// 배열의 길이가 5 인덱스의 길이 4
		// 배열의 길이 330 인덱스의 길이 329
		// 배열의 길이 500 인덱스의 길이 499

		// 주의 2
		// 배열에 길이와 실제 들어가 있는 값에 갯수는 다를 수 있다.

		// 문제
		// double 배열 4 선언 임의 값 넣고 출력해 주세요.
		// 3 번 인덱스는 값을 할당하지 마시오.
		// 출력은 for 문

		double[] doubles = new double[4];
		doubles[0] = 0.1;
		doubles[1] = 0.2;
		doubles[2] = 0.4;

		for (int i = 0; i < doubles.length; i++) {
			if (doubles[i] != 0.0) {
				System.out.println(doubles[i]);
			}
		}

		// 예제 books를 사용해 보세요.
		// 문제 2
		// 0 번째 인덱스에 있는 녀석과 인덱스 2번째 녀석에 값을 스왑해주세요.
//		books[7]=books[0];
//		books[0]=books[2];
//		books[2]=books[7];
		
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle());
			} else {
				continue;
			}
		}
		
		// 문제 3
		// 인덱스 3번에 값을 삭제 해주세요.
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 짜기
				books[i].showInfo();
			} 
		}
		
	}
}
