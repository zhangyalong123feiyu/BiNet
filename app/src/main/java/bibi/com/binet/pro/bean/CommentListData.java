package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class CommentListData implements Serializable {

	private boolean hasMore;
	private List<CommentInfo> comment;

	@Override
	public String toString() {
		return "CommentListData [hasMore=" + hasMore + ", comment=" + comment + "]";
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<CommentInfo> getComment() {
		return comment;
	}

	public void setComment(List<CommentInfo> comment) {
		this.comment = comment;
	}

}
