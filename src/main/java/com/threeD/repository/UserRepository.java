package com.threeD.repository;


import com.threeD.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepositoryForAdminThreed")
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
	 User findByUserName(String userName);
	User findById(Integer id);
	 Optional<User> findByResetToken(String resetToken);

}

