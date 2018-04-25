package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Brand;
import scorponok.base.entity.Hr_BrandExample;

public interface Hr_BrandMapper {
    long countByExample(Hr_BrandExample example);

    int deleteByPrimaryKey(Long brandId);

    int insert(Hr_Brand record);

    int insertSelective(Hr_Brand record);

    List<Hr_Brand> selectByExampleWithRowbounds(Hr_BrandExample example, RowBounds rowBounds);

    List<Hr_Brand> selectByExample(Hr_BrandExample example);

    Hr_Brand selectByPrimaryKey(Long brandId);

    int updateByExampleSelective(@Param("record") Hr_Brand record, @Param("example") Hr_BrandExample example);

    int updateByExample(@Param("record") Hr_Brand record, @Param("example") Hr_BrandExample example);

    int updateByPrimaryKeySelective(Hr_Brand record);

    int updateByPrimaryKey(Hr_Brand record);
}