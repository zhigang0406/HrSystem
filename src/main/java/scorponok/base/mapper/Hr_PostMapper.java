package scorponok.base.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Post;
import scorponok.base.entity.Hr_PostExample;
import scorponok.biz.dto.post.Hr_PostDTO;

import java.util.List;

public interface Hr_PostMapper {
    long countByExample(Hr_PostExample example);

    int deleteByPrimaryKey(Long postId);

    int insert(Hr_PostDTO record);

    int insertSelective(Hr_Post record);

    List<Hr_Post> selectByExampleWithRowbounds(Hr_PostExample example, RowBounds rowBounds);

    List<Hr_Post> selectByExample(Hr_PostExample example);

    Hr_Post selectByPrimaryKey(Long postId);

    int updateByExampleSelective(@Param("record") Hr_Post record, @Param("example") Hr_PostExample example);

    int updateByExample(@Param("record") Hr_Post record, @Param("example") Hr_PostExample example);

    int updateByPrimaryKeySelective(Hr_Post record);

    int updateByPrimaryKey(Hr_Post record);
}