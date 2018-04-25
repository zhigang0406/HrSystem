package scorponok.server.controller.tdclient.response;

import java.util.List;

public class Risk_items {
	private String rule_id;	//规则编号		 
	private Integer score;	//风险分数	
	private String decision;	//决策结果
	private String risk_name;	//规则名称	 
	List<Risk_detail> risk_detail;	//风险详情
	public String getRule_id() {
		return rule_id;
	}
	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getRisk_name() {
		return risk_name;
	}
	public void setRisk_name(String risk_name) {
		this.risk_name = risk_name;
	}
	public List<Risk_detail> getRisk_detail() {
		return risk_detail;
	}
	public void setRisk_detail(List<Risk_detail> risk_detail) {
		this.risk_detail = risk_detail;
	}
}
