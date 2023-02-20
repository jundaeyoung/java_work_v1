package ch10;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exer extends JFrame {
	BufferedImage background;
	BufferedImage pink;
	BufferedImage gray;

	public Exer() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			background = ImageIO.read(new File("images/background_map.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void setInitLayout() {

		setVisible(true);

	}

	private void addEventListener() {

	}

	class Exer2 extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(background, 0, 0, 400, 400, null);
		}
	}

}
