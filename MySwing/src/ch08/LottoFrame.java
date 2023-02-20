package ch08;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {

	int[] lotto = new int[6];
	JButton button;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임시작~");
		lotto = getLottoNumber();

		// 여기에 코드 입력 해주세요~!
		// 그림을 다시 그리다.
		repaint(); // 새로고침 F5

	}

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random rd = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int j = rd.nextInt(45) + 1;
			lotto[i] = j;
			// 중복값 확인을 위해 반복물을 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
//					System.out.println("-------------");
//					System.out.println(" 중복 발생 했어요 ");
//					System.out.println("현재 i값 : " + i);
//					System.out.println("현재 e 값 : " + e);
//					System.out.println("j : " + j);
					// 중복 발생
					i--;
					break;
				}
			}
			// 오름 차순 정렬
		}
		Arrays.sort(lotto); // 배열을 정렬해주는 기능
		return lotto;
	}

	// 테스트 코드
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Font f = new Font("궁서체", Font.BOLD, 25);

		g.setFont(f);

		if (lotto[0] == 0) {
			g.drawString("로또 번호를 클릭하세요.", 150, 220);
			// 게임 초기상태
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미이다.
		// 그럼 메서드와 멤벼 변수를 활용해서 그림을 그릴 수 있다.
		int j = 50;
		for (int i = 0; i < lotto.length; i++) {
			g.drawString(lotto[i] + "", j, 200);
			j += 100;

		}
	}

	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();
		a.getLottoNumber();

	}// end of main
}// end of class
