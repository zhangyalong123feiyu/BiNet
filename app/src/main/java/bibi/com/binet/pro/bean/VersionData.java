package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class VersionData implements Serializable {

	private String url, changes;
	private long size;
	private int state;

	@Override
	public String toString() {
		return "VersionData [url=" + url + ", changes=" + changes + ", size=" + size + ", state=" + state + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getChanges() {
		return changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
