package scorponok.server.controller.tdclient.response;

//信贷逾期统计细则
public class Overdue_details {
	private String overdue_amount_range;// 逾期金额区间 String 区间包括(0, 1000],(1000, 5000],(5000, 10000],(10000, 50000],(50000,
										// 100000],(100000, 500000],500000+
	private String overdue_count;// 逾期笔数 Integer
	private String overdue_day_range;// 逾期时间区间 String 区间包括(0, 30],(30, 60],(60, 90],(90, 180],(180, 270],(270,
										// 360],360+
	private String overdue_time;// 逾期入库时间 String
	public String getOverdue_amount_range() {
		return overdue_amount_range;
	}
	public void setOverdue_amount_range(String overdue_amount_range) {
		this.overdue_amount_range = overdue_amount_range;
	}
	public String getOverdue_count() {
		return overdue_count;
	}
	public void setOverdue_count(String overdue_count) {
		this.overdue_count = overdue_count;
	}
	public String getOverdue_day_range() {
		return overdue_day_range;
	}
	public void setOverdue_day_range(String overdue_day_range) {
		this.overdue_day_range = overdue_day_range;
	}
	public String getOverdue_time() {
		return overdue_time;
	}
	public void setOverdue_time(String overdue_time) {
		this.overdue_time = overdue_time;
	}

}
