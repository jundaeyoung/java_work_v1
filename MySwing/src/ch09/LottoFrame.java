package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	JButton button;
	LottoRandomNumber random = new LottoRandomNumber();

	// 화면 담당
	// 기능은 LottoRandomNumber 클래스에서 받아서 처리
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start~!");
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
		System.out.println("게임 시작~!");
		random.getLottoNumber();
		repaint();
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Font f = new Font("궁서체", Font.BOLD, 25);

		g.setFont(f);

		if (random.getLotto()[0] == 0) {
			g.drawString("로또 번호를 클릭하세요.", 150, 220);
			// 게임 초기상태
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미이다.
		// 그럼 메서드와 멤벼 변수를 활용해서 그림을 그릴 수 있다.
		int j = 50;
		for (int i = 0; i < 6; i++) {
			g.drawString(random.getLottoNumber()[i] + "", j, 200);
			j += 100;

		}
	}
}
