package com.theme.domain;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_profile_info")
public class UserProfileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name", length = 20)
    private String userName;



    @Column(name = "avatar_path",length = 100)
    private String avatarPath;

    @Column(name = "company_name",length = 50)
    private String companyName;

    @Column(name = "country",length = 30)
    private String country;

    @Column(name = "address_one",length = 50)
    private String addressOne;

    @Column(name = "address_two",length = 50)
    private String addressTwo;

    @Column(name = "city",length = 30)
    private String city;

    @Column(name = "state",length = 11)
    private int state;

    @Column(name = "zip",length = 11)
    private int zip;

    @Column(name = "phone_number",length = 20)
    private String phoneNumber;

    @Transient
    private MultipartFile profileImage;


    @Column(name = "created")
    private Date created;

    @Column(name = "modified")
    private Date modified;


//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<DigitalItems> digitalItemsList;

//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<UserDigitalItemSales> digitalItemSalesList;
//
//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<UserSocialNetwork> userSocialNetworkList;
//
//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<UserBadges> userBadgesList;
//
//
//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<UserFollowing> userFollowingList;
//
//    @OneToMany(mappedBy = "userProfileInfo", cascade = CascadeType.ALL)
//    private List<UserFollower> userFollowerList;



    public UserProfileInfo() {
    }
    public UserProfileInfo(String userName, String avatarPath, String companyName, String country, String addressOne, String addressTwo, String city, int state, int zip, String phoneNumber, Date created, Date modified) {
        this.userName = userName;

        this.avatarPath = avatarPath;
        this.companyName = companyName;
        this.country = country;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public MultipartFile getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(MultipartFile profileImage) {
        this.profileImage = profileImage;
    }


//    public List<DigitalItems> getDigitalItemsList() {
//        return digitalItemsList;
//    }
//
//    public void setDigitalItemsList(List<DigitalItems> digitalItemsList) {
//        this.digitalItemsList = digitalItemsList;
//    }

//    public List<UserDigitalItemSales> getDigitalItemSalesList() {
//        return digitalItemSalesList;
//    }
//
//    public void setDigitalItemSalesList(List<UserDigitalItemSales> digitalItemSalesList) {
//        this.digitalItemSalesList = digitalItemSalesList;
//    }
//
//
//    public List<UserSocialNetwork> getUserSocialNetworkList() {
//        return userSocialNetworkList;
//    }
//
//    public void setUserSocialNetworkList(List<UserSocialNetwork> userSocialNetworkList) {
//        this.userSocialNetworkList = userSocialNetworkList;
//    }
//
//    public List<UserFollowing> getUserFollowingList() {
//        return userFollowingList;
//    }
//
//    public void setUserFollowingList(List<UserFollowing> userFollowingList) {
//        this.userFollowingList = userFollowingList;
//    }
//
//    public List<UserFollower> getUserFollowerList() {
//        return userFollowerList;
//    }
//
//    public void setUserFollowerList(List<UserFollower> userFollowerList) {
//        this.userFollowerList = userFollowerList;
//    }
//
//    public List<UserBadges> getUserBadgesList() {
//        return userBadgesList;
//    }
//
//    public void setUserBadgesList(List<UserBadges> userBadgesList) {
//        this.userBadgesList = userBadgesList;
//    }



    @Override
    public String toString() {
        return "UserProfileInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", addressOne='" + addressOne + '\'' +
                ", addressTwo='" + addressTwo + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
