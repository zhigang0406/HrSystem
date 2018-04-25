package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.area.AreaCacheManager;
import scorponok.base.cache.leave.LeaveCacheManager;
import scorponok.base.entity.Hr_Area;
import scorponok.base.entity.Hr_AreaExample;
import scorponok.base.entity.Hr_Leave;
import scorponok.base.entity.Hr_LeaveExample;
import scorponok.base.mapper.Hr_AreaMapper;
import scorponok.base.mapper.Hr_LeaveMapper;
import scorponok.biz.dto.area.Hr_AreaDTO;
import scorponok.biz.dto.leave.Hr_LeaveDTO;
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
public class Hr_LeaveManager {

	@Resource
	private Hr_LeaveMapper hrLeaveMapper;
	@Resource
	private LeaveCacheManager leaveCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_LeaveDTO insert(Hr_Leave hrLeave) throws DaoException {
		Hr_LeaveDTO leaveDTO = new Hr_LeaveDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrLeave,leaveDTO);
		int insert = hrLeaveMapper.insert(hrLeave);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		leaveCacheManager.put(leaveDTO);
		return leaveDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_LeaveDTO selectById(long id) {
		Hr_LeaveDTO leaveDTO = leaveCacheManager.get(String.valueOf(id));
		if (leaveDTO != null) {
			if (leaveDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return leaveDTO;
			}
		} else {
			leaveDTO = new Hr_LeaveDTO();
			Hr_Leave xz_user = hrLeaveMapper.selectByPrimaryKey(leaveDTO.getLeaveId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user,leaveDTO);
				leaveCacheManager.put(leaveDTO);
				return leaveDTO;
			} else {
				leaveDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				leaveCacheManager.put(leaveDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param hrLeave
	 * @return
	 * @throws DaoException
	 */
	public Hr_LeaveDTO update(Hr_Leave hrLeave) throws DaoException {
		Hr_LeaveDTO xzUserDTO = this.selectById(hrLeave.getLeaveId().intValue());
		Date updatetime = new Date();
		hrLeave.setLeaveId(xzUserDTO.getLeaveId());
		int update = hrLeaveMapper.updateByPrimaryKeySelective(hrLeave);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(hrLeave, xzUserDTO, BeanUtil.getNullPropertyNames(hrLeave));
		leaveCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}


	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hr_LeaveDTO selectAll(){
		Hr_LeaveDTO leaveDTO = new Hr_LeaveDTO();
		Hr_LeaveExample example = new Hr_LeaveExample();
		List<Hr_Leave> hrUserList = hrLeaveMapper.selectByExample(example);
		if (hrUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hrUserList.get(0), leaveDTO, BeanUtil.getNullPropertyNames(hrUserList.get(0)));
			return leaveDTO;
		}
	}
}
