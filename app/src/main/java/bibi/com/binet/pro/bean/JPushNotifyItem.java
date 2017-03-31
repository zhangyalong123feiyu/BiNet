package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class JPushNotifyItem implements Serializable {

	//tpye 1-��ȫ���� 2-�༶֪ͨ 3-ѧУ���� 201-����֪ͨ
	private int userid, type;
	private String msgContent, msgTitle;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

}
