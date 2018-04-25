package scorponok.biz.dto.hatarea;

import scorponok.base.entity.Hat_Area;

public class Hat_AreaDTO extends Hat_Area {
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