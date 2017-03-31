package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CoursetableResult extends Result implements Serializable {

	private CoursetableData data;

	@Override
	public String toString() {
		return "CoursetableResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public CoursetableData getData() {
		return data;
	}

	public void setData(CoursetableData data) {
		this.data = data;
	}

}
