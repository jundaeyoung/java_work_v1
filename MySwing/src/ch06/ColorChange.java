package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {

	private JPanel panel;
	private JButton button1;
	private JButton button2;

	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("색표현");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");

	}

	private void setInitLayout() {
		// Frame -> borderLayour (기본값이다)

		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		setVisible(true);
	}

	private void addEventListener() {
		// this 는 ColorChange이다.
		// 다형성이 적용되기 때문에
		// ActionListener 타입으로 바라볼수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	// test code
	public static void main(String[] args) {
		new ColorChange();
	} // end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가
	// actioinPerformed 메서드를 호출 시킨다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object
//		 System.out.println(e.getSource()); // 주소값 확인
//		JButton targetButton = (JButton)e.getSource();    // 다운 캐스팅
//		targetButton.setText("눌르짐 버튼입니다.");  // 버튼 모양이 바뀜
//		
//		System.out.println(targetButton.getText());  // click1, click2 로나옴
//		
//		if(e.getSource()==this.button1) {
//			panel.setBackground(Color.gray);
//			System.out.println("button1이 눌러 졌어요");
//		}else {
//			panel.setBackground(Color.yellow);
//			System.out.println("button2가 눌러졌어요");

		// 문제 1
		// 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요.
		JButton targetButton = (JButton) e.getSource();
		System.out.println(targetButton.getText());

		if (targetButton.getText().equals("click1")) {
			panel.setBackground(Color.gray);
			System.out.println("button1이 눌러 졌어요");
		} else {
			panel.setBackground(Color.yellow);
			System.out.println("button2가 눌러졌어요");
		}
	}
} // end of class
