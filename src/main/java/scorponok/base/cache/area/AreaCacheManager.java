package scorponok.base.cache.area;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.area.Hr_AreaDTO;

@Component
public class AreaCacheManager extends CacheManager<Hr_AreaDTO> {

	@Override
	protected String getKey(Hr_AreaDTO value) {
		return "ACCOUNT_"+ value.getAreaId();
	}

	@Override
	protected String getKey(String id) {
		return "ACCOUNT_"+ id;
	}

	@Override
	protected Class<Hr_AreaDTO> getDTOClass() {
		return Hr_AreaDTO.class;
	}
	
	
}
