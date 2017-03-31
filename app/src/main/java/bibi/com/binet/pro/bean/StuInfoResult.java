package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class StuInfoResult extends Result implements Serializable {

	private StuInfoData data;

	@Override
	public String toString() {
		return "StuInfoResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public StuInfoData getData() {
		return data;
	}

	public void setData(StuInfoData data) {
		this.data = data;
	}

}
