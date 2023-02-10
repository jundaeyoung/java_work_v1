package ch04;

public class ForMainTest1 {
// main 
	public static void main(String[] args) {

		int j = 1;
		int i = 1;

		for (j = 0; j < 8; j += 2) {
			for (i = 1; i < j; i++) {
				System.out.printf("*");
			} // end of for
			System.out.println();
		} // end of for
		System.out.println("--------------");
		for (j = 6; j > 1; j -= 2) {
			for (i = 1; i < j; i++) {
				System.out.printf("*");
			} // end of for
			System.out.println();
		} // end of for
		
		System.out.println("--------------");
		for (j = 6; j > 1; j -= 2) {
			for (i = 1; i < j; i++) {
				System.out.printf("*");
			} // end of for
			System.out.println();
		} // end of for

		System.out.println("--------------");
		for (j = 1; j < 10; j += 2) {
			for (i = 10; i > j; i--) {
				System.out.printf(" ");
			} // end of for
			for (int star = 1; star <= j; star++) {
				System.out.printf("*");
			} // end of for
			System.out.println();
		} // end of for

		System.out.println("--------------");
		for (j = 1; j < 10; j += 2) {
			for (i = 1; i <= j; i++) {
				System.out.printf(" ");
			} // end of for
			for (int star = 10; star > j; star--) {
				System.out.printf("*");
			} // end of for
			System.out.println();
		} // end of for
	}// end of main

}// end of class
