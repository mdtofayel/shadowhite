package com.threeD.service;

import com.threeD.domain.UserFeedback;

import java.util.List;


public interface UserFeedbackService {
	  List<UserFeedback> listAllUserFeedback();
	  UserFeedback getUserFeedbackById(Integer id);
	  UserFeedback saveFeedback(UserFeedback userFeedback);
	    void deleteUserFeedback(Integer id);
	    
}
