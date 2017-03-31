package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CardListResult extends Result implements Serializable {

	private CardListData data;

	@Override
	public String toString() {
		return "CardListResult [data=" + data + ", getHead()=" + getHead() + "]";
	}

	public CardListData getData() {
		return data;
	}

	public void setData(CardListData data) {
		this.data = data;
	}
	
}
