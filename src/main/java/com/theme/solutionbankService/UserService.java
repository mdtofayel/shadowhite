package com.theme.solutionbankService;

import com.theme.solutionbankDomain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}