package project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AirplaneFrame extends JFrame {

	private AirplaneFrame mContext = this;

	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;
	private Life life;
	private Life life1;
	private Life life2;

	
	public Life getLife1() {
		return life1;
	}

	public void setLife1(Life life1) {
		this.life1 = life1;
	}

	public Life getLife2() {
		return life2;
	}

	public void setLife2(Life life2) {
		this.life2 = life2;
	}

	public Life getLife() {
		return life;
	}

	public void setLife(Life life) {
		this.life = life;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public AirplaneFrame getmContext() {
		return mContext;
	}

	public void setmContext(AirplaneFrame mContext) {
		this.mContext = mContext;
	}

	public JLabel getBackgroundMap() {
		return backgroundMap;
	}

	public void setBackgroundMap(JLabel backgroundMap) {
		this.backgroundMap = backgroundMap;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public AirplaneFrame() {
		initData();
		setInitLayout();
		addEventListener();

		new Thread(new BackgroundPlayerService(player)).start();

	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("imagesProject/backgroundService.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(950, 950);

		player = new Player(mContext);
		enemy = new Enemy(mContext);
		life = new Life(mContext);
		life1 = new Life(mContext);
		life2 = new Life(mContext);
	}

	private void setInitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false); // 창 크기 조절 기능( 거짓 )
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
		add(enemy);
		add(life);
		life.setLocation(20, 10);
		add(life1);
		life1.setLocation(60, 10);
		add(life2);
		life2.setLocation(100, 10);
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
					if (!player.isUp() && !player.isUpWallCrash()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					if (player.isDown() == false && player.isDownWallCrash() == false) {
						player.down();
					}
					break;
				case KeyEvent.VK_SPACE:
					player.attack();
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

				case KeyEvent.VK_UP:
					player.setUp(false);
					break;

				case KeyEvent.VK_DOWN:
					player.setDown(false);
					break;
				}
			}

		});

	}

	public static void main(String[] args) {
		new AirplaneFrame();
	}
}
