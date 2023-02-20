package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {

	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스(적군) 이미지1
	BufferedImage grayImage1;
	BufferedImage grayDie;

	// JPanel 상속 --> inner class
	CustomPanel custompanel;

	int pinkX = 200;
	int pinkY = 500;
	int grayX = -20;
	int grayY = 460;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread =  new Thread(custompanel);
//		thread.start();
		new Thread(custompanel).start();
	}

	private void initData() {
		setTitle("미니 어몽어스");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 있음, cuntompanel 있음
		// 초기화
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pinkamongus.png"));
			grayImage1 = ImageIO.read(new File("images/amongus.png"));
			grayDie = ImageIO.read(new File("images/die.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}

		custompanel = new CustomPanel();
	}

	private void setInitLayout() {
		// 레이아웃은 기본 레이아웃으로 설정
		// add 호출시 paintComponent 메서드 실행됨
		add(custompanel);
//		setLayout(null);// 좌표 기반
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this); // 이벤트 리스너 등록 처리
	}

	class CustomPanel extends JPanel implements Runnable {

//		boolean isRight = true;
		boolean isDie = true;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
//			g.drawImage(grayDie, grayX, grayY, 50, 50, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			System.out.println("1");
			while (true) {
				if (isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}
				// 방향체크
				if (grayX > 700) {
					isRight = false;
				}
				if (grayX < 0) {
					isRight = true;
				}

				BufferedImage temp = null;
				if (grayX == pinkX && grayY == pinkY) {
					isDie = false;

					if (isDie == false) {
						temp = grayImage1;
						grayImage1 = grayDie;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						isDie = true;
					}
					if (isDie == true) {
						grayDie = grayImage1;
						grayImage1 = temp;

					}
				}

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
		}

	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode : " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			// 왼쪽
			pinkX = (pinkX < 0) ? -10 : pinkX - 20;
//			pinkX -= 20;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// 오른쪽
			pinkX = (pinkX > 700) ? 710 : pinkX + 20;
		} else if (keyCode == KeyEvent.VK_UP) {
			// 위쪽
			pinkY = (pinkY < 200) ? 200 : pinkY - 20;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			// 아래쪽
			pinkY = (pinkY > 600) ? 600 : pinkY + 20;
		}

		// 그림을 다시 그려주다
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}// end of outer class
