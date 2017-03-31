package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class BabyLoc_CurrentPosition_AllBaby_Item implements Serializable {

	private String imageUrl, babyname, loc, batterytxt;

	public BabyLoc_CurrentPosition_AllBaby_Item() {
		// TODO Auto-generated constructor stub
	}

	public BabyLoc_CurrentPosition_AllBaby_Item(String imageUrl, String babyname, String loc, String batterytxt) {
		this.imageUrl = imageUrl;
		this.babyname = babyname;
		this.loc = loc;
		this.batterytxt = batterytxt;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getBabyname() {
		return babyname;
	}

	public void setBabyname(String babyname) {
		this.babyname = babyname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getBatterytxt() {
		return batterytxt;
	}

	public void setBatterytxt(String batterytxt) {
		this.batterytxt = batterytxt;
	}

	@Override
	public String toString() {
		return "BabyLoc_CurrentPosition_AllBaby_Item [imageUrl=" + imageUrl + ", babyname=" + babyname + ", loc=" + loc
				+ ", batterytxt=" + batterytxt + "]";
	}

}
