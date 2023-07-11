package com.hong.spring.ex.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.spring.ex.jsp.domain.User;
import com.hong.spring.ex.jsp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public int addUser(
				String name,
				String birthday,
				String email,
				String introduce
			) {
		return userRepository.addUser(name, birthday, email, introduce);
	}
	
	public User selectLastUser() {
		User user = userRepository.selectLastUser(); 
		return user;
	}
}
