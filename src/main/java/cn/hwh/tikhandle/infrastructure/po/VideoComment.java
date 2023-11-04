package cn.hwh.tikhandle.infrastructure.po;

import java.util.Date;

/**
 * 视频评论
 */
public class VideoComment {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 视频评论id
     */
    private String videoCommentId;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论时间
     */
    private Date createTime;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 所属视频id
     */
    private String videoId;

    /**
     * 点赞次数
     */
    private Integer likeCount;

    /**
     * 是否已删除
     */
    private Boolean isDelete;

    /**
     * 根评论id
     */
    private String rootCommentId;

    /**
     * 被回复评论id
     */
    private String replyCommentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoCommentId() {
        return videoCommentId;
    }

    public void setVideoCommentId(String videoCommentId) {
        this.videoCommentId = videoCommentId == null ? null : videoCommentId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getRootCommentId() {
        return rootCommentId;
    }

    public void setRootCommentId(String rootCommentId) {
        this.rootCommentId = rootCommentId == null ? null : rootCommentId.trim();
    }

    public String getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(String replyCommentId) {
        this.replyCommentId = replyCommentId == null ? null : replyCommentId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
