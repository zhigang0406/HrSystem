package scorponok.base.cache.salarytemplate;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.salarytemplate.Hr_SalaryTemplateDTO;

public class SalaryTemplateCacheManager extends CacheManager<Hr_SalaryTemplateDTO> {

    @Override
    protected String getKey(Hr_SalaryTemplateDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hr_SalaryTemplateDTO> getDTOClass() {
        return null;
    }
}