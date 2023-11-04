package cn.hwh.tikhandle.infrastructure.po;


/**
 * 用户表
 */
public class User {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户手机号
     */
    private String userPhoneNumber;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 头像地址
     */
    private String userAvatar;

    /**
     * TikTok ID
     */
    private String userTikId;

    /**
     * 用户简介
     */
    private String userDescription;

    /**
     * 粉丝数
     */
    private Integer userFansNumber;

    /**
     * 关注数
     */
    private Integer userAttentionNumber;

    /**
     * 获赞数
     */
    private Integer userBeLikedNumber;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber == null ? null : userPhoneNumber.trim();
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }


    public String getUserAvatar() {
        return userAvatar;
    }


    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }


    public String getUserTikId() {
        return userTikId;
    }


    public void setUserTikId(String userTikId) {
        this.userTikId = userTikId == null ? null : userTikId.trim();
    }


    public Integer getUserFansNumber() {
        return userFansNumber;
    }


    public void setUserFansNumber(Integer userFansNumber) {
        this.userFansNumber = userFansNumber;
    }


    public Integer getUserAttentionNumber() {
        return userAttentionNumber;
    }


    public void setUserAttentionNumber(Integer userAttentionNumber) {
        this.userAttentionNumber = userAttentionNumber;
    }


    public Integer getUserBeLikedNumber() {
        return userBeLikedNumber;
    }


    public void setUserBeLikedNumber(Integer userBeLikedNumber) {
        this.userBeLikedNumber = userBeLikedNumber;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }
}