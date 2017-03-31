package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class KnowledgeBean implements Serializable {

	int id;
	String url, imageurl, title, content, time, type, commentNum;

	public KnowledgeBean() {
		// TODO Auto-generated constructor stub
	}

	public KnowledgeBean(int id, String url, String imageurl, String title, String content, String time, String type) {
		this.id = id;
		this.url = url;
		this.imageurl = imageurl;
		this.title = title;
		this.content = content;
		this.time = time;
		this.type = type;
	}

	public KnowledgeBean(int id, String url, String imageurl, String title, String content, String time, String type, String commentNum) {
		this.id = id;
		this.url = url;
		this.imageurl = imageurl;
		this.title = title;
		this.content = content;
		this.time = time;
		this.type = type;
		this.commentNum = commentNum;
	}

	@Override
	public String toString() {
		return "ParentingBean [id=" + id + ", url=" + url + ", imageurl=" + imageurl + ", title=" + title + ", content=" + content + ", time=" + time + ", type=" + type + ", commentNum=" + commentNum + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(String commentNum) {
		this.commentNum = commentNum;
	}

}
