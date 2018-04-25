package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.brand.BrandCacheManager;
import scorponok.base.entity.Hr_Brand;
import scorponok.base.entity.Hr_BrandExample;
import scorponok.base.mapper.Hr_BrandMapper;
import scorponok.biz.dto.brand.Hr_BrandDTO;
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
public class Hr_BrandManager {

	@Resource
	private Hr_BrandMapper hrBrandMapper;
	@Resource
	private BrandCacheManager brandCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_BrandDTO insert(Hr_Brand hrBrand) throws DaoException {
		Hr_BrandDTO brandDTO = new Hr_BrandDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrBrand,brandDTO);
		int insert = hrBrandMapper.insert(brandDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		brandCacheManager.put(brandDTO);
		return brandDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_BrandDTO selectById(long id) {
		Hr_BrandDTO hrBrandDTO = brandCacheManager.get(String.valueOf(id));
		if (hrBrandDTO != null) {
			if (hrBrandDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return hrBrandDTO;
			}
		} else {
			hrBrandDTO = new Hr_BrandDTO();
			Hr_Brand xz_user = hrBrandMapper.selectByPrimaryKey(hrBrandDTO.getBrandId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, hrBrandDTO);
				brandCacheManager.put(hrBrandDTO);
				return hrBrandDTO;
			} else {
				hrBrandDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				brandCacheManager.put(hrBrandDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param hrBrand
	 * @return
	 * @throws DaoException
	 */
	public Hr_BrandDTO update(Hr_Brand hrBrand) throws DaoException {
		Hr_BrandDTO brandDTO = this.selectById(hrBrand.getBrandId().intValue());
		Date updatetime = new Date();
		hrBrand.setBrandId(brandDTO.getBrandId());
		int update = hrBrandMapper.updateByPrimaryKeySelective(hrBrand);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(hrBrand, brandDTO, BeanUtil.getNullPropertyNames(hrBrand));
		brandCacheManager.put(brandDTO);
		return brandDTO;
	}


	/**
	 * 查询全部
	 * @param
	 * @return
	 */
	public Hr_BrandDTO selectAll(){
		Hr_BrandDTO hrBrandDTO = new Hr_BrandDTO();
		Hr_BrandExample example = new Hr_BrandExample();
		List<Hr_Brand> hrUserList = hrBrandMapper.selectByExample(example);
		if (hrUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(hrUserList.get(0), hrBrandDTO, BeanUtil.getNullPropertyNames(hrUserList.get(0)));
			return hrBrandDTO;
		}
	}
}
