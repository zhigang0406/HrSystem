package scorponok.server.response;

import scorponok.common.utils.PageList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BasePageListResponse<T> extends BaseResponse implements Serializable {
	private static final long serialVersionUID = -977083007216215438L;
	/**
	 * 页码
	 */
	private int pageNumber;
	/**
	 * 页面大小
	 */
	private int objectPerPage;
	/**
	 * 总数
	 */
	private int total;
	private List<T> list = new ArrayList<T>();

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getObjectPerPage() {
		return objectPerPage;
	}

	public void setObjectPerPage(int objectPerPage) {
		this.objectPerPage = objectPerPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPages() {
		return (int) Math.ceil((double) total / objectPerPage);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setData(PageList<T> pagelist) {
		this.setObjectPerPage(pagelist.getObjectsPerPage());
		this.setPageNumber(pagelist.getPageNumber());
		this.setTotal(pagelist.getTotal());
		this.setList(pagelist.getList());
	}
}
