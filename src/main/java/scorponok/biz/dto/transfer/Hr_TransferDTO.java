package scorponok.biz.dto.transfer;

import scorponok.base.entity.Hr_Transfer;

public class Hr_TransferDTO extends Hr_Transfer {

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