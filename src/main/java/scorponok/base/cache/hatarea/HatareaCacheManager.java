package scorponok.base.cache.hatarea;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.hatarea.Hat_AreaDTO;

public class HatareaCacheManager extends CacheManager<Hat_AreaDTO> {

    @Override
    protected String getKey(Hat_AreaDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hat_AreaDTO> getDTOClass() {
        return null;
    }
}