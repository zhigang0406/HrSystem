package scorponok.server.controller.tdclient.response;

import java.util.List;

//各维度关联多平台
public class Platform_detail_dimension {
	private Integer count; //个数
	private List<Platform_detail_dimension_detail> detail; //各维度关联多平台细则
	private String dimension;//纬度名称
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Platform_detail_dimension_detail> getDetail() {
		return detail;
	}
	public void setDetail(List<Platform_detail_dimension_detail> detail) {
		this.detail = detail;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
}
