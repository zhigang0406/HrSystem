package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.area.AreaCacheManager;
import scorponok.base.entity.Hr_Area;
import scorponok.base.entity.Hr_AreaExample;
import scorponok.base.mapper.Hr_AreaMapper;
import scorponok.biz.dto.area.Hr_AreaDTO;
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
public class Hr_AreaManager {

	@Resource
	private Hr_AreaMapper hrAreaMapper;
	@Resource
	private AreaCacheManager areaCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_AreaDTO insert(Hr_Area hrArea) throws DaoException {
		Hr_AreaDTO hrAreaDTO = new Hr_AreaDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrArea,hrAreaDTO);
		int insert = hrAreaMapper.insert(hrAreaDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		areaCacheManager.put(hrAreaDTO);
		return hrAreaDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_AreaDTO selectById(long id) {
		Hr_AreaDTO hrAreaDTO = areaCacheManager.get(String.valueOf(id));
		if (hrAreaDTO != null) {
			if (hrAreaDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return hrAreaDTO;
			}
		} else {
			hrAreaDTO = new Hr_AreaDTO();
			Hr_Area hr_area = hrAreaMapper.selectByPrimaryKey(hrAreaDTO.getAreaId());
			if (hr_area != null) {
				BeanUtils.copyProperties(hr_area, hrAreaDTO);
				areaCacheManager.put(hrAreaDTO);
				return hrAreaDTO;
			} else {
				hrAreaDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				areaCacheManager.put(hrAreaDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param area
	 * @return
	 * @throws DaoException
	 */
	public Hr_AreaDTO update(Hr_Area area) throws DaoException {
		Hr_AreaDTO areaDTO = this.selectById(area.getAreaId().intValue());
		Date updatetime = new Date();
		area.setAreaId(areaDTO.getAreaId());
		int update = hrAreaMapper.updateByPrimaryKeySelective(area);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(area, areaDTO, BeanUtil.getNullPropertyNames(area));
		areaCacheManager.put(areaDTO);
		return areaDTO;
	}

	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hr_AreaDTO selectAll(){
		Hr_AreaDTO hrAreaDTO = new Hr_AreaDTO();
		Hr_AreaExample example = new Hr_AreaExample();
		List<Hr_Area> hrUserList = hrAreaMapper.selectByExample(example);
		if (hrUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hrUserList.get(0), hrAreaDTO, BeanUtil.getNullPropertyNames(hrUserList.get(0)));
			return hrAreaDTO;
		}
	}
}
