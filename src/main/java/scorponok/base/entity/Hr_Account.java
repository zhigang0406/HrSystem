package scorponok.base.entity;

import java.util.Date;

public class Hr_Account {
    private Long accountId;

    private String accountNumber;

    private String accountPassword;

    private Date accountLoginTime;

    private Long accountStatus;

    private Long accountUserid;

    private Date accountUpdatatime;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public Date getAccountLoginTime() {
        return accountLoginTime;
    }

    public void setAccountLoginTime(Date accountLoginTime) {
        this.accountLoginTime = accountLoginTime;
    }

    public Long getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Long accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Long getAccountUserid() {
        return accountUserid;
    }

    public void setAccountUserid(Long accountUserid) {
        this.accountUserid = accountUserid;
    }

    public Date getAccountUpdatatime() {
        return accountUpdatatime;
    }

    public void setAccountUpdatatime(Date accountUpdatatime) {
        this.accountUpdatatime = accountUpdatatime;
    }
}