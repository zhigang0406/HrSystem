package scorponok.server.filter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import scorponok.common.exception.ApiException;
import scorponok.common.exception.BusinessException;
import scorponok.common.exception.DaoException;
import scorponok.common.exception.ErrorConstant;
import scorponok.server.response.BaseResponse;

/**
 * Created by didi on 2017/7/10.
 */
@ControllerAdvice
@ResponseBody
public class ErrorHandler {
	protected final Log logger = LogFactory.getLog(getClass());

	@ExceptionHandler(BusinessException.class)
	public BaseResponse handlerBusinessException(BusinessException e) {
//		logger.error(e.getErrorCode(), e);
		BaseResponse resp = new BaseResponse(e);
		return resp;
	}
	@ExceptionHandler(DaoException.class)
	public BaseResponse handlerDaoException(BusinessException e) {
		//		logger.error(e.getErrorCode(), e);
		BaseResponse resp = new BaseResponse(e);
		return resp;
	}
	@ExceptionHandler(ApiException.class)
	public BaseResponse handlerApiException(BusinessException e) {
		//		logger.error(e.getErrorCode(), e);
		BaseResponse resp = new BaseResponse(e);
		return resp;
	}
	@ExceptionHandler(JsonMappingException.class)
	public BaseResponse handlerException(JsonMappingException e) {
		logger.error("json格式错误", e);
		BaseResponse resp = new BaseResponse(ErrorConstant.JSON_FORMAT_ERROR);
		return resp;
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public BaseResponse handlerException(HttpMessageNotReadableException e) {
		logger.error("错误", e);
		BaseResponse resp = new BaseResponse(ErrorConstant.JSON_FORMAT_ERROR);
		return resp;
	}

	@ExceptionHandler(JsonParseException.class)
	public BaseResponse handlerException(JsonParseException e) {
		logger.error("json格式错误", e);
		BaseResponse resp = new BaseResponse(ErrorConstant.JSON_FORMAT_ERROR);
		return resp;
	}

	@ExceptionHandler(InvalidFormatException.class)
	public BaseResponse handlerException(InvalidFormatException e) {
		logger.error("错误", e);
		BaseResponse resp = new BaseResponse(ErrorConstant.JSON_DATA_FROMAT_ERROR);
		return resp;
	}

	@ExceptionHandler(Exception.class)
	public BaseResponse handlerException(Exception e) {
		logger.error("SYS_ERROR", e);
		BaseResponse resp = new BaseResponse(ErrorConstant.SYSTEM_ERROR);
		return resp;
	}
}
