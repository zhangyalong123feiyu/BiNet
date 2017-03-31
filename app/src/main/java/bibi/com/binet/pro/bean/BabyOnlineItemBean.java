package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class BabyOnlineItemBean implements Serializable {

	private int id, clazzid;
	private String title, camera_id, img_uri;

	public BabyOnlineItemBean() {
		
	}

	public BabyOnlineItemBean(int id, String title, String camera_id) {
		this.id = id;
		this.clazzid = id;
		this.title = title;
		this.camera_id = camera_id;
	}

	public BabyOnlineItemBean(int id, String title, String camera_id, String img_uri) {
		this.id = id;
		this.clazzid = id;
		this.title = title;
		this.camera_id = camera_id;
		this.img_uri = img_uri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClazzid() {
		return clazzid;
	}

	public void setClazzid(int clazzid) {
		this.clazzid = clazzid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCamera_id() {
		return camera_id;
	}

	public void setCamera_id(String camera_id) {
		this.camera_id = camera_id;
	}

	public String getImg_uri() {
		return img_uri;
	}

	public void setImg_uri(String img_uri) {
		this.img_uri = img_uri;
	}

	public void addBabyname(String babyName) {
		title = title + "  " + babyName;
	}

}
