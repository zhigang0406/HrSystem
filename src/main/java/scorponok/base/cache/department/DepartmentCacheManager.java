package scorponok.base.cache.department;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.department.Hr_DepartmentDTO;

@Component
public class DepartmentCacheManager extends CacheManager<Hr_DepartmentDTO> {

    @Override
    protected String getKey(Hr_DepartmentDTO value) {
        return "PRODUCTREPORT_"+value.getDepartmentId();
    }

    @Override
    protected String getKey(String id) {
        return "PRODUCTREPORT_" + id;
    }

    @Override
    protected Class<Hr_DepartmentDTO> getDTOClass() {
        return Hr_DepartmentDTO.class;
    }
}
