package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame {

	ImagePanel imagePanel; //  내부 클래스를 멤버 변수로 선언
	// Jpanel 안에 이미지를 넣는 방법!!
	// 내부 클래스 이용해 보기
	class ImagePanel extends JPanel {
		private Image image;

		public ImagePanel() {
			image = new ImageIcon("image1.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상
			// 대상, x, y, 가로길이, 세로길이
			g.drawImage(image, 0, 0, 400, 400, null);
		}

	}// end of inner class

	public MyImageFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

}
