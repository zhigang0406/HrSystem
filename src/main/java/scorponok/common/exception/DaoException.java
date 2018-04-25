package scorponok.common.exception;

public class DaoException extends RuntimeException {
	private String errorMessage;

	public DaoException(String errorMessage, Exception e) {
		super(errorMessage, e);
		this.errorMessage = errorMessage;
	}

	public DaoException(ErrorConstant errorMessage) {
		this.errorMessage = errorMessage.getErrorMessage();
	}

	public DaoException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
