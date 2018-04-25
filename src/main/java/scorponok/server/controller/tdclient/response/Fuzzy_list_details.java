package scorponok.server.controller.tdclient.response;

/*
 * 模糊证据库细则
 *
 */
public class Fuzzy_list_details {
	private String	fraud_type_display_name;//	风险类型显示名
	private String	fuzzy_id_number;//	模糊身份证
	private String	fuzzy_name;//	模糊姓名
	private String	fraud_type;//	风险类型
	public String getFraud_type_display_name() {
		return fraud_type_display_name;
	}
	public void setFraud_type_display_name(String fraud_type_display_name) {
		this.fraud_type_display_name = fraud_type_display_name;
	}
	public String getFuzzy_id_number() {
		return fuzzy_id_number;
	}
	public void setFuzzy_id_number(String fuzzy_id_number) {
		this.fuzzy_id_number = fuzzy_id_number;
	}
	public String getFuzzy_name() {
		return fuzzy_name;
	}
	public void setFuzzy_name(String fuzzy_name) {
		this.fuzzy_name = fuzzy_name;
	}
	public String getFraud_type() {
		return fraud_type;
	}
	public void setFraud_type(String fraud_type) {
		this.fraud_type = fraud_type;
	}

}
