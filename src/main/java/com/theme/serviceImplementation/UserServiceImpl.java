package com.theme.serviceImplementation;

import com.theme.domain.User;
import com.theme.repository.UserRepository;
import com.theme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("userServiceForAdmin")
public class UserServiceImpl implements UserService {

	@Qualifier("userRepositoryForAdmin")
	@Autowired
	UserRepository userRepository;


	@Override
	public List<User> listAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public void saveUser(User user) {

	}

	@Override
	public User findUserByUserName(String name) {
		return null;
	}

	@Override
	public void saveUserAfterEdit(User user) {

	}

	@Override
	public Optional<User> findUserByResetToken(String resetToken) {
		return null;
	}
}
