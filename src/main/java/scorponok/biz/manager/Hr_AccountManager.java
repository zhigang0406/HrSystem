package scorponok.biz.manager;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import scorponok.base.cache.account.AccountCacheManager;
import scorponok.base.entity.Hr_Account;
import scorponok.base.entity.Hr_AccountExample;
import scorponok.base.mapper.Hr_AccountMapper;
import scorponok.biz.dto.account.Hr_AccountDTO;
import scorponok.common.constant.CaCheStatus;
import scorponok.common.exception.DaoException;
import scorponok.common.exception.ErrorConstant;
import scorponok.common.utils.BeanUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by shensijie on 2018/3/21.
 */
@Service
public class Hr_AccountManager {

	@Resource
	private Hr_AccountMapper hrAccountMapper;
	@Resource
	private AccountCacheManager accountCacheManager;



	public Hr_AccountDTO selectOne(String account_number, String account_password) throws DaoException{
		Hr_AccountDTO xzAccountDTO = new Hr_AccountDTO();
		Hr_AccountExample example = new Hr_AccountExample();
		example.createCriteria().andAccountNumberEqualTo(account_number).andAccountPasswordEqualTo(account_password);
		List<Hr_Account> xzAccounts = hrAccountMapper.selectByExample(example);
		if (xzAccounts.size() == 0) {
			return null;
		} else {
			BeanUtils.copyProperties(xzAccounts.get(0), xzAccountDTO, BeanUtil.getNullPropertyNames(xzAccounts.get(0)));
			return xzAccountDTO;
		}
	}

    /**
     * 按照id查询
     *
     * @param id
     * @return
     */
    public Hr_AccountDTO selectById(long id) {
        Hr_AccountDTO accountDTO = accountCacheManager.get(String.valueOf(id));
        if (accountDTO != null) {
            if (accountDTO.getCacheStatus() == CaCheStatus.NOT_EXIT) {
                return null;
            } else {
                return accountDTO;
            }
        } else {
            accountDTO = new Hr_AccountDTO();
            Hr_Account account = hrAccountMapper.selectByPrimaryKey(id);
            if (account != null) {
                BeanUtils.copyProperties(account, accountDTO);
                accountCacheManager.put(accountDTO);
                return accountDTO;
            } else {
                accountDTO.setCacheStatus(CaCheStatus.NOT_EXIT);
                accountCacheManager.put(accountDTO);
                return null;
            }
        }
    }
	/**
	 * 新增
	 *
	 * @param
	 * @return
	 * @throws DaoException
	 */
	public Hr_AccountDTO insert(Hr_Account hrAccount) throws DaoException {
		Hr_AccountDTO hrAccountDTO = new Hr_AccountDTO();
		Date now = new Date();
		BeanUtils.copyProperties(hrAccount, hrAccountDTO);
		int insert = hrAccountMapper.insertSelective(hrAccountDTO);
		if (insert == 0) {
			throw new DaoException(ErrorConstant.SYSTEM_ERROR);
		}
        accountCacheManager.put(hrAccountDTO);
		return hrAccountDTO;
	}

	/**
	 * 修改
	 *
	 * @param account
	 * @return
	 * @throws DaoException
	 */
	public Hr_AccountDTO update(Hr_Account account) throws DaoException {
		Hr_AccountDTO accountDTO = this.selectById(account.getAccountId().intValue());
		Date updatetime = new Date();
		account.setAccountUpdatatime(updatetime);
		account.setAccountId(accountDTO.getAccountId());
		int update = hrAccountMapper.updateByPrimaryKeySelective(account);
		if (update == 0) {
			throw new DaoException(ErrorConstant.SYS_ERR_DATA_NOT_EXIST);
		}
		BeanUtils.copyProperties(account, accountDTO, BeanUtil.getNullPropertyNames(account));
		accountCacheManager.put(accountDTO);
		return accountDTO;
	}

}
