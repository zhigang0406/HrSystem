package scorponok.biz.dto.operating_record;

import scorponok.base.entity.Hr_Operating_record;

public class Hr_Operating_recordDTO extends Hr_Operating_record {
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