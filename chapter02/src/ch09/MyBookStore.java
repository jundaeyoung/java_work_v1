package ch09;

import java.util.Scanner;

/**
 * @author 전대영 북 객체를 관리하는 프로그램 C R U D -> 구글링 정의 확인
 */
public class MyBookStore {
	// 메인 함수
	public static void main(String[] args) {
		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열은 먼저 배열의 길이를 지정해주어야한다.
		Book[] books = new Book[100];
		boolean flag = true;
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// todo 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하다", "이지성");
		books[4] = new Book("사피엔스", "유반하라리");

		// 실행의 흐름 만들어 보기
		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1. 저장, 2. 전체조회, 3. 선택조회, 4. 전체삭제, 0. 프로그램 종료");
			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				// 5 
				lastIndexNumber=save(books, lastIndexNumber, sc);
				
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);
				
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readByTitle(sc, books);
				
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
				
			} else if (selectedNumber.equals(END)) {
				System.out.println(">>종료하기<<");
				flag = false;
			} else {
				System.out.println("잘못된 입력 값 입니다.\n 다시 선택 바람");
			}
		}

	} // end of main

	public static int save(Book[] books, int lastIndexNumber, Scanner sc) {
		System.out.println(">>저장하기<<");
		System.out.println("책 제목을 입력하세요.\n");
		String bookTitle = sc.nextLine();
		System.out.println("저자 이름을 입력하세요.\n");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[lastIndexNumber] = book;
		lastIndexNumber++;
		System.out.println(bookTitle + " 책이 저장 되었습니다.");
		return lastIndexNumber;
	}
	
	// 전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println(">>전체 조회하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}
		System.out.println();
	}

	public static void readByTitle(Scanner sc, Book[] books) {

		System.out.println(">>선택 조회 하기<<");
		// 선택 조회
		System.out.println(">>>책 제목을 입력해주세요.<<<");
		String bookTitle = sc.nextLine();
		boolean isFined = false;

		for (int i = 0; i < books.length; i++) {
			// 타이틀 , 이름
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					// 찾았다.
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFined = true;
					break;

				}
			}
		}
		if (isFined == false) {
			System.out.println("아쉽지만 없는 책입니다.");
		}

	}

	public static void deleteAll(Book[] books) {
		System.out.println(">>전체 삭제하기<<");
		// 전체 삭제
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}
	
} // end of class
