package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {
	// main함수
	public static void main(String[] args) {

//		UserDTO dto = new UserDTO("티모","5678","b@nate.com","부산");
		UserController userController = new UserController();

		// 로그인 성공
		UserDTO loginUser = userController.requestsignIn("티모", "5678");
		System.out.println("userId : " + loginUser.getId());

		// title, content, readCount, userId
		// title, content, userId -> String으로 하나씩 지정, 클래스를 만들어서 넘기는 방법

		//글쓰기
		BlogController blogController = new BlogController();
		if (loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("MVC패턴의 이해", "그냥 쉬운거", loginUser.getId());
			if (response == 0) {
				System.out.println("글쓰기에 실패하였습니다.");
			} else {
				System.out.println("글쓰기에 성공하였습니다.");
			}
		}

	}// end of main
}// end of class
