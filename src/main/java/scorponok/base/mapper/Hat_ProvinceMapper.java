package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hat_Province;
import scorponok.base.entity.Hat_ProvinceExample;

public interface Hat_ProvinceMapper {
    long countByExample(Hat_ProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hat_Province record);

    int insertSelective(Hat_Province record);

    List<Hat_Province> selectByExampleWithRowbounds(Hat_ProvinceExample example, RowBounds rowBounds);

    List<Hat_Province> selectByExample(Hat_ProvinceExample example);

    Hat_Province selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hat_Province record, @Param("example") Hat_ProvinceExample example);

    int updateByExample(@Param("record") Hat_Province record, @Param("example") Hat_ProvinceExample example);

    int updateByPrimaryKeySelective(Hat_Province record);

    int updateByPrimaryKey(Hat_Province record);
}