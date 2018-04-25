package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Shop;
import scorponok.base.entity.Hr_ShopExample;

public interface Hr_ShopMapper {
    long countByExample(Hr_ShopExample example);

    int deleteByPrimaryKey(Long shopId);

    int insert(Hr_Shop record);

    int insertSelective(Hr_Shop record);

    List<Hr_Shop> selectByExampleWithRowbounds(Hr_ShopExample example, RowBounds rowBounds);

    List<Hr_Shop> selectByExample(Hr_ShopExample example);

    Hr_Shop selectByPrimaryKey(Long shopId);

    int updateByExampleSelective(@Param("record") Hr_Shop record, @Param("example") Hr_ShopExample example);

    int updateByExample(@Param("record") Hr_Shop record, @Param("example") Hr_ShopExample example);

    int updateByPrimaryKeySelective(Hr_Shop record);

    int updateByPrimaryKey(Hr_Shop record);
}