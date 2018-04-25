package scorponok.biz.dto.hatcity;

import scorponok.base.entity.Hat_City;

public class Hat_CityDTO extends Hat_City {
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