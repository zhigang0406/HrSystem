package scorponok.common.constant;

public class Account_Step {
	// 用户刚注册时的状态
	public static String Login_Step = "0";
	// 个人信息认证
	public static String NOMAL_INFORMATION_AUTH = "1";
	// 运营商认证
	public static String CONTACT_AUTH = "2";
	// 银行卡认证
	public static String OPERATOR_AUTH = "3";
	// 芝麻信用分认证
	public static String ZMF_AUTH = "4";
	// 微信认证
	public static String WX_AUTH="5";
	// 额度认证
	public static String LIMIT_AUTH="6";
	// 总认证
	public static String ALL_AUTH = "7";
	// 认证失败
	public static String FAIL_AUTH = "8";
	// 认证成功
	public static String SUCCESS_AUTH = "9";

}
