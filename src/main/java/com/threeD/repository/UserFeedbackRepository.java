package com.threeD.repository;

import com.threeD.domain.UserFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userFeedbackRepositoryThreeD")
public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Integer> {
	
	UserFeedback findUserFeedbackById(Integer id);

}
