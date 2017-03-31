package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentNumData implements Serializable {

	private int num;

	@Override
	public String toString() {
		return "CommentNumData [num=" + num + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
