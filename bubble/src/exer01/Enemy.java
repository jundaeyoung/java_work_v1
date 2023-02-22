package exer01;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel implements Moveable {

	Random rd = new Random();

	private int x;
	private int y;
	private int random;

	private ImageIcon enemyR, enemyL;
	private ImageIcon bubbled;

	private final int SPEED = 2;
	private final int JUMPSPEED = 2;

	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	private boolean air;

	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean upWallCrash;
	private boolean downWallCrash;

	public int getX() {
		return x;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isUpWallCrash() {
		return upWallCrash;
	}

	public void setUpWallCrash(boolean upWallCrash) {
		this.upWallCrash = upWallCrash;
	}

	public boolean isDownWallCrash() {
		return downWallCrash;
	}

	public void setDownWallCrash(boolean downWallCrash) {
		this.downWallCrash = downWallCrash;
	}

	public Random getRd() {
		return rd;
	}

	public void setRd(Random rd) {
		this.rd = rd;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public ImageIcon getBubbled() {
		return bubbled;
	}

	public void setBubbled(ImageIcon bubbled) {
		this.bubbled = bubbled;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isAir() {
		return air;
	}

	public void setAir(boolean air) {
		this.air = air;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getEnemyR() {
		return enemyR;
	}

	public void setEnemyR(ImageIcon enemyR) {
		this.enemyR = enemyR;
	}

	public ImageIcon getEnemyL() {
		return enemyL;
	}

	public void setEnemyL(ImageIcon enemyL) {
		this.enemyL = enemyL;
	}

	public int getSPEED() {
		return SPEED;
	}

	public int getJUMPSPEED() {
		return JUMPSPEED;
	}

	public Enemy() {
		initData();
		setInitLayout();
		random();
	}

	public void initData() {
		enemyR = new ImageIcon("images/enemyR.png");
		enemyL = new ImageIcon("images/enemyL.png");
		bubbled = new ImageIcon("images/bubbled.png");

	}

	public void setInitLayout() {
		x = rd.nextInt(500);
		y = rd.nextInt(500);
		setSize(50, 50);
		setLocation(350, 200);
		setIcon(enemyL);

	}

	public void random() {
		for (int i = 0; i < 30; i++) {
			random = rd.nextInt(3);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (random == 0) {
				left();
			} else if (random == 1) {
				right();
			} else {
				up();

			}
		}
	}

	@Override
	public void left() {
		left = true;
		// 한번 키보드 왼쪽키를 누르면
		// 스레드 생성이된다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(enemyL);
					x -= SPEED;
					setLocation(x, y);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
				left = false;

			}
		}).start();
	}

	@Override
	public void right() {
		right = true;

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(enemyR);
					x += SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
				right = false;

			}
		}).start();
	}

	@Override
	public void up() {
		System.out.println("점프 !!");
		up = true;
		air = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y -= JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				up = false;
				down();
			}
		}).start();

	}

	public void down() {
		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y + 10);
//					try {
//						Thread.sleep(3);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					down = false;
				} // end of while

				// 상태값 다룰 때는 상황이 변하면 초기화 처리를 잘 해야한다.
			}
		}).start();
	}
}
