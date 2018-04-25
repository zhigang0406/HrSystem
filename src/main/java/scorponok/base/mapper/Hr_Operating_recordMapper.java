package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Operating_record;
import scorponok.base.entity.Hr_Operating_recordExample;

public interface Hr_Operating_recordMapper {
    long countByExample(Hr_Operating_recordExample example);

    int deleteByPrimaryKey(Long operatingRecordId);

    int insert(Hr_Operating_record record);

    int insertSelective(Hr_Operating_record record);

    List<Hr_Operating_record> selectByExampleWithRowbounds(Hr_Operating_recordExample example, RowBounds rowBounds);

    List<Hr_Operating_record> selectByExample(Hr_Operating_recordExample example);

    Hr_Operating_record selectByPrimaryKey(Long operatingRecordId);

    int updateByExampleSelective(@Param("record") Hr_Operating_record record, @Param("example") Hr_Operating_recordExample example);

    int updateByExample(@Param("record") Hr_Operating_record record, @Param("example") Hr_Operating_recordExample example);

    int updateByPrimaryKeySelective(Hr_Operating_record record);

    int updateByPrimaryKey(Hr_Operating_record record);
}