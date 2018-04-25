package scorponok.server.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import scorponok.common.exception.BusinessException;
import scorponok.common.exception.DaoException;
import scorponok.common.exception.ErrorConstant;

public class BaseResponse<T> {
	private String errorCode;
	private String errorMessage;
	private T data;

	public BaseResponse() {
	}


	public BaseResponse(DaoException e) {
		this.errorMessage = e.getErrorMessage();
	}

	public BaseResponse(BusinessException e) {
		this(e.getErrorCode(), e.getErrorMessage());
	}

	public BaseResponse(ErrorConstant errors) {

		this(errors.getErrorCode(), errors.getErrorMessage());
	}

	public BaseResponse(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@JsonProperty("status") public int getStatus() {
		return (errorCode == null && errorMessage == null) ? ErrorConstant.SUCCESS.getCode() : ErrorConstant.valueOf(errorCode).getCode();
	}

	@JsonProperty("success") public boolean isSuccess() {
		return errorCode == null && errorMessage == null;
	}
}
