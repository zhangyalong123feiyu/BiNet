package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class KnowledgeInfo implements Serializable {

	private int id, type = 0;
	private String title, url, picUrl, description;
	private long createTime, updateTime;

	@Override
	public String toString() {
		return "KnowledgeInfo [id=" + id + ", type=" + type + ", title="
				+ title + ", url=" + url + ", picUrl=" + picUrl
				+ ", description=" + description + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
