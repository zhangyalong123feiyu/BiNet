package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentAddResult extends Result implements Serializable {

	private CommentAddData data;

	@Override
	public String toString() {
		return "CommentAddResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public CommentAddData getData() {
		return data;
	}

	public void setData(CommentAddData data) {
		this.data = data;
	}
	
}
