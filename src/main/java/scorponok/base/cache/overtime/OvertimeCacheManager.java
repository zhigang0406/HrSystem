package scorponok.base.cache.overtime;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.overtime.Hr_OvertimeDTO;

public class OvertimeCacheManager extends CacheManager<Hr_OvertimeDTO> {

    @Override
    protected String getKey(Hr_OvertimeDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hr_OvertimeDTO> getDTOClass() {
        return null;
    }
}