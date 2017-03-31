package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WonderfulResult extends Result implements Serializable {

	private WonderfulData data;

	@Override
	public String toString() {
		return "WonderfulResult [data=" + data + "]";
	}

	public WonderfulData getData() {
		return data;
	}

	public void setData(WonderfulData data) {
		this.data = data;
	}

}
