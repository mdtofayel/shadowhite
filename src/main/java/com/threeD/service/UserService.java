package com.threeD.service;


import com.threeD.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

	List<User> listAllUser();
	public User findUserByEmail(String email);
	public User findUserById(Integer id);
	public void saveUser(User user);
	public User findUserByUserName(String name);
	void saveUserAfterEdit(User user);
	public Optional<User> findUserByResetToken(String resetToken);
}
