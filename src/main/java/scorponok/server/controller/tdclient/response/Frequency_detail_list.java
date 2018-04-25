package scorponok.server.controller.tdclient.response;
//频度细则
public class Frequency_detail_list {
	private String detail; // 规则命中基本详情 形如："手机号关联身份证个数：3"

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
