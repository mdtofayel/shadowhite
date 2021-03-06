package com.theme.service;


import com.theme.domain.UserProfileInfo;

/**
 * Created by Tofayel Ahmed on  6/9/17.
 */
public interface UserProfileInfoService {

    Iterable<UserProfileInfo> listAllUserProfileInfo();
    UserProfileInfo getUserProfileInfoById(Integer id);
    UserProfileInfo saveUserProfileInfo(UserProfileInfo userProfileInfo);
    void deleteUserProfileInfo(Integer id);
    UserProfileInfo getUserProfileInfoByUser(String userName);
}
