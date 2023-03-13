package com.jdy1787.blog.service;

import com.jdy1787.blog.dao.UserDAO;
import com.jdy1787.blog.dto.UserDTO;

public class Userservice {

	private UserDAO userDAO;

	public Userservice() {
		userDAO = new UserDAO();
	}

	public String signUp(UserDTO user) {
		String msg = "";
		
		if (user.getUserName().equals("")) {
			msg = "사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;

		}
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}

	public UserDTO checkUser(String username, String password) {
		boolean isValid = true;
		if (username.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(username, password);

		}
		return userDTO;
	}
}

