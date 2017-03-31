package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentNumResult extends Result implements Serializable {

	private CommentNumData data;

	@Override
	public String toString() {
		return "CommentNumResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public CommentNumData getData() {
		return data;
	}

	public void setData(CommentNumData data) {
		this.data = data;
	}

}
