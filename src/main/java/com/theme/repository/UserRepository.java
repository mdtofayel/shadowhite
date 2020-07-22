package com.theme.repository;


import com.theme.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepositoryForAdmin")
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
	 User findByUserName(String userName);
	User findById(Integer id);
	 Optional<User> findByResetToken(String resetToken);

}

