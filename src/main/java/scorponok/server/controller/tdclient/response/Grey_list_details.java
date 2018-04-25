package scorponok.server.controller.tdclient.response;
//关注名单细则
public class Grey_list_details {
	private String	value;//	命中关注名单的属性值	String	
	private String	fraud_type_display_name;//	风险类型显示名	String	
	private String	risk_level;//	风险等级	String	
	private String	fraud_type;//	风险类型	String	
	private Long	evidence_time;//	证据时间戳形式	Long	精确到毫秒
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getFraud_type_display_name() {
		return fraud_type_display_name;
	}
	public void setFraud_type_display_name(String fraud_type_display_name) {
		this.fraud_type_display_name = fraud_type_display_name;
	}
	public String getRisk_level() {
		return risk_level;
	}
	public void setRisk_level(String risk_level) {
		this.risk_level = risk_level;
	}
	public String getFraud_type() {
		return fraud_type;
	}
	public void setFraud_type(String fraud_type) {
		this.fraud_type = fraud_type;
	}
	public Long getEvidence_time() {
		return evidence_time;
	}
	public void setEvidence_time(Long evidence_time) {
		this.evidence_time = evidence_time;
	}

}
