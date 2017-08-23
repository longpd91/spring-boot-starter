package com.longpd.service;


import com.longpd.domain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
