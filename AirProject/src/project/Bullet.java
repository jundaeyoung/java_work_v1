package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bullet extends JLabel implements Moveable {

	private int x;
	private int y;

	private boolean up;

	private int state;
	private ImageIcon bullet;
	private ImageIcon boom;

	private AirplaneFrame mContext;
//	private BackgroundBulletService backgroundBulletService;

	private Item item;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Bullet(AirplaneFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
//		backgroundBulletService = new BackgroundBulletService(this);
		initThread();
	}

	public void initData() {
		bullet = new ImageIcon("imagesProject/PlayerBullet1.png");
		boom = new ImageIcon("imagesProject/explosion.gif");
		state = 0;
		up = false;
	}

	public void setInitLayout() {
		x = mContext.getPlayer().getX() + 20;
		y = mContext.getPlayer().getY();
		setIcon(bullet);
		setSize(80, 60);
		setLocation(x, y);
	}

	public synchronized void initThread() {
		new Thread(new Runnable() {
			public void run() {
				up();
			}
		}).start();
	}

	public void crash() {
		mContext.getEnemy().setAlive(1);
		state = 1;
		mContext.remove(mContext.getEnemy());
		System.out.println("3333");
//		setIcon(boom);
		System.out.println("111111");
//		mContext.getItem().setDown(true);
//		mContext.getItem().down();
//		mContext.repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIcon(null);

	}

	public void item() {
		item = new Item(mContext);
		item.initThread();

	}

	@Override
	public void left() {

	}

	@Override
	public void right() {

	}

	@Override
	public synchronized void up() {
		up = true;
		while (true) {
			y--;
			setLocation(x, y);

			// +++ 수정 자료형에 따라 맞는 범위 보정 (enemy2 기준)

//			if (mContext.getEnemy() instanceof EnemyUnit1 && mContext.getEnemy().getAlive() == 0) {
	//			if (Math.abs(x - (mContext.getEnemy().getX()+250)) < 230 && (y - mContext.getEnemy().getY()) < 100) {
	//				if (mContext.getEnemy().getAlive() == 0) {
	//					mContext.getEnemy().beattacked();
	//					crash();
	//					setIcon(boom);
	//					item();
	//				}
	//			}

//			} else if (mContext.getEnemy() instanceof EnemyUnit2 && mContext.getEnemy().getAlive() == 0) {
	//			if (Math.abs(x - (mContext.getEnemy().getX() + 15)) < 15 && (y - mContext.getEnemy().getY()) < 15) {
	//				if (mContext.getEnemy().getAlive() == 0) {
	//					mContext.getEnemy().beattacked();
	//					crash();
	//					setIcon(boom);
	//					item();
	//				}
	//			}

//			} else if (mContext.getEnemy() instanceof EnemyUnit3 && mContext.getEnemy().getAlive() == 0) {
	//			if (Math.abs(x - (mContext.getEnemy().getX() + 100)) < 100 && (y - mContext.getEnemy().getY()) < 90) {
	//				if (mContext.getEnemy().getAlive() == 0) {
	//					mContext.getEnemy().beattacked();
	//					crash();
	//					setIcon(boom);
	//					item();
	//				}
	//			}	

//			} else if (mContext.getEnemy() instanceof EnemyUnit4 && mContext.getEnemy().getAlive() == 0) {
//				if (Math.abs(x - (mContext.getEnemy().getX() + 43)) < 45 && (y - mContext.getEnemy().getY()) < 45) {
//					if (mContext.getEnemy().getAlive() == 0) {
//						mContext.getEnemy().beattacked();
//						crash();
//						setIcon(boom);
//						item();
//					}
//				}
//			}

			// 기존 버전
			if (Math.abs(x - mContext.getEnemy().getX()) < 50 && Math.abs(y - mContext.getEnemy().getY()) < 50) {
				if (mContext.getEnemy().getAlive() == 0) {
					mContext.getEnemy().beattacked();
					crash();
					setIcon(boom);
					item();
				}
			}

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (y == 0) {
				setIcon(null);
				break;
			}
		}
	}

	@Override
	public void down() {

	}

}
