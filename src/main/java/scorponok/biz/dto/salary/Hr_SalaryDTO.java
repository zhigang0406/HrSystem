package scorponok.biz.dto.salary;

import scorponok.base.entity.Hr_Salary;

public class Hr_SalaryDTO extends Hr_Salary {
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