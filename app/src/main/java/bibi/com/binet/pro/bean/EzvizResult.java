package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EzvizResult extends Result implements Serializable {

	private EzvizData data;

	@Override
	public String toString() {
		return "EzvizResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public EzvizData getData() {
		return data;
	}

	public void setData(EzvizData data) {
		this.data = data;
	}

}
