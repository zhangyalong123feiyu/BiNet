package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CardInfo implements Serializable {

	private int state;
	private String createTime, schoolId, headImgUrl, cardNo, name, time, cardTime;

	@Override
	public String toString() {
		return "CardInfo [createTime=" + createTime + ", schoolId=" + schoolId + ", headImgUrl=" + headImgUrl + ", cardNo=" + cardNo + ", name=" + name + ", time=" + time + ", cardTime=" + cardTime + ", state=" + state + "]";
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCardTime() {
		return cardTime;
	}

	public void setCardTime(String cardTime) {
		this.cardTime = cardTime;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
