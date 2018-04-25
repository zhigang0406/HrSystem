package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Overtime;
import scorponok.base.entity.Hr_OvertimeExample;
import scorponok.biz.dto.overtime.Hr_OvertimeDTO;

public interface Hr_OvertimeMapper {
    long countByExample(Hr_OvertimeExample example);

    int deleteByPrimaryKey(Long overtimeId);

    int insert(Hr_OvertimeDTO record);

    int insertSelective(Hr_Overtime record);

    List<Hr_Overtime> selectByExampleWithRowbounds(Hr_OvertimeExample example, RowBounds rowBounds);

    List<Hr_Overtime> selectByExample(Hr_OvertimeExample example);

    Hr_Overtime selectByPrimaryKey(Long overtimeId);

    int updateByExampleSelective(@Param("record") Hr_Overtime record, @Param("example") Hr_OvertimeExample example);

    int updateByExample(@Param("record") Hr_Overtime record, @Param("example") Hr_OvertimeExample example);

    int updateByPrimaryKeySelective(Hr_Overtime record);

    int updateByPrimaryKey(Hr_Overtime record);
}