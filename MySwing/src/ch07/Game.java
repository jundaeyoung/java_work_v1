package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame implements Moveable {

	private JLabel backgroundMap;
	private JLabel player;
	private JLabel player2;
	private JLabel labelText;
	private int playerX;
	private int playerY;


	
	public Game() {

		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("보글보글");
		setSize(1100, 1000);
		setResizable(false);
		playerX = 210;
		playerY = 205;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/game.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(1050, 950);
		player = new JLabel(new ImageIcon("images/player.png"));
		player2 = new JLabel(new ImageIcon("images/player2.png"));
		player.setSize(50, 50);
		
	}

	private void setInitLayout() {
		setLayout(null);
		backgroundMap.setLocation(0, 0);
		player.setLocation(playerX, playerY);
		player2.setLocation(playerX, playerY);
		add(player);
		add(backgroundMap);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x,y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
					player =player2;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void left() {
		int x = playerX -= 50;
		int y = playerY;
		if (x <= 110) {
			x = playerX = 110;
		}
		player.setLocation(x, y);
	}

	@Override
	public void right() {
		int x = playerX += 50;
		int y = playerY;
		if (x >= 940) {
			x = playerX = 940;
		}
		player.setLocation(x, y);
	}

	@Override
	public void up() {
		int x = playerX;
		int y = playerY -= 50;
		if (y <= 205) {
			y = playerY = 205;
		}
		player.setLocation(x, y);

	}

	@Override
	public void down() {
		int x = playerX;
		int y = playerY += 50;
		if (y >= 845) {
			y = playerY = 845;
		}
		player.setLocation(x, y);
	}
}
