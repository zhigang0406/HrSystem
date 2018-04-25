package scorponok.base.cache.salary;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.salary.Hr_SalaryDTO;

/**
 * Created by shensijie on 2018/3/23.
 */
@Component
public class SalaryCacheManager extends CacheManager<Hr_SalaryDTO> {
	@Override protected String getKey(Hr_SalaryDTO value) {
		return "PCACCOUNT_" + value.getSalaryId();
	}

	@Override protected String getKey(String id) {
		return "PCACCOUNT_" + id;
	}

	@Override protected Class<Hr_SalaryDTO> getDTOClass() {
		return Hr_SalaryDTO.class;
	}
}
