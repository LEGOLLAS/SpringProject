package com.hong.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.hong.spring.ex.jsp.domain.User;

@Repository
public interface UserRepository {
	public int addUser(
			@Param("name") String name,
			@Param("birthday") String birthday,
			@Param("email") String email,
			@Param("introduce") String introduce
			);
	
	public User selectLastUser();
	
	public int addUserByObject(User user);
}
