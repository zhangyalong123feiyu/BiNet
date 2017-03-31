package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WeekCookPic implements Serializable {

	private String height, width, url;

	@Override
	public String toString() {
		return "WeekCookPic [height=" + height + ", width=" + width + ", url=" + url + "]";
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
