package ex01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator extends JFrame {
	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100 의 배수이면서 400의 배수인 해는 윤년
	private JLabel label;
	private JLabel label2;
	private JLabel labelText;
	private JButton button1;
	private int labelTextX;
	private int labelTextY;
	JButton[] buttons = new JButton[100];
	private static int count = 3;
	private int i;

	public Calculator() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(800, 800);
		for (int i = 0; i < 100; i++) {
			buttons[i] = new JButton(i + "년");
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		label = new JLabel("계산할 년도를 작성해주세요.");

		labelText = new JLabel("");
		labelText.setSize(1, 1);
	}

	public void setInitLayout() {
		for (int i = 0; i < 100; i++) {
			add(buttons[i]);
		}
		add(label);
		setLayout(new FlowLayout());
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);

	}

	private void addEventListener() {
		for (i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (i % 400 == 0 && i % 100 == 0) {
						label.setText(i + "윤년입니다.");
					} else if (i % 100 == 0 && i % 4 == 0) {
						label.setText(i + "윤년이 아닙니다..");
					} else if (i % 4 == 0) {
						label.setText(i + "윤년입니다.");

					} else {
						label.setText(i + "윤년이 아닙니다..");
					}

				}
			});
		}

	}

	public static void main(String[] args) {

		new Calculator();

		System.out.println("계산한 년도를 작성해주세요.");

	}
}
