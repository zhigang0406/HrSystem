package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.user.UserCacheManager;
import scorponok.base.entity.Hr_User;
import scorponok.base.entity.Hr_UserExample;
import scorponok.base.mapper.Hr_UserMapper;
import scorponok.biz.dto.user.Hr_UserDTO;
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
public class Hr_UserManager {

	@Resource
	private Hr_UserMapper hrUserMapper;
	@Resource
	private UserCacheManager userCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_UserDTO insert(Hr_User hrUser) throws DaoException {
		Hr_UserDTO xzUserDTO = new Hr_UserDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrUser,xzUserDTO);
		int insert = hrUserMapper.insert(hrUser);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		userCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_UserDTO selectById(long id) {
		Hr_UserDTO xzUserDTO = userCacheManager.get(String.valueOf(id));
		if (xzUserDTO != null) {
			if (xzUserDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return xzUserDTO;
			}
		} else {
			xzUserDTO = new Hr_UserDTO();
			Hr_User xz_user = hrUserMapper.selectByPrimaryKey(xzUserDTO.getUserId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, xzUserDTO);
				userCacheManager.put(xzUserDTO);
				return xzUserDTO;
			} else {
				xzUserDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				userCacheManager.put(xzUserDTO);
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
	public Hr_UserDTO update(Hr_User hrUser) throws DaoException {
		Hr_UserDTO xzUserDTO = this.selectById(hrUser.getUserId().longValue());
		Date updatetime = new Date();
		xzUserDTO.setUserId(hrUser.getUserId());
		int update = hrUserMapper.updateByPrimaryKeySelective(hrUser);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(hrUser, xzUserDTO, BeanUtil.getNullPropertyNames(hrUser));
		userCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}

	/**
	 * 按照手机号查询
	 *
	 * @param user_phone
	 * @return
	 */
	public Hr_UserDTO selectbytelNum(String user_phone) {
		Hr_UserDTO xzUserDTO = new Hr_UserDTO();
		Hr_UserExample example = new Hr_UserExample();
		example.createCriteria().andUserPhoneEqualTo(user_phone);
		List<Hr_User> xzUserList = hrUserMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), xzUserDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return xzUserDTO;
		}
	}

	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hr_UserDTO selectAll(){
		Hr_UserDTO xzUserDTO = new Hr_UserDTO();
		Hr_UserExample example = new Hr_UserExample();
		List<Hr_User> hrUserList = hrUserMapper.selectByExample(example);
		if (hrUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hrUserList.get(0), xzUserDTO, BeanUtil.getNullPropertyNames(hrUserList.get(0)));
			return xzUserDTO;
		}
	}
}
