package ch_exercise;

import java.util.ArrayList;


public interface IUserDAO {

	ArrayList<UserDTO> select(String content);
	int insert(UserDTO dto);
	int update(UserDTO dto, String targetUser);
	int delete(String username);
	
	
}
