package com.jdy1787.blog;

import com.jdy1787.blog.controller.UserController;
import com.jdy1787.blog.dao.UserDAO;
import com.jdy1787.blog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		UserDTO userDTO = new UserDTO("jun1","1234","jun@naver.com","busan");
		UserController userController = new UserController();
		
//		userController.requestSignUp(userDTO, "localhost");
		
		UserDTO responseUser = userController.requestsignIn(userDTO.getUserName(), userDTO.getPassword());
		if(responseUser ==null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		
//		userController.r
	}

}
