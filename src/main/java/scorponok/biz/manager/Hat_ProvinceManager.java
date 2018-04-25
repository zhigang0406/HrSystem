package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.hatarea.HatareaCacheManager;
import scorponok.base.cache.hatprovince.HatprovinceCacheManager;
import scorponok.base.entity.Hat_Area;
import scorponok.base.entity.Hat_AreaExample;
import scorponok.base.entity.Hat_Province;
import scorponok.base.entity.Hat_ProvinceExample;
import scorponok.base.mapper.Hat_AreaMapper;
import scorponok.base.mapper.Hat_ProvinceMapper;
import scorponok.biz.dto.hatarea.Hat_AreaDTO;
import scorponok.biz.dto.hatprovince.Hat_ProvinceDTO;
import scorponok.common.constant.CaCheStatus;
import scorponok.common.exception.DaoException;
import scorponok.common.exception.ErrorConstant;
import scorponok.common.utils.BeanUtil;

import javax.annotation.Resource;
import java.util.*;
/**
 * Created by shensijie on 2018/3/21.
 */
@Service
public class Hat_ProvinceManager {

	@Resource
	private Hat_ProvinceMapper hatProvinceMapper;
	@Resource
	private HatprovinceCacheManager hatareaCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hat_ProvinceDTO insert(Hat_Province hatProvince) throws DaoException {
		Hat_ProvinceDTO hatProvinceDTO = new Hat_ProvinceDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hatProvince,hatProvinceDTO);
		int insert = hatProvinceMapper.insert(hatProvince);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		hatareaCacheManager.put(hatProvinceDTO);
		return hatProvinceDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hat_ProvinceDTO selectById(int id) {
		Hat_ProvinceDTO xzUserDTO = hatareaCacheManager.get(String.valueOf(id));
		if (xzUserDTO != null) {
			if (xzUserDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return xzUserDTO;
			}
		} else {
			xzUserDTO = new Hat_ProvinceDTO();
			Hat_Province hatProvince = hatProvinceMapper.selectByPrimaryKey(xzUserDTO.getId());
			if (hatProvince != null) {
				BeanUtils.copyProperties(hatProvince, xzUserDTO);
				hatareaCacheManager.put(xzUserDTO);
				return xzUserDTO;
			} else {
				xzUserDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				hatareaCacheManager.put(xzUserDTO);
				return null;
			}
		}
	}

	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hat_ProvinceDTO selectAll(){
		Hat_ProvinceDTO hatProvinceDTO = new Hat_ProvinceDTO();
		Hat_ProvinceExample example = new Hat_ProvinceExample();
		List<Hat_Province> hatProvinceList = hatProvinceMapper.selectByExample(example);
		if (hatProvinceList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hatProvinceList.get(0), hatProvinceDTO, BeanUtil.getNullPropertyNames(hatProvinceList.get(0)));
			return hatProvinceDTO;
		}
	}
}
