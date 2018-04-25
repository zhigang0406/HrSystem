package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Transfer;
import scorponok.base.entity.Hr_TransferExample;

public interface Hr_TransferMapper {
    long countByExample(Hr_TransferExample example);

    int deleteByPrimaryKey(Long transferId);

    int insert(Hr_Transfer record);

    int insertSelective(Hr_Transfer record);

    List<Hr_Transfer> selectByExampleWithRowbounds(Hr_TransferExample example, RowBounds rowBounds);

    List<Hr_Transfer> selectByExample(Hr_TransferExample example);

    Hr_Transfer selectByPrimaryKey(Long transferId);

    int updateByExampleSelective(@Param("record") Hr_Transfer record, @Param("example") Hr_TransferExample example);

    int updateByExample(@Param("record") Hr_Transfer record, @Param("example") Hr_TransferExample example);

    int updateByPrimaryKeySelective(Hr_Transfer record);

    int updateByPrimaryKey(Hr_Transfer record);
}