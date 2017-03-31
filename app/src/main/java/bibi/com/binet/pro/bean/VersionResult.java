package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class VersionResult extends Result implements Serializable {

	private VersionData data;

	@Override
	public String toString() {
		return "Version [data=" + data + "]";
	}

	public VersionData getData() {
		return data;
	}

	public void setData(VersionData data) {
		this.data = data;
	}

}
