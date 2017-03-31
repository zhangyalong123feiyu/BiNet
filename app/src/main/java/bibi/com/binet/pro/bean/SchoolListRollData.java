package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class SchoolListRollData implements Serializable {

	private String id, name;
	private SchoolPosterUrl imgUrl;

	@Override
	public String toString() {
		return "SchoolListRollData [id=" + id + ", name=" + name + ", imgUrl=" + imgUrl + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SchoolPosterUrl getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(SchoolPosterUrl imgUrl) {
		this.imgUrl = imgUrl;
	}

}
