package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDTO;

public interface IUserDAO {

	// 인터페이스 안에는 추상메서드만 사용할 수 있다.
	// public abstract 생략 되어 있다.
	int saveUser(UserDTO user);

	UserDTO selectUserByUsernameAndPassword(String username, String password);
}
