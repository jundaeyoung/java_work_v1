package com.jdy1787.blog.controller;

import com.jdy1787.blog.dto.UserDTO;
import com.jdy1787.blog.service.Userservice;

public class UserController {

	
	private Userservice userService;
	
	public UserController() {
		userService = new Userservice();
	}
	public String requestSignUp(UserDTO  user, String host) {
		String response = "외부에서는 회원가입이 안됩니다.";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
		
		
	}
	public UserDTO requestsignIn(String username , String password) {
		UserDTO responseUserDTO = userService.checkUser(username, password);
		return responseUserDTO;
	}
	
	
}

