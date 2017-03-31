package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResultChildrenSchool implements Serializable {

	private int id;
	private String name, estaTime;

	@Override
	public String toString() {
		return "EntryResultChildrenSchool [id=" + id + ", name=" + name + ", estaTime=" + estaTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEstaTime() {
		return estaTime;
	}

	public void setEstaTime(String estaTime) {
		this.estaTime = estaTime;
	}

}
