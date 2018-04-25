package scorponok.base.cache.operating_record;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.operating_record.Hr_Operating_recordDTO;

@Component
public class Operating_recordCacheManager extends CacheManager<Hr_Operating_recordDTO> {

    @Override
    protected String getKey(Hr_Operating_recordDTO value) {
        return "SLIDESHOW_" + value.getOperatingRecordId();
    }

    @Override
    protected String getKey(String id) {
        return "SLIDESHOW_"+id;
    }

    @Override
    protected Class<Hr_Operating_recordDTO> getDTOClass() {
        return Hr_Operating_recordDTO.class;
    }
}
