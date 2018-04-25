package scorponok.server.controller.tdclient.response;
//风险群体风险详情细则
public class Suspect_team_detail_list {
	private String dim_type;// 匹配字段名称 String
	private String dim_value;// 匹配字段值 String
	private String group_id;// 疑似风险群体编号 String
	private Integer total_cnt;// 疑似风险群体成员数 Integer
	public String getDim_type() {
		return dim_type;
	}
	public void setDim_type(String dim_type) {
		this.dim_type = dim_type;
	}
	public String getDim_value() {
		return dim_value;
	}
	public void setDim_value(String dim_value) {
		this.dim_value = dim_value;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public Integer getTotal_cnt() {
		return total_cnt;
	}
	public void setTotal_cnt(Integer total_cnt) {
		this.total_cnt = total_cnt;
	}
	public Integer getBlack_cnt() {
		return black_cnt;
	}
	public void setBlack_cnt(Integer black_cnt) {
		this.black_cnt = black_cnt;
	}
	public Integer getGrey_cnt() {
		return grey_cnt;
	}
	public void setGrey_cnt(Integer grey_cnt) {
		this.grey_cnt = grey_cnt;
	}
	public String getNode_dist() {
		return node_dist;
	}
	public void setNode_dist(String node_dist) {
		this.node_dist = node_dist;
	}
	public String getFraud_dist() {
		return fraud_dist;
	}
	public void setFraud_dist(String fraud_dist) {
		this.fraud_dist = fraud_dist;
	}
	public String getBlack_rat() {
		return black_rat;
	}
	public void setBlack_rat(String black_rat) {
		this.black_rat = black_rat;
	}
	public String getGrey_rat() {
		return grey_rat;
	}
	public void setGrey_rat(String grey_rat) {
		this.grey_rat = grey_rat;
	}
	public Integer getDegree() {
		return degree;
	}
	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	public String getTotal_cnt_two() {
		return total_cnt_two;
	}
	public void setTotal_cnt_two(String total_cnt_two) {
		this.total_cnt_two = total_cnt_two;
	}
	public String getBlack_cnt_one() {
		return black_cnt_one;
	}
	public void setBlack_cnt_one(String black_cnt_one) {
		this.black_cnt_one = black_cnt_one;
	}
	public String getFraud_dist_one() {
		return fraud_dist_one;
	}
	public void setFraud_dist_one(String fraud_dist_one) {
		this.fraud_dist_one = fraud_dist_one;
	}
	public Integer getBlack_cnt_two() {
		return black_cnt_two;
	}
	public void setBlack_cnt_two(Integer black_cnt_two) {
		this.black_cnt_two = black_cnt_two;
	}
	public String getFraud_dist_two() {
		return fraud_dist_two;
	}
	public void setFraud_dist_two(String fraud_dist_two) {
		this.fraud_dist_two = fraud_dist_two;
	}
	public Integer getBlack_dst() {
		return black_dst;
	}
	public void setBlack_dst(Integer black_dst) {
		this.black_dst = black_dst;
	}
	public Integer getCore_dst() {
		return core_dst;
	}
	public void setCore_dst(Integer core_dst) {
		this.core_dst = core_dst;
	}
	private Integer black_cnt;// 风险名单成员数 Integer
	private Integer grey_cnt;// 关注名单成员数 Integer
	private String node_dist;// 成员分布 String
	private String fraud_dist;// 风险名单分布 String
	private String black_rat;// 风险名单占比 String
	private String grey_rat;// 关注名单占比 String
	private Integer degree;// 一度关联节点个数 Integer
	private String total_cnt_two;// 二度关联节点个数 Integer
	private String black_cnt_one;// 一度风险名单个数 Integer
	private String fraud_dist_one;// 一度风险名单分布 String
	private Integer black_cnt_two;// 二度风险名单个数 Integer
	private String fraud_dist_two;// 二度风险名单分布 String
	private Integer black_dst;// 风险节点距离 Integer
	private Integer core_dst;// 核心节点距离 Integer

}
