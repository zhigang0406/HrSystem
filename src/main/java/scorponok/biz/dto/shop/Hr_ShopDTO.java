package scorponok.biz.dto.shop;

import scorponok.base.entity.Hr_Shop;

public class Hr_ShopDTO extends Hr_Shop {
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