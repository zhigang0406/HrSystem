package scorponok.base.entity;

import java.util.Date;

public class Hr_Leave {
    private Long leaveId;

    private String leaveName;

    private Long leaveDay;

    private Long leaveDepartment;

    private Long leavePost;

    private String leaveShop;

    private String leaveReason;

    private Long leaveVerifierId;

    private Date leaveTime;

    private Long leaveTag;

    public Long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Long leaveId) {
        this.leaveId = leaveId;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName == null ? null : leaveName.trim();
    }

    public Long getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(Long leaveDay) {
        this.leaveDay = leaveDay;
    }

    public Long getLeaveDepartment() {
        return leaveDepartment;
    }

    public void setLeaveDepartment(Long leaveDepartment) {
        this.leaveDepartment = leaveDepartment;
    }

    public Long getLeavePost() {
        return leavePost;
    }

    public void setLeavePost(Long leavePost) {
        this.leavePost = leavePost;
    }

    public String getLeaveShop() {
        return leaveShop;
    }

    public void setLeaveShop(String leaveShop) {
        this.leaveShop = leaveShop == null ? null : leaveShop.trim();
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

    public Long getLeaveVerifierId() {
        return leaveVerifierId;
    }

    public void setLeaveVerifierId(Long leaveVerifierId) {
        this.leaveVerifierId = leaveVerifierId;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Long getLeaveTag() {
        return leaveTag;
    }

    public void setLeaveTag(Long leaveTag) {
        this.leaveTag = leaveTag;
    }
}