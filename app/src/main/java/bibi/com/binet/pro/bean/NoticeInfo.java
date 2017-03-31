package bibi.com.binet.pro.bean;

public class NoticeInfo {

	private int id, classId;
	private String title, content, url, picUrl;
	private long noticeTime;

	@Override
	public String toString() {
		return "NoticeInfo [id=" + id + ", classId=" + classId + ", title=" + title + ", content=" + content + ", url="
				+ url + ", picUrl=" + picUrl + ", noticeTime=" + noticeTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public long getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(long noticeTime) {
		this.noticeTime = noticeTime;
	}

}
