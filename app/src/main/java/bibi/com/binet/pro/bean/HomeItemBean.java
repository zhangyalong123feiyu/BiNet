package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class HomeItemBean implements Serializable {

	private int id = -1;
	private String kindergarten, imageurl = "", babyname;

	public HomeItemBean() {
		// TODO Auto-generated constructor stub
	}

	public HomeItemBean(int id, String kindergarten, String babyname) {
		this.id = id;
		this.kindergarten = kindergarten;
		this.babyname = babyname;
	}

	public HomeItemBean(int id, String kindergarten, String imageurl, String babyname) {
		this.id = id;
		this.kindergarten = kindergarten;
		this.imageurl = imageurl;
		this.babyname = babyname;
	}

	@Override
	public String toString() {
		return "HomeItemBean [id=" + id + ", kindergarten=" + kindergarten + ", imageurl=" + imageurl + ", babyname="
				+ babyname + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getBabyname() {
		return babyname;
	}

	public void setBabyname(String babyname) {
		this.babyname = babyname;
	}

	public void addBabyname(String babyName) {
		babyname = babyname + "  " + babyName;
	}

}
