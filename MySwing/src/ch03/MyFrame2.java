package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch03.MyFrame1.MyDrawPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 활용해서
	// JPanel를 상속받고 pain 메서드로
	// 집 그림을 그려주세요.
	// cafe - > 결과 사진 올려주세요.

	MyDrawPanel drawPanel;

	class MyDrawPanel extends JPanel {

		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(230, 300, 300, 280);
			g.drawString("🌟", 100, 100);
			g.drawString("🌟", 200, 120);
			g.drawString("🌟", 340, 140);
			g.drawString("🌟", 400, 80);
			g.drawString("🌟", 520, 110);
			g.drawString("🌟", 630, 220);
			g.drawString("✨", 200, 120);
			g.drawLine(230, 300, 380, 150);
			g.drawLine(380, 150, 530, 300);
			g.drawRect(400, 360, 80, 80);
			g.drawLine(400, 400, 480, 400);
			g.drawLine(440, 360, 440, 440);
			g.drawOval(600, 70, 100, 100);
			g.drawRect(250, 380, 100, 190);
			g.drawOval(260, 475, 10, 10);
			g.drawLine(380, 150, 480, 150);
			g.drawLine(480, 150, 630, 300);
			g.drawLine(430, 300, 630, 300);
			g.drawLine(630, 300, 630, 560);
			g.drawLine(530, 580, 630, 580);
			g.drawLine(350, 560, 630, 560);
			g.drawLine(630, 560, 638, 570);
			g.drawLine(638, 570, 638, 580);
			g.drawLine(230, 560, 250, 560);
			g.drawLine(630, 580, 638, 580);

			g.drawRect(550, 380, 70, 170);
			g.drawLine(555, 385, 555, 545);
			g.drawLine(615, 385, 615, 545);
			g.drawLine(555, 385, 615, 385);
			g.drawLine(555, 545, 615, 545);
			g.drawLine(585, 385, 585, 545);
			g.drawLine(0, 320, 230, 320);
			g.drawLine(630, 320, 900, 320);

		}
	}

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집 그리기");
		setSize(900, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

} // end of class
