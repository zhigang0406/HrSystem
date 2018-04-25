package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Area;
import scorponok.base.entity.Hr_AreaExample;

public interface Hr_AreaMapper {
    long countByExample(Hr_AreaExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(Hr_Area record);

    int insertSelective(Hr_Area record);

    List<Hr_Area> selectByExampleWithRowbounds(Hr_AreaExample example, RowBounds rowBounds);

    List<Hr_Area> selectByExample(Hr_AreaExample example);

    Hr_Area selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") Hr_Area record, @Param("example") Hr_AreaExample example);

    int updateByExample(@Param("record") Hr_Area record, @Param("example") Hr_AreaExample example);

    int updateByPrimaryKeySelective(Hr_Area record);

    int updateByPrimaryKey(Hr_Area record);
}