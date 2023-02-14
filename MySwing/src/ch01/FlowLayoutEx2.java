package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {
	private JButton button1;
	private JButton button2;
	
	private FlowLayout flowLayout;

	// 1.
	// JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려주세요.
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		add(button1);
		add(button2);
	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
