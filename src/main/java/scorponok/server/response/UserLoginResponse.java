package scorponok.server.response;

import java.util.Date;

public class UserLoginResponse extends BaseResponse{
    private long id; //返回用户id
    private Date loginTime; //登陆时间
    private Date updateTime; //修改时间

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
