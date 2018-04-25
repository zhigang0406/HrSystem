package scorponok.base.cache.account;

import org.springframework.stereotype.Component;
import scorponok.base.cache.CacheManager;
import scorponok.biz.dto.account.Hr_AccountDTO;


@Component
public class AccountCacheManager extends CacheManager<Hr_AccountDTO> {

	@Override
	protected String getKey(Hr_AccountDTO value) {
		return "ACCOUNT_"+ value.getAccountId();
	}

	@Override
	protected String getKey(String id) {
		return "ACCOUNT_"+ id;
	}

	@Override
	protected Class<Hr_AccountDTO> getDTOClass() {
		return Hr_AccountDTO.class;
	}

}
