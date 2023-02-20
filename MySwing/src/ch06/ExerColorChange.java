package ch06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExerColorChange extends JFrame implements ActionListener {

	private JPanel panel;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public ExerColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("색표현");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel2 = new JPanel();
		button1 = new JButton("red");
		button2 = new JButton("blue");
		button3 = new JButton("yellow");
		button4 = new JButton("black");
		button5 = new JButton("white");

	}

	private void setInitLayout() {
		// Frame -> borderLayour (기본값이다)
		add(panel2,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH );
		panel.setBackground(Color.yellow);
		panel2.setBackground(Color.yellow);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		setVisible(true);		
	}

	private void addEventListener() {
		// this 는 ColorChange이다.
		// 다형성이 적용되기 때문에
		// ActionListener 타입으로 바라볼수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	// test code
	public static void main(String[] args) {
		new ExerColorChange();
	} // end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가
	// actioinPerformed 메서드를 호출 시킨다.
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(e.getSource()); 
		JButton targetButton = (JButton) e.getSource(); 
		targetButton.setText("눌르짐 버튼입니다."); 

		System.out.println(targetButton.getText()); 

		if (e.getSource() == this.button1) {
			panel.setBackground(Color.red);
			panel2.setBackground(Color.red);
			System.out.println("button1이 눌러 졌어요");
		} else if (e.getSource() == this.button2) {
			panel.setBackground(Color.blue);
			panel2.setBackground(Color.blue);
			System.out.println("button2가 눌러졌어요");
		} else if (e.getSource() == this.button3) {
			panel.setBackground(Color.yellow);
			panel2.setBackground(Color.yellow);

		} else if (e.getSource() == this.button4) {
			panel.setBackground(Color.black);
			panel2.setBackground(Color.black);

		} else if (e.getSource() == this.button5) {
			panel.setBackground(Color.white);
			panel2.setBackground(Color.white);

		}
	}

} // end of class
