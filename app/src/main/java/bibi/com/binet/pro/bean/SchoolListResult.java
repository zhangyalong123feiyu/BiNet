package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class SchoolListResult extends Result implements Serializable {

	private SchoolListData data;
	private String salt;

	@Override
	public String toString() {
		return "SchoolListResult [data=" + data + ", salt=" + salt + "]";
	}

	public SchoolListData getData() {
		return data;
	}

	public void setData(SchoolListData data) {
		this.data = data;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
