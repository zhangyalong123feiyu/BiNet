package bibi.com.binet.pro.bean;

import java.io.Serializable;

/**
 * 
 * json�����ĸ��࣬�Ǹ������࣬���е�json������ʵ���඼����̳�����ࡣ
 * 
 * @author LiYiMing
 * 
 */
public class Result implements Serializable {

	private HeadResult head;

	@Override
	public String toString() {
		return "Result [head=" + head + "]";
	}

	public HeadResult getHead() {
		return head;
	}

	public void setHead(HeadResult head) {
		this.head = head;
	}

}