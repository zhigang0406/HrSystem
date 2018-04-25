package scorponok.biz.dto.user;

import scorponok.base.entity.Hr_User;

public class Hr_UserDTO extends Hr_User {

    private Integer cacheStatus;

    public void setCacheStatus(Integer cacheStatus) {
        this.cacheStatus = cacheStatus;
    }

    public int getCacheStatus() {
        return cacheStatus;
    }

    public void setCacheStatus(int cacheStatus) {
        this.cacheStatus = cacheStatus;
    }
}