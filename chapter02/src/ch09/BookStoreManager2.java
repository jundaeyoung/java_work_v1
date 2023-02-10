package ch09;

import java.util.Scanner;

public class BookStoreManager2 {
	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그램을 만들어 주세요.
		// 스캐너

		// 1번 누르면 저장 2번 누르면 조회 0번 누르면 종료
		// while 문을 사용해서
		// CRUD 에 개념
		// 1. 저장 , 2. 전체 조회, 3. 선택 조회, 4.전체 삭제, 0.프로그램 종료
		// 값을 비교하는 연산자 ==, equals

		Scanner sc = new Scanner(System.in);
		int userInput = -1;
		int lastIndexNumber = 0;
		Book[] books = new Book[100];
		int count=0;
		
		while (userInput != 0) {

			System.out.println("1. 저장 , 2. 전체 조회, 3. 선택 조회, 4.전체 삭제, 5.선택삭제 0.프로그램 종료");
			userInput = sc.nextInt();

			if (userInput == 1) {

				System.out.println("책 이름 : ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("저자 이름 : ");
				String author = sc.nextLine();
				books[lastIndexNumber] = new Book(title, author);
				System.out.println("저장 되었습니다.");
				lastIndexNumber++;

			} else if (userInput == 2) {

				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
						count++;
					}
				}
				if (count == 0) {
					System.out.println("조회할 책이 없습니다.");
				}
			} else if (userInput == 3) {

				System.out.println("몇번째 책의 정보를 보시겠습니까?");
				int bookNumber = sc.nextInt() - 1;
				books[bookNumber].showInfo();

			} else if (userInput == 4) {
				System.out.println("전체 삭제 되었습니다.");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i] = null;
					}
				}
			} else if(userInput == 5) {
				System.out.println("몇번째 책을 삭제 하시겠습니까?");
				int bookNumber = sc.nextInt() - 1;
				books[bookNumber]=null;
				System.out.println(bookNumber+1+"번째책이 삭제 되었습니다.");
				count--;
			}
		}

	}
}
