package scorponok.base.cache.leave;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.leave.Hr_LeaveDTO;

public class LeaveCacheManager extends CacheManager<Hr_LeaveDTO> {
    @Override
    protected String getKey(Hr_LeaveDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hr_LeaveDTO> getDTOClass() {
        return null;
    }
}