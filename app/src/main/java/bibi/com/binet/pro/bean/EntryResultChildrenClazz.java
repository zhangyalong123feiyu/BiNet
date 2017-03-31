package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResultChildrenClazz implements Serializable {

	private String id, name;

	@Override
	public String toString() {
		return "EntryResultChildrenClazz [id=" + id + ", name=" + name + "]";
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

}
