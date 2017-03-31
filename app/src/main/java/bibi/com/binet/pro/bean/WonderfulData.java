package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class WonderfulData implements Serializable {

	private boolean hasMore;
	private List<WonderfulInfo> notice;

	@Override
	public String toString() {
		return "WonderfulData [hasMore=" + hasMore + ",  notice=" + notice
				+ "]";
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<WonderfulInfo> getNotice() {
		return notice;
	}

	public void setNotice(List<WonderfulInfo> notice) {
		this.notice = notice;
	}

}
