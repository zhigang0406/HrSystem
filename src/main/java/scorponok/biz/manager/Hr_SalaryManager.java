package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.salary.SalaryCacheManager;
import scorponok.base.entity.Hr_Salary;
import scorponok.base.entity.Hr_SalaryExample;
import scorponok.base.mapper.Hr_SalaryMapper;
import scorponok.biz.dto.salary.Hr_SalaryDTO;
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
public class Hr_SalaryManager {

	@Resource
	private Hr_SalaryMapper hrSalaryMapper;
	@Resource
	private SalaryCacheManager cacheManager;

	/**
	 * 按照用户id查找用户
	 */
	public Hr_SalaryDTO selectByTelNumandPsw(long userId) {
		Hr_SalaryDTO dto = new Hr_SalaryDTO();
		Hr_SalaryExample example = new Hr_SalaryExample();
		example.createCriteria().andUseridEqualTo(userId);
		List<Hr_Salary> list = hrSalaryMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(list.get(0), dto, BeanUtil.getNullPropertyNames(list.get(0)));
			return dto;
		}
	}

	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_SalaryDTO insert(Hr_Salary salary) throws DaoException {
		Hr_SalaryDTO dto = new Hr_SalaryDTO();
		Date now = new Date();
		BeanUtils.copyProperties(salary, dto);
		int insert = hrSalaryMapper.insertSelective(dto);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		cacheManager.put(dto);
		return dto;
	}


	/**
	 * 修改
	 *
	 * @param salary
	 * @return
	 * @throws DaoException
	 */
	public Hr_SalaryDTO update(Hr_Salary salary) throws DaoException {
		Hr_SalaryDTO dto = this.selectByTelNumandPsw(salary.getSalaryId().intValue());
		Date updatetime = new Date();
		salary.setSalaryId(dto.getSalaryId());
		int update = hrSalaryMapper.updateByPrimaryKeySelective(salary);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(salary, dto, BeanUtil.getNullPropertyNames(salary));
		cacheManager.put(dto);
		return dto;
	}

}
