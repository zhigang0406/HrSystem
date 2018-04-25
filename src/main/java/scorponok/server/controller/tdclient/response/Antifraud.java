package scorponok.server.controller.tdclient.response;

import java.util.List;

//贷前反欺诈模块
public class Antifraud {
	private Integer final_score;	//风险分数		 
	private String final_decision;	//决策结果	
	List<Risk_items> risk_items;	//风险项目
	public Integer getFinal_score() {
		return final_score;
	}
	public void setFinal_score(Integer final_score) {
		this.final_score = final_score;
	}
	public String getFinal_decision() {
		return final_decision;
	}
	public void setFinal_decision(String final_decision) {
		this.final_decision = final_decision;
	}
	public List<Risk_items> getRisk_items() {
		return risk_items;
	}
	public void setRisk_items(List<Risk_items> risk_items) {
		this.risk_items = risk_items;
	}
}
