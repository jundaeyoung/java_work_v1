package ex01;

import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ex01.BackgroundPlayerService;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// player가 메모리에 올라간 상태이다.
		// 약속 run method 안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false); // 창 크기 조절 기능( 거짓 )
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 37,38,39,40
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 추가될수 있도록 코드추가
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야해
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야해
					player.setRight(false);
					break;
				}
			}

		});

	}

	public static void main(String[] args) {
		new BubbleFrame();

	}// end of main

}
