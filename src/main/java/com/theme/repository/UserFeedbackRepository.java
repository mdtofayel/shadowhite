package com.theme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theme.domain.UserFeedback;

@Repository("userFeedbackRepository")
public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Integer> {
	
	UserFeedback findUserFeedbackById(Integer id);

}
