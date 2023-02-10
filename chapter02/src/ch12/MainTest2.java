package ch12;

public class MainTest2 {
	public static void main(String[] args) {

		Computer computerDeskTop = new DeskTop();
		Computer myNoteBook = new MyNoteBook();
		
		computerDeskTop.display();
		computerDeskTop.typing();
		myNoteBook.display();

	}

}
