package scorponok.common.exception;

/**
 * Created by didi on 2017/7/10.
 */
public enum ErrorConstant implements ApiErrors {
	SUCCESS(10000, "SUCCESS", ""),
	NOT_ALL_COMPLETE(100034, "NOT_ALL_COMPLETE","未完成所有步骤"),

	IMG_ZIP_ERROR(700002, "IMG_ZIP_ERROR", "图片压缩失败"),
	RES_TYPE_DENY(700003, "RES_TYPE_DENY", "文件类型不合法"),
	IMG_TYPE_NOT_SUPPORT(700005, "IMG_TYPE_NOT_SUPPORT", "图片格式不支持"),
	RESOURCE_UPLOAD_ERROR(700001, "RESOURCE_UPLOAD_ERROR", "上传失败,请重试"),
	SYSTEM_ERROR(10001, "SYSTEM_ERROR", "服务器忙,请稍后再试"),
	JSON_FORMAT_ERROR(10002, "JSON_FORMAT_ERROR", "JSON格式不正确"),
	JSON_DATA_FROMAT_ERROR(10003, "JSON_DATA_FROMAT_ERROR", "日期格式不正确,请使用yyyy-MM-dd HH:mm:ss"),
	SYS_ERR_DATA_NOT_EXIST(10004, "SYS_ERR_DATA_NOT_EXIST", "数据不存在"),
	FIELD_INVALID(10005, "FIELD_INVALID", "输入的参数非法"),

	CODE_ERROR(100008, "CODE_ERROR", "验证码错误"),
	METHOD_INVOKE_ERROR(10000, "METHOD_INVOKE_ERROR", "系统出错啦，请联系客服MM!"),
	FIELD_SMS(100006, "FIELD_SMS", "操作过于频繁,请稍后重试"),
	ALREADY_REG(1000003, "ALREADY_REG", "您的号码已被注册"),

	LOGIN_ERROR_PASSWORD_INCORRECT(10006, "LOGIN_ERROR_PASSWORD_INCORRECT", "用户名或密码错误"),

	TODAY_REC(90001, "TODAY_REC", "今日接收量已上线"),
	TODAY_AUTOR_REC(90002, "TODAY_AUTOR_REC", "今日自动接收量已上线"),
	MONTH_REC(90003, "MONTH_REC", "本月接收量已上线"),
	PRODUCT_STATUS(90004, "PRODUCT_STATUS", "产品已下线"),
	PRODUCT_REPORT_RECORD(20013, "PRODUCT_REPORT_RECORD", "暂无操作记录"),
	PRODUCT_REPORT(900078, "PRODUCT_REPORT", "暂无数据"),
	PRODUCT_SUBMIT(900099,"PRODUCT_SUBMIT","请勿重复提交"),

	ALREADY_EXIST(10007, "ALREADY_EXIST", "数据已存在，请重新输入"),
	USER_EXIST(10008, "USER_EXIST", "用户已存在"),
	LOGIN_ERROR_USER_NOT_EXIST(20005, "LOGIN_ERROR_USER_NOT_EXIST", "用户名不存在"),
	LOGIN_ERROR_SIGN_ERROR(20006, "LOGIN_ERROR_SIGN_ERROR", "登录失效，请重新登录"),
	PC_ACCOUNT_OFF(20007, "PC_ACCOUNT_OFF", "账号已被禁用,请联系管理员"),
	API_NO_PERMISSION(20008, "API_NO_PERMISSION", "没有权限调用此api"),
	UPDATE_PWD(11111, "UPDATE_PWD", "修改密码不成功"),
	ERROR_OPERATE(100019, "ERROR_OPERATE", "错误的操作,请按顺序进行认证"),
	ERROR_OPERATE_STEP(9000088, "ERROR_OPERATE_STEP", "请完成所需步骤"),
	ERROR_OPERATE_STEPER(9000099, "ERROR_OPERATE_STEPER", "您已经完成该步骤"),
	PRODUCT_NAME_EXITS(20009, "PRODUCT_NAME_EXITS", "产品名已存在"),
	REC_MONTH_FULL(20010, "REC_MONTH_FULL", "本月接收已满,无法上线"),
	NOT_HAS_PERMISSION(20011, "NOT_HAS_PERMISSION", "没有权限进行此操作"),
	VECODE_ERROR(20012, "VECODE_ERROR", "图形验证码错误"),
	ALREADY_AUTH(20013, "ALREADY_AUTH", "已经进行过这个认证"),
	REPORT_ALREADY_DEAL(20014, "REPORT_ALREADY_DEAL", "此报告已被处理"),
	LOCK_ERROR(30015, "LOCK_ERROR","数据陈旧,请刷新后重试" ),
	UPDATE_ERROR(30016,"UPDATE_ERROR" ,"内部错误" ), FIELD_POST(20015,"FIELD_POST" , "投递失败");
	private int code;
	private String errorCode;
	private String errorMessage;

	ErrorConstant(int code, String errorCode, String errorMessage) {
		this.code = code;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	@Override
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}

	public int getCode() {
		return code;
	}
}
