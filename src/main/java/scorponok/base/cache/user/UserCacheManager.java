package scorponok.base.cache.user;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.user.Hr_UserDTO;

@Component
public class UserCacheManager extends CacheManager<Hr_UserDTO> {

    @Override
    protected String getKey(Hr_UserDTO value) {
        return "SLIDESHOW_" + value.getUserId();
    }

    @Override
    protected String getKey(String id) {
        return "SLIDESHOW_"+id;
    }

    @Override
    protected Class<Hr_UserDTO> getDTOClass() {
        return Hr_UserDTO.class;
    }
}
