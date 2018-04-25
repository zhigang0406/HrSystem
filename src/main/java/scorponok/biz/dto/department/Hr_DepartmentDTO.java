package scorponok.biz.dto.department;

import scorponok.base.entity.Hr_Department;

public class Hr_DepartmentDTO extends Hr_Department {
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