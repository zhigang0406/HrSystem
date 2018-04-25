package scorponok.server.controller.tdclient.response;

/*
 * 代理信息详情
 */
public class Proxy_info {
	private String port; // 代理端口
	private String proxyProtocol; // 代理协议
	private String proxyType; // 代理类型
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getProxyProtocol() {
		return proxyProtocol;
	}
	public void setProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
	}
	public String getProxyType() {
		return proxyType;
	}
	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
	}
}
