package com.threeD.serviceImplementation;

import com.threeD.domain.UserProfileInfo;
import com.threeD.repository.UserProfileInfoRepository;
import com.threeD.service.UserProfileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Tofayel Ahmed on  6/9/17.
 */
@Service("userProfileInfoServiceThreeD")
public class UserProfileInfoServiceImpl implements UserProfileInfoService {

    UserProfileInfoRepository userProfileInfoRepository;

    @Autowired
    public void setUserProfileInfoRepository(@Qualifier("userProfileInfoRepositoryThreeD") UserProfileInfoRepository userProfileInfoRepository) {
        this.userProfileInfoRepository = userProfileInfoRepository;
    }

    @Override
    public Iterable<UserProfileInfo> listAllUserProfileInfo() {
        return null;
    }

    @Override
    public UserProfileInfo getUserProfileInfoById(Integer id) {
        return null;
    }

    @Override
    public UserProfileInfo saveUserProfileInfo(UserProfileInfo userProfileInfo) {
        return userProfileInfoRepository.save(userProfileInfo);
    }

    @Override
    public void deleteUserProfileInfo(Integer id) {

    }

    @Override
    public UserProfileInfo getUserProfileInfoByUser(String userName) {
        UserProfileInfo userProfileInfo = userProfileInfoRepository.findByUserName(userName);
        return userProfileInfo;
    }
}
