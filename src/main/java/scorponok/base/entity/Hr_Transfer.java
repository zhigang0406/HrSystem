package scorponok.base.entity;

import java.util.Date;

public class Hr_Transfer {
    private Long transferId;

    private String transferName;

    private Long transferFdepartment;

    private Long transferFpost;

    private String transferFshop;

    private Long transferLdepartment;

    private Long transferLpost;

    private String transferLshop;

    private String transferReason;

    private String transferOperator;

    private Long operatorDepartment;

    private Long operatorPost;

    private Date transferTime;

    public Long getTransferId() {
        return transferId;
    }

    public void setTransferId(Long transferId) {
        this.transferId = transferId;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName == null ? null : transferName.trim();
    }

    public Long getTransferFdepartment() {
        return transferFdepartment;
    }

    public void setTransferFdepartment(Long transferFdepartment) {
        this.transferFdepartment = transferFdepartment;
    }

    public Long getTransferFpost() {
        return transferFpost;
    }

    public void setTransferFpost(Long transferFpost) {
        this.transferFpost = transferFpost;
    }

    public String getTransferFshop() {
        return transferFshop;
    }

    public void setTransferFshop(String transferFshop) {
        this.transferFshop = transferFshop == null ? null : transferFshop.trim();
    }

    public Long getTransferLdepartment() {
        return transferLdepartment;
    }

    public void setTransferLdepartment(Long transferLdepartment) {
        this.transferLdepartment = transferLdepartment;
    }

    public Long getTransferLpost() {
        return transferLpost;
    }

    public void setTransferLpost(Long transferLpost) {
        this.transferLpost = transferLpost;
    }

    public String getTransferLshop() {
        return transferLshop;
    }

    public void setTransferLshop(String transferLshop) {
        this.transferLshop = transferLshop == null ? null : transferLshop.trim();
    }

    public String getTransferReason() {
        return transferReason;
    }

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    public String getTransferOperator() {
        return transferOperator;
    }

    public void setTransferOperator(String transferOperator) {
        this.transferOperator = transferOperator == null ? null : transferOperator.trim();
    }

    public Long getOperatorDepartment() {
        return operatorDepartment;
    }

    public void setOperatorDepartment(Long operatorDepartment) {
        this.operatorDepartment = operatorDepartment;
    }

    public Long getOperatorPost() {
        return operatorPost;
    }

    public void setOperatorPost(Long operatorPost) {
        this.operatorPost = operatorPost;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }
}