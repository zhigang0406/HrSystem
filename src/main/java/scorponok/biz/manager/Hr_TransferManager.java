package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.transfer.TransferCacheManager;
import scorponok.base.entity.Hr_Transfer;
import scorponok.base.entity.Hr_TransferExample;
import scorponok.base.mapper.Hr_TransferMapper;
import scorponok.biz.dto.transfer.Hr_TransferDTO;
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
public class Hr_TransferManager {

	@Resource
	private Hr_TransferMapper transferMapper;
	@Resource
	private TransferCacheManager manager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_TransferDTO insert(Hr_Transfer transfer) throws DaoException {
		Hr_TransferDTO dto = new Hr_TransferDTO();
		Date now = new Date();
		BeanUtils.copyProperties(transfer,dto);
		int insert = transferMapper.insert(transfer);
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
	public Hr_TransferDTO selectById(long id) {
		Hr_TransferDTO dto = manager.get(String.valueOf(id));
		if (dto != null) {
			if (dto.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return dto;
			}
		} else {
			dto = new Hr_TransferDTO();
			Hr_Transfer xz_user = transferMapper.selectByPrimaryKey(dto.getTransferId());
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
	 * @param transfer
	 * @return
	 * @throws DaoException
	 */
	public Hr_TransferDTO update(Hr_Transfer transfer) throws DaoException {
		Hr_TransferDTO dto = this.selectById(transfer.getTransferId().intValue());
		Date updatetime = new Date();
		transfer.setTransferId(dto.getTransferId());
		int update = transferMapper.updateByPrimaryKeySelective(dto);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(transfer, dto, BeanUtil.getNullPropertyNames(transfer));
		manager.put(dto);
		return dto;
	}

	/**
	 * 条件查询
	 *
	 * @param user_phone
	 * @return
	 */
	public Hr_TransferDTO selectbytelNum(String user_phone) {
		Hr_TransferDTO dto = new Hr_TransferDTO();
		Hr_TransferExample example = new Hr_TransferExample();
		Hr_TransferExample.Criteria criteria = example.createCriteria();
		List<Hr_Transfer> xzUserList = transferMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), dto, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return dto;
		}
	}

}
