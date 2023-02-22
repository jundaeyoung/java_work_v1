package ex08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 주의!!!
// thread가 아님
// 메서드 호출시키기
//
public class BackgroundBubbleService {

	private BufferedImage image;
	private Bubble bubble;

	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("파일 경로를 확인해주세요.");
		}
	}

	public boolean leftWall() {
		// R G B 값을 int 값으로 확인 할수 있다.
		Color leftColor = new Color(image.getRGB(bubble.getX(), bubble.getY()));
		// R : 255, G : 0, B : 0 ;
		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			return true;
		}

		return false;
	}

	public boolean rightWall() {
		// R G B 값을 int 값으로 확인 할수 있다.
		Color rightColor = new Color(image.getRGB(bubble.getX()+55, bubble.getY()));
		// R : 255, G : 0, B : 0 ;
		if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
			return true;
		}
		return false;
	}

	public boolean topWall() {
		// R G B 값을 int 값으로 확인 할수 있다.
		Color topColor = new Color(image.getRGB(bubble.getX()+5, bubble.getY()));
		// R : 255, G : 0, B : 0 ;
		if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
			return true;
		}
		return false;
	}

}
