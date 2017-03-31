package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class WeekCookInfo implements Serializable {

	private int id, name;
	private String desc;
	private WeekCookPic pic;
	private List<WeekCookInfo2> cooks;

	@Override
	public String toString() {
		return "WeekCookInfo [id=" + id + ", name=" + name + ", desc=" + desc + ", pic=" + pic + ", cooks=" + cooks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
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

	public List<WeekCookInfo2> getCooks() {
		return cooks;
	}

	public void setCooks(List<WeekCookInfo2> cooks) {
		this.cooks = cooks;
	}

}
