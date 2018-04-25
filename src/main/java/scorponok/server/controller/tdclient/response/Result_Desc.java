package scorponok.server.controller.tdclient.response;
/*
 * 结果详情
 */
public class Result_Desc {
	private Antifraud antifraud;
	private Infoanalysis infoanalysis;
	public Antifraud getAntifraud() {
		return antifraud;
	}
	public void setAntifraud(Antifraud antifraud) {
		this.antifraud = antifraud;
	}
	public Infoanalysis getInfoanalysis() {
		return infoanalysis;
	}
	public void setInfoanalysis(Infoanalysis infoanalysis) {
		this.infoanalysis = infoanalysis;
	}
}
