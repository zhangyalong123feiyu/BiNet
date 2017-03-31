package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class SchoolListData implements Serializable {

	private List<SchoolDetailData> school;
	private List<SchoolListRollData> rollData;

	@Override
	public String toString() {
		return "SchoolListData [school=" + school + ", rollData=" + rollData + "]";
	}

	public List<SchoolDetailData> getSchool() {
		return school;
	}

	public void setSchool(List<SchoolDetailData> school) {
		this.school = school;
	}

	public List<SchoolListRollData> getRollData() {
		return rollData;
	}

	public void setRollData(List<SchoolListRollData> rollData) {
		this.rollData = rollData;
	}

}
