package project;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel implements Moveable {

	
	private AirplaneFrame mContext;

	// 프레임 사이즈 임시로 지정 (나중에 메인 프레임 만들고 수정)
	final int FRAME_SIZE_X = 950;
	final int FRAME_SIZE_Y = 950;

	// 적군이 움직일 수 있는 X의 최대, 최소 좌표 임시로 지정
	final int MIN_X = 10;
	final int MAX_X = 800;

	// 생존 여부 (살아 있음 : 0, 죽음 : 1)
	private int alive;
	private int status;

	// 위치 상태
	private int x;
	private int y;

	// 적군의 방향
	private EnemyWay enemyWay;

	// 움직임 상태 (우선 좌우만 구현, 움직이지 않음 : false)
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 적군 속도 상태
	private final int SPEED = 3;

	// 이미지
	private ImageIcon enemyImage;

	// 생성자
	public Enemy(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
		initEnemyDirection(enemyWay);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	// 생성자 메서드 1
	private void initData() {
		enemyImage = new ImageIcon("imagesProject/enemy4.png");
		// 초기 x 위치는 랜덤
		double randomX = Math.random(); // 0~1 범위의 소수 난수 생성
		x = (int) (FRAME_SIZE_X * randomX);
		// 방어적 코드 (x가 MIN_X보다 작거나 MAX_X보다 큰 경우)
		if (x < MIN_X) {
			x += MIN_X;
		} else if (x > MAX_X) {
			x -= (FRAME_SIZE_X - MAX_X);
		}
		System.out.println(x);

		// 초기 y 위치는 고정 (임시)
		y = 100;

		// 초기 이동 방향 랜덤
		Random random = new Random();
		int randomDirection = random.nextInt(2); // 0 또는 1 생성
		// 0이라면 왼쪽으로 먼저 움직임
		if (randomDirection == 0) {
			enemyWay = EnemyWay.LEFT;
			// 1이라면 오른쪽으로 먼저 움직임
		} else {
			enemyWay = EnemyWay.RIGHT;
		}

		// 초기 값 세팅 (기본값이라서 생략 가능)
		left = false;
		right = false;
		alive = 0; // 살아 있음
	}

	// 생성자 메서드 2
	private void setInitLayout() {
		setSize(150, 150); // 임시 크기
		setLocation(x, y);
		setIcon(enemyImage);

	}

	// 생성자 메서드 3
	private void initEnemyDirection(EnemyWay enemyWay) {
		if (enemyWay == EnemyWay.LEFT) {
			enemyWay = EnemyWay.LEFT;
			left();
		} else {
			enemyWay = EnemyWay.RIGHT;
			right();
		}

	}

	@Override
	public void left() {
		enemyWay = EnemyWay.LEFT;
		left = true;

		// 적군의 현재 x 좌표 저장
		int currentX = this.getX();

		// 적군은 (currentX - MIN_X)까지 움직일 수 있음
		int tempX = currentX - MIN_X; // 이동 가능 거리

		// 이동할 거리
		int goX = (int) (tempX * Math.random());
		System.out.println(goX);

		new Thread(() -> {
			for (int i = 0; i < (goX / SPEED); i++) {
				// 적군이 죽었다면 중단
				if (alive == 1) {
					return;
				}
				x = x - SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			right();
		}).start();
		left = false;
	}

	@Override
	public void right() {
		enemyWay = EnemyWay.RIGHT;
		right = true;

		int currentX = this.getX();

		// 적군은 (MAX_X - currentX)만큼 움직일 수 있음
		int tempX = MAX_X - currentX;

		int goX = (int) (tempX * Math.random());

		new Thread(() -> {
			for (int i = 0; i < (goX / SPEED); i++) {
				// 적군이 죽었다면 중단
				if (alive == 1) {
					return;
				}
				x = x + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			attact();
			left();
		}).start();
		right = false;
	}

	// 나중에
	@Override
	public void up() {

	}

	// 나중에
	@Override
	public void down() {
		enemyWay = EnemyWay.RIGHT;
		down = true;

		int currentX = this.getX();

		// 적군은 (MAX_X - currentX)만큼 움직일 수 있음
		int tempX = MAX_X - currentX;

		int goX = (int) (tempX * Math.random());

		new Thread(() -> {
			for (int i = 0; i < (goX / SPEED); i++) {
				// 적군이 죽었다면 중단
				if (alive == 1) {
					return;
				}
				x = x + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			attact();
			left();
		}).start();
		right = false;
	}

	public void attact() {
		EnemyBullet enemyBullet = new EnemyBullet(mContext);
		mContext.add(enemyBullet);

	}

}