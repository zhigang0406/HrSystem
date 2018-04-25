package scorponok.server.controller.tdclient.response;
//法院细则
public class Court_details {
	private String	case_code;//	案号	String	
	private String	execute_court;//	执行法院	String	
	private String	case_date;//	立案时间	String	
	private String	gender;//	性别	String	
	private String	carry_out;//	被执行人履行情况	String	
	private String	executed_name;//	被执行人姓名	String	
	private String	fraud_type;//	风险类型	String	
	private String	specific_circumstances;//	信贷逾期被执行人行为具体情形	String	
	private String	execute_subject;//	执行标的	String	
	private String	execute_status;//	执行状态	String	
	private String	evidence_court;//	做出依据执行法院	String	
	private String	term_duty;//	生效法律文书确定的义务	String	
	private String	province;//	省份	String	
	private String	execute_code;//	执行依据文号	String	
	private String	value;//	命中的属性值	String	
	private String	age;//	年龄	String	
	private String	evidence_time;//	证据时间戳形式	Long	精确到毫秒
	private String	fraud_type_display_name;//	风险类型显示名	String	"法院失信"，"法院执行"，"法院结案"中的一种
	public String getCase_code() {
		return case_code;
	}
	public void setCase_code(String case_code) {
		this.case_code = case_code;
	}
	public String getExecute_court() {
		return execute_court;
	}
	public void setExecute_court(String execute_court) {
		this.execute_court = execute_court;
	}
	public String getCase_date() {
		return case_date;
	}
	public void setCase_date(String case_date) {
		this.case_date = case_date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCarry_out() {
		return carry_out;
	}
	public void setCarry_out(String carry_out) {
		this.carry_out = carry_out;
	}
	public String getExecuted_name() {
		return executed_name;
	}
	public void setExecuted_name(String executed_name) {
		this.executed_name = executed_name;
	}
	public String getFraud_type() {
		return fraud_type;
	}
	public void setFraud_type(String fraud_type) {
		this.fraud_type = fraud_type;
	}
	public String getSpecific_circumstances() {
		return specific_circumstances;
	}
	public void setSpecific_circumstances(String specific_circumstances) {
		this.specific_circumstances = specific_circumstances;
	}
	public String getExecute_subject() {
		return execute_subject;
	}
	public void setExecute_subject(String execute_subject) {
		this.execute_subject = execute_subject;
	}
	public String getExecute_status() {
		return execute_status;
	}
	public void setExecute_status(String execute_status) {
		this.execute_status = execute_status;
	}
	public String getEvidence_court() {
		return evidence_court;
	}
	public void setEvidence_court(String evidence_court) {
		this.evidence_court = evidence_court;
	}
	public String getTerm_duty() {
		return term_duty;
	}
	public void setTerm_duty(String term_duty) {
		this.term_duty = term_duty;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getExecute_code() {
		return execute_code;
	}
	public void setExecute_code(String execute_code) {
		this.execute_code = execute_code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEvidence_time() {
		return evidence_time;
	}
	public void setEvidence_time(String evidence_time) {
		this.evidence_time = evidence_time;
	}
	public String getFraud_type_display_name() {
		return fraud_type_display_name;
	}
	public void setFraud_type_display_name(String fraud_type_display_name) {
		this.fraud_type_display_name = fraud_type_display_name;
	}

}
