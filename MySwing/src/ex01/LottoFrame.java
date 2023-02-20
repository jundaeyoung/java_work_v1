package ex01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {
	JButton button;
	LottoRandomNumber random = new LottoRandomNumber();
	boolean isStart = false;

	// 화면 담당
	// 기능은 LottoRandomNumber 클래스에서 받아서 처리
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start~!");
	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 150);
			return;
		}

		int[] getNumbers = random.getLottoNumber();

		g.drawString(getNumbers[0] + "", 50, 150);
		g.drawString(getNumbers[1] + "", 150, 150);
		g.drawString(getNumbers[2] + "", 250, 150);
		g.drawString(getNumbers[3] + "",350, 150);
		g.drawString(getNumbers[4] + "", 450, 150);
		g.drawString(getNumbers[5] + "", 550, 150);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() { // ?

			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시 그려라
				isStart = true;
				repaint();
			}
		});
	}

}
