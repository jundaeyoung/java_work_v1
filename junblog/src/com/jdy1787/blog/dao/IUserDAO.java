package com.jdy1787.blog.dao;

import com.jdy1787.blog.dto.UserDTO;

public interface IUserDAO {
	
	int saveUser(UserDTO user);
	
	UserDTO selectUserByUsernameAndPassword(String username, String password);
	
	UserDTO delete(String username,String password);
}
