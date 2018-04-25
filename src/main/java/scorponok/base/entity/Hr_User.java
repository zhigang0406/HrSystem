package scorponok.base.entity;

import java.util.Date;

public class Hr_User {
    private Long userId;

    private String userName;

    private String userJobNumber;

    private Long userSex;

    private String userShopNumber;

    private Long userDepartment;

    private Long userPost;

    private String userPostGrade;

    private String userIdentityCard;

    private Date userEntryTime;

    private Date userRegularTime;

    private Long userYworkingAge;

    private Long userMworkingAge;

    private String userPhone;

    private String userProvince;

    private String userCity;

    private String userArea;

    private String userDetailedAddress;

    private String userSchool;

    private String userDiploma;

    private Long userState;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserJobNumber() {
        return userJobNumber;
    }

    public void setUserJobNumber(String userJobNumber) {
        this.userJobNumber = userJobNumber == null ? null : userJobNumber.trim();
    }

    public Long getUserSex() {
        return userSex;
    }

    public void setUserSex(Long userSex) {
        this.userSex = userSex;
    }

    public String getUserShopNumber() {
        return userShopNumber;
    }

    public void setUserShopNumber(String userShopNumber) {
        this.userShopNumber = userShopNumber == null ? null : userShopNumber.trim();
    }

    public Long getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(Long userDepartment) {
        this.userDepartment = userDepartment;
    }

    public Long getUserPost() {
        return userPost;
    }

    public void setUserPost(Long userPost) {
        this.userPost = userPost;
    }

    public String getUserPostGrade() {
        return userPostGrade;
    }

    public void setUserPostGrade(String userPostGrade) {
        this.userPostGrade = userPostGrade == null ? null : userPostGrade.trim();
    }

    public String getUserIdentityCard() {
        return userIdentityCard;
    }

    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard == null ? null : userIdentityCard.trim();
    }

    public Date getUserEntryTime() {
        return userEntryTime;
    }

    public void setUserEntryTime(Date userEntryTime) {
        this.userEntryTime = userEntryTime;
    }

    public Date getUserRegularTime() {
        return userRegularTime;
    }

    public void setUserRegularTime(Date userRegularTime) {
        this.userRegularTime = userRegularTime;
    }

    public Long getUserYworkingAge() {
        return userYworkingAge;
    }

    public void setUserYworkingAge(Long userYworkingAge) {
        this.userYworkingAge = userYworkingAge;
    }

    public Long getUserMworkingAge() {
        return userMworkingAge;
    }

    public void setUserMworkingAge(Long userMworkingAge) {
        this.userMworkingAge = userMworkingAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }

    public String getUserDetailedAddress() {
        return userDetailedAddress;
    }

    public void setUserDetailedAddress(String userDetailedAddress) {
        this.userDetailedAddress = userDetailedAddress == null ? null : userDetailedAddress.trim();
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public String getUserDiploma() {
        return userDiploma;
    }

    public void setUserDiploma(String userDiploma) {
        this.userDiploma = userDiploma == null ? null : userDiploma.trim();
    }

    public Long getUserState() {
        return userState;
    }

    public void setUserState(Long userState) {
        this.userState = userState;
    }
}