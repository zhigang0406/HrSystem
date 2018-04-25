package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hat_Area;
import scorponok.base.entity.Hat_AreaExample;

public interface Hat_AreaMapper {
    long countByExample(Hat_AreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hat_Area record);

    int insertSelective(Hat_Area record);

    List<Hat_Area> selectByExampleWithRowbounds(Hat_AreaExample example, RowBounds rowBounds);

    List<Hat_Area> selectByExample(Hat_AreaExample example);

    Hat_Area selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hat_Area record, @Param("example") Hat_AreaExample example);

    int updateByExample(@Param("record") Hat_Area record, @Param("example") Hat_AreaExample example);

    int updateByPrimaryKeySelective(Hat_Area record);

    int updateByPrimaryKey(Hat_Area record);
}