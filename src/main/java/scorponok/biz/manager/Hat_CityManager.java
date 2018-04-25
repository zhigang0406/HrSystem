package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.hatcity.HatcityCacheManager;
import scorponok.base.entity.Hat_City;
import scorponok.base.entity.Hat_CityExample;
import scorponok.base.mapper.Hat_CityMapper;
import scorponok.biz.dto.hatcity.Hat_CityDTO;
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
public class Hat_CityManager {

	@Resource
	private Hat_CityMapper cityMapper;
	@Resource
	private HatcityCacheManager hatcityCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hat_CityDTO insert(Hat_City hatCity) throws DaoException {
		Hat_CityDTO xzUserDTO = new Hat_CityDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hatCity,xzUserDTO);
		int insert = cityMapper.insert(hatCity);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		hatcityCacheManager.put(xzUserDTO);
		return xzUserDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hat_CityDTO selectById(int id) {
		Hat_CityDTO hatCityDTO = hatcityCacheManager.get(String.valueOf(id));
		if (hatCityDTO != null) {
			if (hatCityDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return hatCityDTO;
			}
		} else {
			hatCityDTO = new Hat_CityDTO();
			Hat_City xz_user = cityMapper.selectByPrimaryKey(hatCityDTO.getId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, hatCityDTO);
				hatcityCacheManager.put(hatCityDTO);
				return hatCityDTO;
			} else {
				hatCityDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				hatcityCacheManager.put(hatCityDTO);
				return null;
			}
		}
	}


	/**
	 * 按省份id 查询的
	 *
	 * @param provinceId
	 * @return
	 */
	public Hat_CityDTO selectbytelNum(String provinceId) {
		Hat_CityDTO xzUserDTO = new Hat_CityDTO();
		Hat_CityExample example = new Hat_CityExample();
		example.createCriteria().andCityEqualTo(provinceId);
		List<Hat_City> xzUserList = cityMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), xzUserDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return xzUserDTO;
		}
	}
}
