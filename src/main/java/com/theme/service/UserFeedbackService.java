package com.theme.service;

import java.util.List;

import com.theme.domain.UserFeedback;




public interface UserFeedbackService {
	  List<UserFeedback> listAllUserFeedback();
	  UserFeedback getUserFeedbackById(Integer id);
	  UserFeedback saveFeedback(UserFeedback userFeedback);
	    void deleteUserFeedback(Integer id);
	    
}
