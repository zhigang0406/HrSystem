package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.department.DepartmentCacheManager;
import scorponok.base.entity.Hr_Department;
import scorponok.base.entity.Hr_DepartmentExample;
import scorponok.base.mapper.Hr_DepartmentMapper;
import scorponok.biz.dto.department.Hr_DepartmentDTO;
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
public class Hr_DepartmentManager {

	@Resource
	private Hr_DepartmentMapper hrDepartmentMapper;
	@Resource
	private DepartmentCacheManager departmentCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_DepartmentDTO insert(Hr_Department department) throws DaoException {
		Hr_DepartmentDTO departmentDTO = new Hr_DepartmentDTO();
		Date now = new Date();
		BeanUtils.copyProperties(department,departmentDTO);
		int insert = hrDepartmentMapper.insert(departmentDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		departmentCacheManager.put(departmentDTO);
		return departmentDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_DepartmentDTO selectById(long id) {
		Hr_DepartmentDTO departmentDTO = departmentCacheManager.get(String.valueOf(id));
		if (departmentDTO != null) {
			if (departmentDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return departmentDTO;
			}
		} else {
			departmentDTO = new Hr_DepartmentDTO();
			Hr_Department xz_user = hrDepartmentMapper.selectByPrimaryKey(departmentDTO.getDepartmentId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user,departmentDTO);
				departmentCacheManager.put(departmentDTO);
				return departmentDTO;
			} else {
				departmentDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				departmentCacheManager.put(departmentDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_DepartmentDTO update(Hr_Department department) throws DaoException {
		Hr_DepartmentDTO xzUserDTO = this.selectById(department.getDepartmentId().intValue());
		Date updatetime = new Date();
		department.setDepartmentId(xzUserDTO.getDepartmentId());
		int update = hrDepartmentMapper.updateByPrimaryKeySelective(department);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(department, xzUserDTO, BeanUtil.getNullPropertyNames(department));
		departmentCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}

	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hr_DepartmentDTO selectAll(){
		Hr_DepartmentDTO departmentDTO = new Hr_DepartmentDTO();
		Hr_DepartmentExample example = new Hr_DepartmentExample();
		List<Hr_Department> hrUserList = hrDepartmentMapper.selectByExample(example);
		if (hrUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hrUserList.get(0), departmentDTO, BeanUtil.getNullPropertyNames(hrUserList.get(0)));
			return departmentDTO;
		}
	}
}
