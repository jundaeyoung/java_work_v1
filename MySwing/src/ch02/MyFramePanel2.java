package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel2 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;

	private JPanel panel1;
	private JPanel panel2;

	public MyFramePanel2() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("패널 추가 연습");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);

		button1 = new JButton("button1");
		button1.setSize(100, 100);

		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

		setVisible(true);

	}

	public static void main(String[] args) {
		new MyFramePanel2();
	}

}
