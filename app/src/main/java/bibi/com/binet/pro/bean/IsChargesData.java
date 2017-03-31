package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class IsChargesData implements Serializable {

	private int type; // 1 is charges, 2 is not_charges

	@Override
	public String toString() {
		return "IsChargesData [type=" + type + "]";
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
