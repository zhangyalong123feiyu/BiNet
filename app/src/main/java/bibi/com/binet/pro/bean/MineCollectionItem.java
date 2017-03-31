package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class MineCollectionItem implements Serializable {

	private String time, who;
	private List<String> images;

	public MineCollectionItem() {
		// TODO Auto-generated constructor stub
	}

	public MineCollectionItem(String time, String who, List<String> images) {
		this.time = time;
		this.who = who;
		this.images = images;
	}

	@Override
	public String toString() {
		return "MineCollectionItem [time=" + time + ", who=" + who + ", images=" + images + "]";
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

}
