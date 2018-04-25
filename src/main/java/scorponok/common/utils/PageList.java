package scorponok.common.utils;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {
	private int pageNumber;
	private int objectsPerPage;
	private int total;
	private List<T> list = new ArrayList<T>();

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getObjectsPerPage() {
		return objectsPerPage;
	}

	public void setObjectsPerPage(int objectsPerPage) {
		this.objectsPerPage = objectsPerPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPages() {
		return (int) Math.ceil((double) total / objectsPerPage);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
