package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable {

	// 버블의 위치 상태
	private int x;
	private int y;

	// 버블의 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 : 0 기본, 1( 적을 가둔 물방울 )
	private int state;
	private ImageIcon bubble; // 기본 물방을 이미지
	private ImageIcon bubbled; // 적을 가둔 상태 이미지
	private ImageIcon bomb; // 물방울이 터진 상태 이미지

	private Player player;
	private BackgroundBubbleService backgroundBubbleService;

	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);
		initThread();
	}

	public void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;

	}

	public void setInitLayout() {
		// 플레이어가 있는 위치에서 태어나야한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);

	}

	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (player.getpWay() == PlayerWay.LEFT) {
					// 왼쪽 방향을 보고 있다.
					left();
				} else {
					// 오른쪽 방향을 보고 있다.
					right();
				}

			}
		}).start();

	}

	@Override
	public void left() {

		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			// 체크 왼쪽 벽이야? -> break;
			System.out.println(backgroundBubbleService.leftWall());
			if (backgroundBubbleService.leftWall()) {
				break;
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {

		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up();

	}

	@Override
	public void up() {
		up = true;
		while (true) {
			y--;
			setLocation(x, y);
			if (backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();
	}
	// 메서드 행위 이름짓기 (동사 -> 목적어)
	private void clearBubble() {
		System.out.println("11111111111111111111");
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
			setIcon(null);   
//			repaint(); // 부하가 크다(전부다 다시 그림)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
