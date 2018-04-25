package scorponok.base.cache.post;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.post.Hr_PostDTO;

@Component
public class PostCacheManager extends CacheManager<Hr_PostDTO> {

    @Override
    protected String getKey(Hr_PostDTO value) {
        return "SLIDESHOW_" + value.getPostId();
    }

    @Override
    protected String getKey(String id) {
        return "SLIDESHOW_"+id;
    }

    @Override
    protected Class<Hr_PostDTO> getDTOClass() {
        return Hr_PostDTO.class;
    }
}
