package scorponok.server.controller.tdclient.response;
//跨事件字段细则
public class Cross_event_detail_list {
 private String detail; //规则命中基本详情 形如："手机号相同次数：3"

public String getDetail() {
	return detail;
}

public void setDetail(String detail) {
	this.detail = detail;
}
}
