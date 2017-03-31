package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class KnowledgeResult extends Result implements Serializable {

	private KnowledgeData data;

	@Override
	public String toString() {
		return "KnowledgeResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public KnowledgeData getData() {
		return data;
	}

	public void setData(KnowledgeData data) {
		this.data = data;
	}

}
