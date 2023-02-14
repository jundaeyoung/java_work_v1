package ch01;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	JButton[] button = new JButton[10];
	
	private FlowLayout flowLayout;

	// 1.
	// 멤버 변수를 선언할수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출
	// for 문을 활용할수 있는가
	// GUI 프로그램 익숙해지기 !!

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("button");
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 20, 20);
	}

	private void setInitLayout() {
		for (int i = 0; i < button.length; i++) {
			setLayout(flowLayout);
			add(button[i]);
		}

	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
