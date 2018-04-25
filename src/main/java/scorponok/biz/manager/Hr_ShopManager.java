package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.shop.ShopCacheManager;
import scorponok.base.entity.Hr_Shop;
import scorponok.base.entity.Hr_ShopExample;
import scorponok.base.mapper.Hr_ShopMapper;
import scorponok.biz.dto.shop.Hr_ShopDTO;
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
public class Hr_ShopManager {

	@Resource
	private Hr_ShopMapper shopMapper;
	@Resource
	private ShopCacheManager manager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_ShopDTO insert(Hr_Shop shop) throws DaoException {
		Hr_ShopDTO dto = new Hr_ShopDTO();
		Date now = new Date();
		BeanUtils.copyProperties(shop,dto);
		int insert = shopMapper.insert(dto);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		manager.put(dto);
		return dto;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_ShopDTO selectById(long id) {
		Hr_ShopDTO dto = manager.get(String.valueOf(id));
		if (dto != null) {
			if (dto.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return dto;
			}
		} else {
			dto = new Hr_ShopDTO();
			Hr_Shop xz_user = shopMapper.selectByPrimaryKey(dto.getShopId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, dto);
				manager.put(dto);
				return dto;
			} else {
				dto.setCacheStatus(CaCheStatus.NOT_EXIT);
				manager.put(dto);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param shop
	 * @return
	 * @throws DaoException
	 */
	public Hr_ShopDTO update(Hr_Shop shop) throws DaoException {
		Hr_ShopDTO dto = this.selectById(shop.getShopId().intValue());
		Date updatetime = new Date();
		shop.setShopId(dto.getShopId());
		int update = shopMapper.updateByPrimaryKeySelective(shop);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(shop, dto, BeanUtil.getNullPropertyNames(shop));
		manager.put(dto);
		return dto;
	}

	/**
	 * 条件查询
	 *
	 * @param
	 * @return
	 */
	public Hr_ShopDTO selectbyteOne(Hr_Shop shop) {
		Hr_ShopDTO dto = new Hr_ShopDTO();
		Hr_ShopExample example = new Hr_ShopExample();
		Hr_ShopExample.Criteria criteria = example.createCriteria();
		List<Hr_Shop> shopList = shopMapper.selectByExample(example);
		if (shopList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(shopList.get(0), dto, BeanUtil.getNullPropertyNames(shopList.get(0)));
			return dto;
		}
	}
}
