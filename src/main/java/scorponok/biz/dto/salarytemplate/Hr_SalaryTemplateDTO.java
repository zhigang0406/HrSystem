package scorponok.biz.dto.salarytemplate;

import scorponok.base.entity.Hr_Salary_Template;

public class Hr_SalaryTemplateDTO extends Hr_Salary_Template {
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