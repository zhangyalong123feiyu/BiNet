package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class IsCameraOpenResult extends Result implements Serializable {

	private int data; // 1 is true, 2 is false 

	@Override
	public String toString() {
		return "IsCameraOpenResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
