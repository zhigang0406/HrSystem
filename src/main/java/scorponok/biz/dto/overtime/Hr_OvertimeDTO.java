package scorponok.biz.dto.overtime;

import scorponok.base.entity.Hr_Overtime;

public class Hr_OvertimeDTO extends Hr_Overtime {
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