package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Account;
import scorponok.base.entity.Hr_AccountExample;

public interface Hr_AccountMapper {
    long countByExample(Hr_AccountExample example);

    int deleteByPrimaryKey(Long accountId);

    int insert(Hr_Account record);

    int insertSelective(Hr_Account record);

    List<Hr_Account> selectByExampleWithRowbounds(Hr_AccountExample example, RowBounds rowBounds);

    List<Hr_Account> selectByExample(Hr_AccountExample example);

    Hr_Account selectByPrimaryKey(Long accountId);

    int updateByExampleSelective(@Param("record") Hr_Account record, @Param("example") Hr_AccountExample example);

    int updateByExample(@Param("record") Hr_Account record, @Param("example") Hr_AccountExample example);

    int updateByPrimaryKeySelective(Hr_Account record);

    int updateByPrimaryKey(Hr_Account record);
}