package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.post.PostCacheManager;
import scorponok.base.entity.Hr_Post;
import scorponok.base.entity.Hr_PostExample;
import scorponok.base.mapper.Hr_PostMapper;
import scorponok.biz.dto.post.Hr_PostDTO;
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
public class Hr_PostManager {

	@Resource
	private Hr_PostMapper postMapper;
	@Resource
	private PostCacheManager cacheManager;


	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_PostDTO insert(Hr_Post hrPost) throws DaoException {
		Hr_PostDTO postDTO = new Hr_PostDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrPost,postDTO);
		int insert = postMapper.insert(postDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
		cacheManager.put(postDTO);
		return postDTO;
	}

	/**
	 * 按照id查询
	 *
	 * @param id
	 * @return
	 */
	public Hr_PostDTO selectById(long id) {
		Hr_PostDTO postDTO = cacheManager.get(String.valueOf(id));
		if (postDTO != null) {
			if (postDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
				return null;
			} else {
				return postDTO;
			}
		} else {
			postDTO = new Hr_PostDTO();
			Hr_Post hrPost = postMapper.selectByPrimaryKey(postDTO.getPostId());
			if (hrPost != null) {
				BeanUtils.copyProperties(hrPost,postDTO);
				cacheManager.put(postDTO);
				return postDTO;
			} else {
				postDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
				cacheManager.put(postDTO);
				return null;
			}
		}
	}

	/**
	 * 修改
	 *
	 * @param hrPost
	 * @return
	 * @throws DaoException
	 */
	public Hr_PostDTO update(Hr_Post hrPost) throws DaoException {
		Hr_PostDTO postDTO = this.selectById(hrPost.getPostId().intValue());
		Date updatetime = new Date();
		hrPost.setPostId(postDTO.getPostId());
		int update = postMapper.updateByPrimaryKeySelective(hrPost);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(hrPost, postDTO, BeanUtil.getNullPropertyNames(hrPost));
		cacheManager.put(postDTO);
		return postDTO;
	}

	/**
	 * 按照部门id查询
	 *
	 * @param depementid
	 * @return
	 */
	public Hr_PostDTO selectbytelNum(long depementid) {
		Hr_PostDTO postDTO = new Hr_PostDTO();
		Hr_PostExample example = new Hr_PostExample();
		example.createCriteria().andPostDepementidEqualTo(depementid);
		List<Hr_Post> xzUserList = postMapper.selectByExample(example);
		if (xzUserList.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzUserList.get(0), postDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
			return postDTO;
		}
	}
}
