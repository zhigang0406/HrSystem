package scorponok.server.controller.tdclient.response;
/*
 * 地理位置解析
 */
public class Address_detect {
	private String id_card_address; //身份证所属地
	private String true_ip_address;//ip所属地
	private String wifi_address;//wifi 所属地
	private String cell_address;//基站所属地
	private String bank_card_address;//银行卡所属地
	private String mobile_address;//手机所属地
	public String getId_card_address() {
		return id_card_address;
	}
	public void setId_card_address(String id_card_address) {
		this.id_card_address = id_card_address;
	}
	public String getTrue_ip_address() {
		return true_ip_address;
	}
	public void setTrue_ip_address(String true_ip_address) {
		this.true_ip_address = true_ip_address;
	}
	public String getWifi_address() {
		return wifi_address;
	}
	public void setWifi_address(String wifi_address) {
		this.wifi_address = wifi_address;
	}
	public String getCell_address() {
		return cell_address;
	}
	public void setCell_address(String cell_address) {
		this.cell_address = cell_address;
	}
	public String getBank_card_address() {
		return bank_card_address;
	}
	public void setBank_card_address(String bank_card_address) {
		this.bank_card_address = bank_card_address;
	}
	public String getMobile_address() {
		return mobile_address;
	}
	public void setMobile_address(String mobile_address) {
		this.mobile_address = mobile_address;
	}
}