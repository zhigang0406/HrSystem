package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Leave;
import scorponok.base.entity.Hr_LeaveExample;

public interface Hr_LeaveMapper {
    long countByExample(Hr_LeaveExample example);

    int deleteByPrimaryKey(Long leaveId);

    int insert(Hr_Leave record);

    int insertSelective(Hr_Leave record);

    List<Hr_Leave> selectByExampleWithRowbounds(Hr_LeaveExample example, RowBounds rowBounds);

    List<Hr_Leave> selectByExample(Hr_LeaveExample example);

    Hr_Leave selectByPrimaryKey(Long leaveId);

    int updateByExampleSelective(@Param("record") Hr_Leave record, @Param("example") Hr_LeaveExample example);

    int updateByExample(@Param("record") Hr_Leave record, @Param("example") Hr_LeaveExample example);

    int updateByPrimaryKeySelective(Hr_Leave record);

    int updateByPrimaryKey(Hr_Leave record);
}