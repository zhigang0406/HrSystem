package scorponok.base.cache.transfer;

import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.transfer.Hr_TransferDTO;

public class TransferCacheManager extends CacheManager<Hr_TransferDTO> {

    @Override
    protected String getKey(Hr_TransferDTO value) {
        return null;
    }

    @Override
    protected String getKey(String id) {
        return null;
    }

    @Override
    protected Class<Hr_TransferDTO> getDTOClass() {
        return null;
    }
}