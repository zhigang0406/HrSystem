package scorponok.server.controller.tdclient.response;

/*
 * 真实地理位置信息
 */
public class Geotrueip_info {
	private String position;// 地址
	private String isp;// 互联网服务提供商
	private Double latitude; // 纬度
	private Double longitude; // 经度
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
}
