package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_User;
import scorponok.base.entity.Hr_UserExample;

public interface Hr_UserMapper {
    long countByExample(Hr_UserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(Hr_User record);

    int insertSelective(Hr_User record);

    List<Hr_User> selectByExampleWithRowbounds(Hr_UserExample example, RowBounds rowBounds);

    List<Hr_User> selectByExample(Hr_UserExample example);

    Hr_User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") Hr_User record, @Param("example") Hr_UserExample example);

    int updateByExample(@Param("record") Hr_User record, @Param("example") Hr_UserExample example);

    int updateByPrimaryKeySelective(Hr_User record);

    int updateByPrimaryKey(Hr_User record);
}