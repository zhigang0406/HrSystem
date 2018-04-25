package scorponok.biz.dto.hatprovince;

import scorponok.base.entity.Hat_Province;

public class Hat_ProvinceDTO extends Hat_Province {
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