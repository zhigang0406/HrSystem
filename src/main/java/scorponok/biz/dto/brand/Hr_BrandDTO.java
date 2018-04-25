package scorponok.biz.dto.brand;

import scorponok.base.entity.Hr_Brand;

public class Hr_BrandDTO extends Hr_Brand {
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