package ex01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class exBubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private exPlayer player;
	
	public exBubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);
		
		player = new exPlayer();
		
	}
	public void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(player);
		
	}
	public void addEventListener() {
		
	}
}
