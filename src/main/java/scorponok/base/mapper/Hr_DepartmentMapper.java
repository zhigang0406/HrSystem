package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Department;
import scorponok.base.entity.Hr_DepartmentExample;

public interface Hr_DepartmentMapper {
    long countByExample(Hr_DepartmentExample example);

    int deleteByPrimaryKey(Long departmentId);

    int insert(Hr_Department record);

    int insertSelective(Hr_Department record);

    List<Hr_Department> selectByExampleWithRowbounds(Hr_DepartmentExample example, RowBounds rowBounds);

    List<Hr_Department> selectByExample(Hr_DepartmentExample example);

    Hr_Department selectByPrimaryKey(Long departmentId);

    int updateByExampleSelective(@Param("record") Hr_Department record, @Param("example") Hr_DepartmentExample example);

    int updateByExample(@Param("record") Hr_Department record, @Param("example") Hr_DepartmentExample example);

    int updateByPrimaryKeySelective(Hr_Department record);

    int updateByPrimaryKey(Hr_Department record);
}