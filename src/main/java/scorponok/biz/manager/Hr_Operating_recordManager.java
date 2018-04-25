package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.area.AreaCacheManager;
import scorponok.base.cache.operating_record.Operating_recordCacheManager;
import scorponok.base.entity.Hr_Area;
import scorponok.base.entity.Hr_AreaExample;
import scorponok.base.entity.Hr_Operating_record;
import scorponok.base.entity.Hr_Operating_recordExample;
import scorponok.base.mapper.Hr_AreaMapper;
import scorponok.base.mapper.Hr_Operating_recordMapper;
import scorponok.biz.dto.area.Hr_AreaDTO;
import scorponok.biz.dto.operating_record.Hr_Operating_recordDTO;
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
public class Hr_Operating_recordManager {

	@Resource
	private Hr_Operating_recordMapper operatingRecordMapper;
	@Resource
	private Operating_recordCacheManager recordCacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_Operating_recordDTO insert(Hr_Operating_record record) throws DaoException {
		Hr_Operating_recordDTO recordDTO = new Hr_Operating_recordDTO();
		Date now = new Date();
		BeanUtils.copyProperties(record,recordDTO);
		int insert = operatingRecordMapper.insert(record);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		recordCacheManager.put(recordDTO);
		return recordDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_Operating_recordDTO selectById(long id) {
		Hr_Operating_recordDTO recordDTO = recordCacheManager.get(String.valueOf(id));
		if (recordDTO != null) {
			if (recordDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return recordDTO;
			}
		} else {
			recordDTO = new Hr_Operating_recordDTO();
			Hr_Operating_record xz_user = operatingRecordMapper.selectByPrimaryKey(recordDTO.getOperatingRecordId());
			if (xz_user != null) {
				BeanUtils.copyProperties(xz_user, recordDTO);
				recordCacheManager.put(recordDTO);
				return recordDTO;
			} else {
				recordDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				recordCacheManager.put(recordDTO);
				return null;
			}
		}
	}

	/**
	 * 条件查询
	 *
	 * @param
	 * @return
	 */
	public Hr_Operating_recordDTO selectbytelNum(Hr_Operating_record record) {
		Hr_Operating_recordDTO recordDTO = new Hr_Operating_recordDTO();
		Hr_Operating_recordExample example = new Hr_Operating_recordExample();
        Hr_Operating_recordExample.Criteria criteria = example.createCriteria();
        List<Hr_Operating_record> xzUserList = operatingRecordMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), recordDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return recordDTO;
		}
	}
}
