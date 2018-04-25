package scorponok.base.cache.shop;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.shop.Hr_ShopDTO;

@Component
public class ShopCacheManager extends CacheManager<Hr_ShopDTO> {

    @Override
    protected String getKey(Hr_ShopDTO value) {
        return "SLIDESHOW_" + value.getShopId();
    }

    @Override
    protected String getKey(String id) {
        return "SLIDESHOW_"+id;
    }

    @Override
    protected Class<Hr_ShopDTO> getDTOClass() {
        return Hr_ShopDTO.class;
    }
}
