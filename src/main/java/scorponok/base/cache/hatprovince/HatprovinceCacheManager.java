package scorponok.base.cache.hatprovince;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.hatprovince.Hat_ProvinceDTO;

public class HatprovinceCacheManager extends CacheManager<Hat_ProvinceDTO> {

    @Override
    protected String getKey(Hat_ProvinceDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hat_ProvinceDTO> getDTOClass() {
        return null;
    }
}