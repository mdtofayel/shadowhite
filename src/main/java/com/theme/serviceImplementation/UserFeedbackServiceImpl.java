package com.theme.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.domain.UserFeedback;
import com.theme.repository.UserFeedbackRepository;
import com.theme.service.UserFeedbackService;

@Service
public class UserFeedbackServiceImpl implements UserFeedbackService {
						
	@Autowired
	UserFeedbackRepository userFeedbackRepository;

	
	
	@Autowired
	public void setUserFeedbackRepository(UserFeedbackRepository userFeedbackRepository) {
		this.userFeedbackRepository = userFeedbackRepository;
	}



	@Override
	public List<UserFeedback> listAllUserFeedback() {
		// TODO Auto-generated method stub
		return userFeedbackRepository.findAll();
	}



	@Override
	public UserFeedback getUserFeedbackById(Integer id) {
		// TODO Auto-generated method stub
		return userFeedbackRepository.findUserFeedbackById(id);
	}



	@Override
	public UserFeedback saveFeedback(UserFeedback userFeedback) {
		// TODO Auto-generated method stub
		return userFeedbackRepository.save(userFeedback);
	}



	@Override
	public void deleteUserFeedback(Integer id) {
		// TODO Auto-generated method stub
		userFeedbackRepository.delete(id);
	}
	
}
