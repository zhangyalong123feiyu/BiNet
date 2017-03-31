package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class SchoolPosterUrl implements Serializable {

	private int height, width;
	private String url;

	@Override
	public String toString() {
		return "SchoolPosterUrl [height=" + height + ", width=" + width + ", url=" + url + "]";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
