package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

	JButton[] buttons = new JButton[11];
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("내마음대로 연습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i<buttons.length;i++) {
			buttons[i]= new JButton("❤");
			buttons[i].setSize(100, 100);
		}
		
	}
	private void setInitLayout() {
		setLayout(null);
		buttons[0].setLocation(400,500);
		buttons[1].setLocation(300,400);
		buttons[2].setLocation(500,400);
		buttons[3].setLocation(200,300);
		buttons[4].setLocation(600,300);
		buttons[5].setLocation(300,200);
		buttons[6].setLocation(500,200);
		buttons[7].setLocation(400,300);
		buttons[8].setLocation(300,300);
		buttons[9].setLocation(500,300);
		buttons[10].setLocation(400,400);

		for(int i = 0 ;  i< buttons.length ; i++) {
			add(buttons[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
