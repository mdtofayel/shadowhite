package com.threeD.serviceImplementation;

import com.threeD.domain.User;
import com.threeD.repository.UserRepository;
import com.threeD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userServiceForAdminThreeD")
public class UserServiceImpl implements UserService {

	@Qualifier("userRepositoryForAdminThreed")
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
