package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;

	public NoLayoutEx2() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("내마음대로 연습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		button1 = new JButton("버튼1");
		button1.setSize(100,100);
		button2 = new JButton("버튼1");
		button2.setSize(100,100);
		button3 = new JButton("버튼1");
		button3.setSize(100,100);
		button4 = new JButton("버튼1");
		button4.setSize(100,100);
		button5 = new JButton("버튼1");
		button5.setSize(100,100);
		button6 = new JButton("버튼1");
		button6.setSize(100,100);
		button7 = new JButton("버튼1");
		button7.setSize(100,100);
		button8 = new JButton("버튼1");
		button8.setSize(100,100);
		button9 = new JButton("버튼1");
		button9.setSize(100,100);
		button10 = new JButton("버튼1");
		button10.setSize(100,100);
		button11 = new JButton("버튼1");
		button11.setSize(100,100);
		button12 = new JButton("버튼1");
		button12.setSize(100,100);
		button13 = new JButton("버튼1");
		button13.setSize(100,100);
		button14 = new JButton("버튼1");
		button14.setSize(100,100);
	}
	private void setInitLayout() {
		setLayout(null);
		button1.setLocation(400,500);
		add(button1);
		button2.setLocation(300,400);
		add(button2);
		button3.setLocation(500,400);
		add(button3);
		button4.setLocation(200,300);
		add(button4);
		button5.setLocation(600,300);
		add(button5);
		button6.setLocation(300,200);
		add(button6);
		button7.setLocation(500,200);
		add(button7);
		button8.setLocation(400,300);
		add(button8);
		button9.setLocation(300,300);
		add(button9);
		button10.setLocation(500,300);
		add(button10);
		button11.setLocation(400,400);
		add(button11);
		button12.setLocation(400,100);
		add(button12);
		button13.setLocation(400,100);
		add(button13);
		button14.setLocation(400,100);
		add(button14);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
