package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.overtime.OvertimeCacheManager;
import scorponok.base.entity.Hr_Overtime;
import scorponok.base.entity.Hr_OvertimeExample;
import scorponok.base.mapper.Hr_OvertimeMapper;
import scorponok.biz.dto.overtime.Hr_OvertimeDTO;
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
public class Hr_OvertimeManager {

	@Resource
	private Hr_OvertimeMapper overtimeMapper;
	@Resource
	private OvertimeCacheManager manager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_OvertimeDTO insert(Hr_Overtime overtime) throws DaoException {
		Hr_OvertimeDTO overtimeDTO = new Hr_OvertimeDTO();
		Date now = new Date();
		BeanUtils.copyProperties(overtime,overtimeDTO);
		int insert = overtimeMapper.insert(overtimeDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		manager.put(overtimeDTO);
		return overtimeDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_OvertimeDTO selectById(long id) {
		Hr_OvertimeDTO overtimeDTO = manager.get(String.valueOf(id));
		if (overtimeDTO != null) {
			if (overtimeDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return overtimeDTO;
			}
		} else {
			overtimeDTO = new Hr_OvertimeDTO();
			Hr_Overtime hrOvertime = (Hr_Overtime) overtimeMapper.selectByPrimaryKey(overtimeDTO.getOvertimeId());
			if (hrOvertime != null) {
				BeanUtils.copyProperties(hrOvertime, overtimeDTO);
				manager.put(overtimeDTO);
				return overtimeDTO;
			} else {
				overtimeDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				manager.put(overtimeDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param overtime
	 * @return
	 * @throws DaoException
	 */
	public Hr_OvertimeDTO update(Hr_Overtime overtime) throws DaoException {
		Hr_OvertimeDTO hrOvertimeDTO = this.selectById(overtime.getOvertimeId().intValue());
		Date updatetime = new Date();
		overtime.setOvertimeId(hrOvertimeDTO.getOvertimeId());
		int update = overtimeMapper.updateByPrimaryKeySelective(overtime);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(overtime, hrOvertimeDTO, BeanUtil.getNullPropertyNames(overtime));
		manager.put(hrOvertimeDTO);
		return hrOvertimeDTO;
	}

	/**
	 * 条件查询
	 *
	 * @param
	 * @return
	 */
	public Hr_OvertimeDTO selectbyteOne(Hr_Overtime overtime) {
		Hr_OvertimeDTO overtimeDTO = new Hr_OvertimeDTO();
		Hr_OvertimeExample example = new Hr_OvertimeExample();
		Hr_OvertimeExample.Criteria criteria = example.createCriteria();
		List<Hr_Overtime> xzUserList = overtimeMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), overtimeDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return overtimeDTO;
		}
	}

}
