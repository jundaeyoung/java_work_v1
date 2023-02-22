package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인 쓰레드는
// 메인 화면에 그림 그려주고 있다. (키보드 이벤트 리스너도 받고 있음) 바쁨
// 이 클래스는
// 백그라운드에서 계속 player에 움직임을 관찰하는 기능을 가지게 만들것이다.

public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;

		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드 플레이어 서비스 객체에 사용하는 이미지 경로 및 파일명 확인!");

		}

	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈때는 역시나 기준 좌표지점을 보정해야한다.
			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 6, player.getY()));
			Color rightColor = new Color(image.getRGB(player.getX() + 58, player.getY()));
			Color bottomColor = new Color(image.getRGB(player.getX() + 7, player.getY() + 50));
			Color highColor = new Color(image.getRGB(player.getX() + 7, player.getY() - 30));

			// 바닥 충돌 감지 기능
//			Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10, player.getY()+60));
			// -65536, -16776961,-1
			int bottomColorLeft = image.getRGB(player.getX() + 31, player.getY() + 55);
			// -65535, -1677696,-1
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			// 하얀색이 아니면 바닥이다.
			if (bottomColorLeft + bottomColorRight != -2) {
//				System.out.println("여기는 바닥입니다.");
				player.setDown(false);
				player.setAir(false);
			} else {
				if (player.isUp() == false && player.isDown() == false) {
					player.down();

				}
			}

			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("현재 상태는 왼쪽 벽에 충돌했어요!!!");// 왼쪽벽에 충돌함 !
				// 벽에 충돌했다.
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else if ((rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0)) {
				System.out.println("현재 상태는 오른쪽 벽에 충돌 했어요");// 오른쪽벽에 충돌함 !
				player.setRight(false);
				player.setRightWallCrash(true);
			} else if (bottomColor.getRed() == 255 && bottomColor.getGreen() == 0 && bottomColor.getBlue() == 0) {
				System.out.println("현재 상태는 바닥벽에 충돌했어요");
				player.setDown(false);
				player.setDownWallCrash(true);
				player.setAir(false);

			} else if (highColor.getRed() == 255 && highColor.getGreen() == 0 && highColor.getBlue() == 0) {
				player.setUp(false);
				player.setUpWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
				player.setUpWallCrash(false);
				player.setDownWallCrash(false);

			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // end of while
	}
}
