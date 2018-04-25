package scorponok.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scorponok.base.entity.Hr_Salary_Template;
import scorponok.base.entity.Hr_Salary_TemplateExample;

public interface Hr_Salary_TemplateMapper {
    long countByExample(Hr_Salary_TemplateExample example);

    int deleteByPrimaryKey(Long templateId);

    int insert(Hr_Salary_Template record);

    int insertSelective(Hr_Salary_Template record);

    List<Hr_Salary_Template> selectByExampleWithRowbounds(Hr_Salary_TemplateExample example, RowBounds rowBounds);

    List<Hr_Salary_Template> selectByExample(Hr_Salary_TemplateExample example);

    Hr_Salary_Template selectByPrimaryKey(Long templateId);

    int updateByExampleSelective(@Param("record") Hr_Salary_Template record, @Param("example") Hr_Salary_TemplateExample example);

    int updateByExample(@Param("record") Hr_Salary_Template record, @Param("example") Hr_Salary_TemplateExample example);

    int updateByPrimaryKeySelective(Hr_Salary_Template record);

    int updateByPrimaryKey(Hr_Salary_Template record);
}