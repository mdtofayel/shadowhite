package com.threeD.serviceImplementation;

import com.threeD.domain.UserFeedback;
import com.threeD.repository.UserFeedbackRepository;
import com.threeD.service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userFeedbackServiceThreeD")
public class UserFeedbackServiceImpl implements UserFeedbackService {

    @Autowired
    @Qualifier("userFeedbackRepositoryThreeD")
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
