package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class CardListData implements Serializable {

	private List<CardInfo> tempSchoolId;

	@Override
	public String toString() {
		return "CardListData [tempSchoolId=" + tempSchoolId + "]";
	}

	public List<CardInfo> getTempSchoolId() {
		return tempSchoolId;
	}

	public void setTempSchoolId(List<CardInfo> tempSchoolId) {
		this.tempSchoolId = tempSchoolId;
	}
	
}
