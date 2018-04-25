package scorponok.common.exception;

/**
 * Created by didi on 2017/7/10.
 */
public class BusinessException extends RuntimeException {
    private String errorCode;
    private String errorMessage;

    public BusinessException(String errorCode, String errorMessage) {
        super(errorCode + ":" + errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(ApiErrors errors) {
        this(errors.getErrorCode(), errors.getErrorMessage());
    }

    public BusinessException(ApiErrors errors, Object... args) {
        this(errors.getErrorCode(), String.format(errors.getErrorMessage(), args));
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
