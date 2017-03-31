package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class SchoolDetailResult extends Result implements Serializable {

	private SchoolDetailData data;

	@Override
	public String toString() {
		return "SchoolDetailResult [data=" + data + "]";
	}

	public SchoolDetailData getData() {
		return data;
	}

	public void setData(SchoolDetailData data) {
		this.data = data;
	}

}
