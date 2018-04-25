package scorponok.biz.manager;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shensijie on 2018/3/21.
 */
@Service
public class Hr_SqlUtilManager {

/*	@Resource
	private Xz_SqlUtilMapper xzSqlUtilMapper;

	*//**
	 * 联表查询
	 * @param xzUser
	 * @return
	 *//*
	public Xz_UserDTO selectAll(Xz_User xzUser){
		Xz_UserDTO xzUserDTO = new Xz_UserDTO();
		BeanUtils.copyProperties(xzUser, xzUserDTO);
		List<Xz_User> xzUserList = xzSqlUtilMapper.userListAll(xzUserDTO);
		if(xzUserList.size() == 0){
			return null;
		}else{
			BeanUtils.copyProperties(xzUserList.get(0), xzUserDTO, BeanUtil.getNullPropertyNames(xzUserList.get(0)));
		}
		return xzUserDTO;
	}*/
}
