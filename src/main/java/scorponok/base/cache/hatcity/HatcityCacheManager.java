package scorponok.base.cache.hatcity;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.hatcity.Hat_CityDTO;

public class HatcityCacheManager extends CacheManager<Hat_CityDTO> {


    @Override
    protected String getKey(Hat_CityDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hat_CityDTO> getDTOClass() {
        return null;
    }
}