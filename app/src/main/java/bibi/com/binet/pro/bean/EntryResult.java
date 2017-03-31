package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResult extends Result implements Serializable {

	private EntryResultData data;

	@Override
	public String toString() {
		return "EntryResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public EntryResultData getData() {
		return data;
	}

	public void setData(EntryResultData data) {
		this.data = data;
	}

}
