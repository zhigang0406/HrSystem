package scorponok.server.controller.tdclient.response;

import java.util.List;

public class Risk_detail {
	private String type;//规则类型	
	private List<Suspect_team_detail_list> suspect_team_detail_list; //风险群体风险详情细则
	private List<Grey_list_details>	grey_list_details;//	关注名单细则	
	private List<Fuzzy_list_details> fuzzy_list_details; //模糊证据库细则
	private List<Frequency_detail_list> frequency_detail_list;//频度细则
	private List<Cross_frequency_detail_list> cross_frequency_detail_list; //跨事件频度细则
	private List<Cross_event_detail_list> cross_event_detail_list; //跨事件字段细则
	private List<Overdue_details> overdue_details; //信贷逾期统计细则
	private List<Platform_detail_dimension> platform_detail_dimension; //各维度关联多平台
	private List<Platform_detail> platform_detail; //不分维度关联多平台
	private List<Court_details> court_details; //法院细则
	private String	description;//	描述	String
	private String	hit_type_display_name;//	匹配类型	String
	private String	fraud_type_display_name	;//风险类型显示名	String
	public List<Grey_list_details> getGrey_list_details() {
		return grey_list_details;
	}
	public void setGrey_list_details(List<Grey_list_details> grey_list_details) {
		this.grey_list_details = grey_list_details;
	}
	public List<Fuzzy_list_details> getFuzzy_list_details() {
		return fuzzy_list_details;
	}
	public void setFuzzy_list_details(List<Fuzzy_list_details> fuzzy_list_details) {
		this.fuzzy_list_details = fuzzy_list_details;
	}
	public List<Frequency_detail_list> getFrequency_detail_list() {
		return frequency_detail_list;
	}
	public void setFrequency_detail_list(List<Frequency_detail_list> frequency_detail_list) {
		this.frequency_detail_list = frequency_detail_list;
	}
	public List<Cross_frequency_detail_list> getCross_frequency_detail_list() {
		return cross_frequency_detail_list;
	}
	public void setCross_frequency_detail_list(List<Cross_frequency_detail_list> cross_frequency_detail_list) {
		this.cross_frequency_detail_list = cross_frequency_detail_list;
	}
	public List<Cross_event_detail_list> getCross_event_detail_list() {
		return cross_event_detail_list;
	}
	public void setCross_event_detail_list(List<Cross_event_detail_list> cross_event_detail_list) {
		this.cross_event_detail_list = cross_event_detail_list;
	}
	public List<Overdue_details> getOverdue_details() {
		return overdue_details;
	}
	public void setOverdue_details(List<Overdue_details> overdue_details) {
		this.overdue_details = overdue_details;
	}
	public List<Platform_detail_dimension> getPlatform_detail_dimension() {
		return platform_detail_dimension;
	}
	public void setPlatform_detail_dimension(List<Platform_detail_dimension> platform_detail_dimension) {
		this.platform_detail_dimension = platform_detail_dimension;
	}
	public List<Platform_detail> getPlatform_detail() {
		return platform_detail;
	}
	public void setPlatform_detail(List<Platform_detail> platform_detail) {
		this.platform_detail = platform_detail;
	}
	public List<Court_details> getCourt_details() {
		return court_details;
	}
	public void setCourt_details(List<Court_details> court_details) {
		this.court_details = court_details;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHit_type_display_name() {
		return hit_type_display_name;
	}
	public void setHit_type_display_name(String hit_type_display_name) {
		this.hit_type_display_name = hit_type_display_name;
	}
	public String getFraud_type_display_name() {
		return fraud_type_display_name;
	}
	public void setFraud_type_display_name(String fraud_type_display_name) {
		this.fraud_type_display_name = fraud_type_display_name;
	}
	public Integer getDiscredit_times() {
		return discredit_times;
	}
	public void setDiscredit_times(Integer discredit_times) {
		this.discredit_times = discredit_times;
	}
	public Integer getPlatform_count() {
		return platform_count;
	}
	public void setPlatform_count(Integer platform_count) {
		this.platform_count = platform_count;
	}
	private Integer discredit_times;//信贷逾期次数
	private Integer platform_count ;//关联多个平台数
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Suspect_team_detail_list> getSuspect_team_detail_list() {
		return suspect_team_detail_list;
	}
	public void setSuspect_team_detail_list(List<Suspect_team_detail_list> suspect_team_detail_list) {
		this.suspect_team_detail_list = suspect_team_detail_list;
	}
}
