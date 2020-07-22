package com.theme.repository;

import com.theme.domain.UserProfileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tofayel Ahmed on  6/9/17.
 */

@Repository
public interface UserProfileInfoRepository extends JpaRepository<UserProfileInfo,Integer> {
    UserProfileInfo findByUserName(String userName);
}
