package ex04;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Bubble extends JFrame {

	private ImageIcon bubble;

	public ImageIcon getBubble() {
		return bubble;
	}

	public void setBubble(ImageIcon bubble) {
		this.bubble = bubble;
	}

	public Bubble() {
		initData();
		setInitLayout();
	}

	public void initData() {
		bubble = new ImageIcon("images/bubble.png");
	}

	public void setInitLayout() {
		setSize(50, 50);
	}

}
