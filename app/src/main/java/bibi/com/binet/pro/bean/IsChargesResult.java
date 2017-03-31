package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class IsChargesResult extends Result implements Serializable {

	private IsChargesData data; // 1 is charges, 2 is not_charges

	@Override
	public String toString() {
		return "IsChargesResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public IsChargesData getData() {
		return data;
	}

	public void setData(IsChargesData data) {
		this.data = data;
	}

}
