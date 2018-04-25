package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Salary;
import scorponok.base.entity.Hr_SalaryExample;

public interface Hr_SalaryMapper {
    long countByExample(Hr_SalaryExample example);

    int deleteByPrimaryKey(Long salaryId);

    int insert(Hr_Salary record);

    int insertSelective(Hr_Salary record);

    List<Hr_Salary> selectByExampleWithRowbounds(Hr_SalaryExample example, RowBounds rowBounds);

    List<Hr_Salary> selectByExample(Hr_SalaryExample example);

    Hr_Salary selectByPrimaryKey(Long salaryId);

    int updateByExampleSelective(@Param("record") Hr_Salary record, @Param("example") Hr_SalaryExample example);

    int updateByExample(@Param("record") Hr_Salary record, @Param("example") Hr_SalaryExample example);

    int updateByPrimaryKeySelective(Hr_Salary record);

    int updateByPrimaryKey(Hr_Salary record);
}