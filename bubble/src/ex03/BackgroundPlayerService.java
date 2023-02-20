package ex03;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ex01.Player;

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
			Color leftColor = new Color(image.getRGB(player.getX()+6 , player.getY()));
			Color rightColor = new Color(image.getRGB(player.getX()+58, player.getY()));
			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("현재 상태는 왼쪽 벽에 충돌했어요!!!");// 왼쪽벽에 충돌함 !
				//벽에 충돌했다.
				player.setLeft(false);
				player.setLeftWallCrash(true);
			}else if((rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0 ) ){
				System.out.println("현재 상태는 오른쪽 벽에 충돌 했어요");// 오른쪽벽에 충돌함 !
				player.setRight(false);
				player.setRightWallCrash(true);
			}
			else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);

			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}// end of while
	}
}
