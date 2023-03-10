package ch_exercise;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Button extends JFrame implements ActionListener {

	private JButton button1;
	private JButton button2;
	private JLabel label; // 글자를 넣어서 화면에 띄울수 있다
	private JTextField textField1; // 사용자 한테 입력 값을 받을 수 있는 컴포넌트
	private JTextField textField2; // 사용자 한테 입력 값을 받을 수 있는 컴포넌트
	private JTextField textField3; // 사용자 한테 입력 값을 받을 수 있는 컴포넌트
	private JPasswordField jPasswordField; // 사용자 비번을 받는 컴포넌트
	private JCheckBox checkBox;
	private JTextArea text;

	UserDAO dao = new UserDAO();
	private DBClient dbClient = new DBClient();

	public Button() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField1 = new JTextField("입력", 20);
		textField2 = new JTextField("입력", 20);
		textField3 = new JTextField("입력", 20);
		button1 = new JButton("SELECT");
		button2 = new JButton("INSERT");
		label = new JLabel("글자를 적는 컴포넌트");
		text = new JTextArea("result");
//		jPasswordField = new JPasswordField("비번입력", 10);
//		checkBox = new JCheckBox("동의");
	}

	private void setInitLayout() {
		add(textField1);
		add(textField2);
		add(textField3);
		add(button1);
		add(button2);
		add(label);
		setLayout(new FlowLayout());
		setVisible(true);
		add(text);
	}

	private void addEventListener() {
		// ColorChangeFrame은 다형성이 적용되어서
		// ActionListener 타입으로도 바라볼수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	public static void main(String[] args) {
		new Button();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		UserDAO userDAO = new UserDAO();
		text.setText("");

		// select 확인
		ArrayList<UserDTO> list = userDAO.select(textField1.getText());
		if (e.getSource() == this.button1) {

			for (int i = 0; i < list.size(); i++) {

				text.append("id \t" + "name \t" + "email" + "\n");
				text.append(list.get(i).getId() + "\t");
				text.append(list.get(i).getName() + "\t");
				text.append(list.get(i).getEmail() + "\t");
				System.out.println();
			}
		} else {
			text.append("조회할 대상이 없습니다.");
		}
		
			
		if (e.getSource() == this.button2) {
			UserDTO dto = new UserDTO(textField1.getText(),textField2.getText(),textField3.getText());
			userDAO.insert(dto);
		}
	}



}
