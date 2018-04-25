package scorponok.server.controller.tdclient.response;

//不分维度关联多平台
public class Platform_detail {
	private Integer count;// 个数 Integer
	private String industry_display_name;// 行业名称
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getIndustry_display_name() {
		return industry_display_name;
	}
	public void setIndustry_display_name(String industry_display_name) {
		this.industry_display_name = industry_display_name;
	}
}
