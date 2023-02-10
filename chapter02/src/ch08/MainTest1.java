package ch08;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		NumberPrinter numberprinter1 = new NumberPrinter(1);
		NumberPrinter numberprinter2 = new NumberPrinter(2);
		
		numberprinter1.printWaitNumber(); // 누군가가
		numberprinter1.printWaitNumber(); // 다른 누군가가
		numberprinter1.printWaitNumber(); // 다른 누군가가
		
		System.out.println("===================");
		
		numberprinter2.printWaitNumber(); // 누군가가
		numberprinter2.printWaitNumber(); // 다른 누군가가
		numberprinter2.printWaitNumber(); // 다른 누군가가
	}// end of main
}// end of class
