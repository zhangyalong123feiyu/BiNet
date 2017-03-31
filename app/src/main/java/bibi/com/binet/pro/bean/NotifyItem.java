package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class NotifyItem implements Serializable {

	private int id, typeRes;
	private String url, imageurl, title, res, time, content;

	public NotifyItem() {
		// TODO Auto-generated constructor stub
	}

	public NotifyItem(int id, String url, String imageurl, String title, String res, int typeRes, String time,
					  String content) {
		this.id = id;
		this.url = url;
		this.imageurl = imageurl;
		this.title = title;
		this.res = res;
		this.typeRes = typeRes;
		this.time = time;
		this.content = content;
	}

	@Override
	public String toString() {
		return "NotifyItem [id=" + id + ", typeRes=" + typeRes + ", url=" + url + ", imageurl=" + imageurl + ", title="
				+ title + ", res=" + res + ", time=" + time + ", content=" + content + "]";
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

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public int getTypeRes() {
		return typeRes;
	}

	public void setTypeRes(int typeRes) {
		this.typeRes = typeRes;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
