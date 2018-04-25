package scorponok.base.cache.brand;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.brand.Hr_BrandDTO;

/**
 * Created by shensijie on 2018/3/23.
 */
@Component
public class BrandCacheManager extends CacheManager<Hr_BrandDTO> {
	@Override protected String getKey(Hr_BrandDTO value) {
		return "PCACCOUNT_" + value.getBrandId();
	}

	@Override protected String getKey(String id) {
		return "PCACCOUNT_" + id;
	}

	@Override protected Class<Hr_BrandDTO> getDTOClass() {
		return Hr_BrandDTO.class;
	}
}
