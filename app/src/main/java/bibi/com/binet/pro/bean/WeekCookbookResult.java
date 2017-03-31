package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WeekCookbookResult extends Result implements Serializable {

	private WeekCookbookData data;

	@Override
	public String toString() {
		return "WeekCookbookResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public WeekCookbookData getData() {
		return data;
	}

	public void setData(WeekCookbookData data) {
		this.data = data;
	}
	
}
