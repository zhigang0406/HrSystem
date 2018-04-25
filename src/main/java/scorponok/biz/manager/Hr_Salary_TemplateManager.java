package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.salarytemplate.SalaryTemplateCacheManager;
import scorponok.base.entity.Hr_Salary_Template;
import scorponok.base.mapper.Hr_Salary_TemplateMapper;
import scorponok.biz.dto.salarytemplate.Hr_SalaryTemplateDTO;
import scorponok.common.constant.CaCheStatus;
import scorponok.common.exception.DaoException;
import scorponok.common.exception.ErrorConstant;
import scorponok.common.utils.BeanUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by shensijie on 2018/3/21.
 */
@Service
public class Hr_Salary_TemplateManager {

	@Resource
	private Hr_Salary_TemplateMapper hrSalaryTemplateMapper;
	@Resource
	private SalaryTemplateCacheManager accountCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_SalaryTemplateDTO insert(Hr_Salary_Template salaryTemplate) throws DaoException {
		Hr_SalaryTemplateDTO hrSalaryTemplateDTO = new Hr_SalaryTemplateDTO();
		Date now = new Date();
		BeanUtils.copyProperties(salaryTemplate, hrSalaryTemplateDTO);
		int insert = hrSalaryTemplateMapper.insertSelective(hrSalaryTemplateDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		accountCacheManager.put(hrSalaryTemplateDTO);
		return hrSalaryTemplateDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_SalaryTemplateDTO selectById(long id) {
		Hr_SalaryTemplateDTO salaryTemplateDTO = accountCacheManager.get(String.valueOf(id));
		if (salaryTemplateDTO != null) {
			if (salaryTemplateDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return salaryTemplateDTO;
			}
		} else {
			salaryTemplateDTO = new Hr_SalaryTemplateDTO();
			Hr_Salary_Template hrSalaryTemplate = hrSalaryTemplateMapper.selectByPrimaryKey(salaryTemplateDTO.getTemplateId());
			if (hrSalaryTemplate != null) {
				BeanUtils.copyProperties(hrSalaryTemplate, salaryTemplateDTO);
				accountCacheManager.put(salaryTemplateDTO);
				return salaryTemplateDTO;
			} else {
				salaryTemplateDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				accountCacheManager.put(salaryTemplateDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param template
	 * @return
	 * @throws DaoException
	 */
	public Hr_SalaryTemplateDTO update(Hr_Salary_Template template) throws DaoException {
		Hr_SalaryTemplateDTO accountDTO = this.selectById(template.getTemplateId().longValue());
		Date updatetime = new Date();
		template.setTemplateId(accountDTO.getTemplateId());
		int update = hrSalaryTemplateMapper.updateByPrimaryKeySelective(template);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(template, accountDTO, BeanUtil.getNullPropertyNames(template));
		accountCacheManager.put(accountDTO);
		return accountDTO;
	}


}
