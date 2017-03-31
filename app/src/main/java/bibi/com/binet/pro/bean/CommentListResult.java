package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentListResult extends Result implements Serializable {

	private CommentListData data;

	@Override
	public String toString() {
		return "CommentListResult [data=" + data + "]";
	}

	public CommentListData getData() {
		return data;
	}

	public void setData(CommentListData data) {
		this.data = data;
	}

}
