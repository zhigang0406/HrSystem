package scorponok.biz.dto.leave;

import scorponok.base.entity.Hr_Leave;

public class Hr_LeaveDTO extends Hr_Leave {

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