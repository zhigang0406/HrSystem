package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hat_City;
import scorponok.base.entity.Hat_CityExample;

public interface Hat_CityMapper {
    long countByExample(Hat_CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hat_City record);

    int insertSelective(Hat_City record);

    List<Hat_City> selectByExampleWithRowbounds(Hat_CityExample example, RowBounds rowBounds);

    List<Hat_City> selectByExample(Hat_CityExample example);

    Hat_City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hat_City record, @Param("example") Hat_CityExample example);

    int updateByExample(@Param("record") Hat_City record, @Param("example") Hat_CityExample example);

    int updateByPrimaryKeySelective(Hat_City record);

    int updateByPrimaryKey(Hat_City record);
}