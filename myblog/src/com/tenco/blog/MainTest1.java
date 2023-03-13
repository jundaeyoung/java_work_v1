package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest1 {
	public static void main(String[] args) {

		// 회원가입 진행을 mysql 서버까지 보내야한다.
		UserDTO userDTO = new UserDTO("홍길동", "1234", "b@nate.com", "부산");

		UserController userController = new UserController();

//		String result = userController.requestSignUp(userDTO, "localhost");
//		System.out.println(result);

		// 로그인 요청
		// 아이디, 비번
		UserDTO responseUser = userController.requestsignIn(userDTO.getUserName(), userDTO.getPassword());
		if(responseUser == null) {
			System.out.println("로그인에 실패했습니다.");
		}else {
			System.out.println("당신은 인증된 유저가 맞습니다. 로그인 성공");
		}
		
	}
}
