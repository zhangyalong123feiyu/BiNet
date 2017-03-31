package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class AnnoumentInfo implements Serializable {

	private int id, schoolId;
	private String title, content, url, picUrl;
	private long annmentTime;

	@Override
	public String toString() {
		return "AnnoumentInfo [id=" + id + ", schoolId=" + schoolId + ", title=" + title + ", content=" + content
				+ ", url=" + url + ", picUrl=" + picUrl + ", annmentTime=" + annmentTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public long getAnnmentTime() {
		return annmentTime;
	}

	public void setAnnmentTime(long annmentTime) {
		this.annmentTime = annmentTime;
	}

}
