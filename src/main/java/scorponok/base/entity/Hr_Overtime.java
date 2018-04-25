package scorponok.base.entity;

import java.util.Date;

public class Hr_Overtime {
    private Long overtimeId;

    private String overtimeName;

    private Long overtimeDuration;

    private Long overtimeDepartment;

    private String overtimeShop;

    private Long overtimePost;

    private String overtimeReason;

    private Long overtimeVerifierId;

    private Date overtimeTime;

    private Long leaveTag;

    public Long getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(Long overtimeId) {
        this.overtimeId = overtimeId;
    }

    public String getOvertimeName() {
        return overtimeName;
    }

    public void setOvertimeName(String overtimeName) {
        this.overtimeName = overtimeName == null ? null : overtimeName.trim();
    }

    public Long getOvertimeDuration() {
        return overtimeDuration;
    }

    public void setOvertimeDuration(Long overtimeDuration) {
        this.overtimeDuration = overtimeDuration;
    }

    public Long getOvertimeDepartment() {
        return overtimeDepartment;
    }

    public void setOvertimeDepartment(Long overtimeDepartment) {
        this.overtimeDepartment = overtimeDepartment;
    }

    public String getOvertimeShop() {
        return overtimeShop;
    }

    public void setOvertimeShop(String overtimeShop) {
        this.overtimeShop = overtimeShop == null ? null : overtimeShop.trim();
    }

    public Long getOvertimePost() {
        return overtimePost;
    }

    public void setOvertimePost(Long overtimePost) {
        this.overtimePost = overtimePost;
    }

    public String getOvertimeReason() {
        return overtimeReason;
    }

    public void setOvertimeReason(String overtimeReason) {
        this.overtimeReason = overtimeReason == null ? null : overtimeReason.trim();
    }

    public Long getOvertimeVerifierId() {
        return overtimeVerifierId;
    }

    public void setOvertimeVerifierId(Long overtimeVerifierId) {
        this.overtimeVerifierId = overtimeVerifierId;
    }

    public Date getOvertimeTime() {
        return overtimeTime;
    }

    public void setOvertimeTime(Date overtimeTime) {
        this.overtimeTime = overtimeTime;
    }

    public Long getLeaveTag() {
        return leaveTag;
    }

    public void setLeaveTag(Long leaveTag) {
        this.leaveTag = leaveTag;
    }
}