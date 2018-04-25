package scorponok.biz.dto.area;


import scorponok.base.entity.Hr_Area;

public class Hr_AreaDTO extends Hr_Area {
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