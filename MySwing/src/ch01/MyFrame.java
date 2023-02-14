package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		super.setTitle("MyFrame01"); // setTitle은 부모 메서드를
		// 가져온것이다. super를 붙여도 되고 안붙여도된다.
		// width, height
		setSize(200, 800);
		setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		// GUI 관련 프로그램 학습시 배치 관리자 먼저 명확히 이해 하는게 좋다.
		// 레이아웃을 적는것이다. 
	}
}
