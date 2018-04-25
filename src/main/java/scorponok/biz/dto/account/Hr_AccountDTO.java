package scorponok.biz.dto.account;

import scorponok.base.entity.Hr_Account;

public class Hr_AccountDTO extends Hr_Account {
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