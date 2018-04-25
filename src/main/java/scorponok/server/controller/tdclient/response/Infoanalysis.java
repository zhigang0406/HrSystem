package scorponok.server.controller.tdclient.response;
/*
 * 信息解析详情
 */
public class Infoanalysis {
	private Address_detect address_detect; //归属地详情解析
	private Device_info device_info; //设备信息
	private Geotrueip_info geotrueip_info; //真实地理位置信息
	private Geoip_info geoip_info;//地理位置信息
	public Address_detect getAddress_detect() {
		return address_detect;
	}
	public void setAddress_detect(Address_detect address_detect) {
		this.address_detect = address_detect;
	}
	public Device_info getDevice_info() {
		return device_info;
	}
	public void setDevice_info(Device_info device_info) {
		this.device_info = device_info;
	}
	public Geotrueip_info getGeotrueip_info() {
		return geotrueip_info;
	}
	public void setGeotrueip_info(Geotrueip_info geotrueip_info) {
		this.geotrueip_info = geotrueip_info;
	}
	public Geoip_info getGeoip_info() {
		return geoip_info;
	}
	public void setGeoip_info(Geoip_info geoip_info) {
		this.geoip_info = geoip_info;
	}
}
