package scorponok.biz.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import scorponok.base.cache.SimpleCacheClient;
import scorponok.biz.dto.account.Hr_AccountDTO;
import scorponok.biz.manager.Hr_AccountManager;
import scorponok.biz.service.Hr_AccountService;
import scorponok.common.exception.BusinessException;
import scorponok.common.exception.ErrorConstant;
import scorponok.server.response.UserLoginResponse;
import scorponok.server.utils.HttpUtil;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service public abstract class Hr_AccountServiceImpl implements Hr_AccountService {


}
