package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.hatarea.HatareaCacheManager;
import scorponok.base.entity.Hat_Area;
import scorponok.base.entity.Hat_AreaExample;
import scorponok.base.mapper.Hat_AreaMapper;
import scorponok.biz.dto.hatarea.Hat_AreaDTO;
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
public class Hat_AreaManager {

	@Resource
	private Hat_AreaMapper hatAreaMapper;
	@Resource
	private HatareaCacheManager hatareaCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hat_AreaDTO insert(Hat_Area hatArea) throws DaoException {
		Hat_AreaDTO xzUserDTO = new Hat_AreaDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hatArea,xzUserDTO);
		int insert = hatAreaMapper.insert(hatArea);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		hatareaCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hat_AreaDTO selectById(int id) {
		Hat_AreaDTO hatAreaDTO = hatareaCacheManager.get(String.valueOf(id));
		if (hatAreaDTO != null) {
			if (hatAreaDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return hatAreaDTO;
			}
		} else {
			hatAreaDTO = new Hat_AreaDTO();
			Hat_Area xz_user = hatAreaMapper.selectByPrimaryKey(hatAreaDTO.getId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, hatAreaDTO);
				hatareaCacheManager.put(hatAreaDTO);
				return hatAreaDTO;
			} else {
				hatAreaDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				hatareaCacheManager.put(hatAreaDTO);
				return null;
			}
		}
	}

	/**
	 * 按照父级查市区
	 *
	 * @param cityId
	 * @return
	 */
	public Hat_AreaDTO selectbytelNum(String cityId) {
		Hat_AreaDTO xzUserDTO = new Hat_AreaDTO();
		Hat_AreaExample example = new Hat_AreaExample();
		example.createCriteria().andAreaEqualTo(cityId);
		List<Hat_Area> xzUserList = hatAreaMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), xzUserDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return xzUserDTO;
		}
	}
}
