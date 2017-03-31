package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WeekCookInfo2 implements Serializable {

	private String id, name, desc;
	private WeekCookPic pic;

	@Override
	public String toString() {
		return "WeekCookInfo2 [id=" + id + ", name=" + name + ", desc=" + desc + ", pic=" + pic + "]";
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public WeekCookPic getPic() {
		return pic;
	}

	public void setPic(WeekCookPic pic) {
		this.pic = pic;
	}

}
