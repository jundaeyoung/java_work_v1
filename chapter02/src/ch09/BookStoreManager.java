package ch09;

import java.util.Scanner;

public class BookStoreManager {
	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그램을 만들어 주세요.
		// 스캐너
		// 1번 누르면 저장 2번 누르면 조회 0번 누르면 종료
		// while 문을 사용해서
		// CRUD 에 개념
		// 1. 저장 , 2. 전체 조회, 3. 선택 조회, 4.전체 삭제, 0.프로그램 종료
		// 값을 비교하는 연산자 ==, equals

		Book[] books = new Book[1000];

		Scanner sc = new Scanner(System.in);
		int user = -1;
		String title;
		String author;
		int lastIndexNumber = 0;

		while (user != 0) {

			System.out.println("1. 저장 , 2. 전체 조회, 3. 선택 조회, 4.전체 삭제, 0.프로그램 종료");
			user = sc.nextInt();

			if (user == 1) {

				System.out.println("책 제목을 입력하세요 : ");
				sc.nextLine();
				title = sc.nextLine();
				System.out.println("책 저자를 입력하세요 : ");
				author = sc.nextLine();
				System.out.println("책 페이지를 입력하세요 : ");
				int page = sc.nextInt();

				books[lastIndexNumber] = new Book(title, author, page);
				lastIndexNumber++;
				System.out.println("저장 되었습니다.");
				System.out.println("=================");

			} else if (user == 2) {

				for (int i = 0; i < books.length; i++) {

					if (books[i] != null) { // 방어적 코드 짜기
						books[i].showInfo();
					}
				}

			} else if (user == 3) {

				System.out.println("몇번째 책을 조회 하시겠습니까?");

				int select = sc.nextInt();
				books[select - 1].showInfo();

			} else if (user == 4) {

				for (int i = 0; i < books.length; i++) {

					if (books[i] != null) { // 방어적 코드 짜기

						books[i] = null;
						System.out.println("전체 삭제 되었습니다.");
					}
				}
			}
		}
		System.out.println("시스템이 종료되었습니다.");
	}
}
