package scorponok.common.exception;

public class ApiException extends Exception {
	private String errorCode;
	private String errorMessage;

	public ApiException(String errorCode, String errorMessage) {
		super(errorCode + ":" + errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ApiException(ApiErrors errors) {
		this(errors.getErrorCode(), errors.getErrorMessage());
	}

	public ApiException(ApiErrors errors, Object... args) {
		this(errors.getErrorCode(), String.format(errors.getErrorMessage(), args));
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
