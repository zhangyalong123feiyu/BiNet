package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WonderfulInfo implements Serializable, Comparable<WonderfulInfo> {

	private int id, classId;
	private long createTime;
	private String img, picUrl, title, className, schoolId, schoolName, description;

	@Override
	public String toString() {
		return "WonderfulInfo [id=" + id + ", classId=" + classId + ", createTime=" + createTime + ", img=" + img
				+ ", picUrl=" + picUrl + ", title=" + title + ", className=" + className + ", schoolId=" + schoolId
				+ ", schoolName=" + schoolName + ", description=" + description + "]";
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

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int compareTo(WonderfulInfo another) {
		// TODO Auto-generated method stub
		if (createTime < another.createTime) {
			return -1;
		} else if (createTime > another.createTime) {
			return 1;
		} else {
			return 0;
		}
	}

}
