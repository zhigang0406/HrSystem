package scorponok.server.controller.tdclient.response;

import java.io.Serializable;

/*
 * 同盾响应类
 */
public class BodyGuardApiResponse implements Serializable {
	private static final long serialVersionUID = 4152462611121573434L;
	private Boolean success = false;
	private String id;
	private Result_Desc result_desc;
	private String reason_desc;
	private String reason_code;
	private Long tdinfoid;

	public Long getTdinfoid() {
		return tdinfoid;
	}

	public void setTdinfoid(Long tdinfoid) {
		this.tdinfoid = tdinfoid;
	}

	public String getReason_code() {
		return reason_code;
	}

	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}

	public Result_Desc getResult_desc() {
		return result_desc;
	}

	public void setResult_desc(Result_Desc result_desc) {
		this.result_desc = result_desc;
	}

	public String getReason_desc() {
		return reason_desc;
	}

	public void setReason_desc(String reason_desc) {
		this.reason_desc = reason_desc;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		if (success) {
			return "BodyGuardApiResponse [success=" + success + ", id=" + id + ", result_desc=" + result_desc + "]";
		} else {
			return "BodyGuardApiResponse [success=" + success + ", reason_code=" + reason_code + ", reason_desc="
					+ reason_desc + "]";
		}
	}
}
