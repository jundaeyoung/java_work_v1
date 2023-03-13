package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.BlogDTO;
import com.tenco.blog.dto.UserDTO;

public class MainTest3 {
	// main함수
	public static void main(String[] args) {

		// 사용자 여부 확인
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		UserDTO loginUser = userController.requestsignIn("티모", "5678");
		System.out.println(loginUser);

		// main -> BlogController 에 넘겨야 할 값??
		// 해당 게시글에 pk 값을 알아야한다.
		// 사용자에 대한 정보도 필요하다.(userId) 5,3
//		blogController.requestBoardDelete(5, loginUser.getId());
		BlogDTO selectBoard = blogController.selectBoard(7);
		System.out.println(selectBoard);

	}// end of main
}// end of class
