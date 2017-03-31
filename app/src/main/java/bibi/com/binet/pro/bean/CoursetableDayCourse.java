package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class CoursetableDayCourse implements Serializable {

	private List<CoursetableCourseInfo> am, pm;

	@Override
	public String toString() {
		return "CoursetableCourseInfo [am=" + am + ", pm=" + pm + "]";
	}

	public List<CoursetableCourseInfo> getAm() {
		return am;
	}

	public void setAm(List<CoursetableCourseInfo> am) {
		this.am = am;
	}

	public List<CoursetableCourseInfo> getPm() {
		return pm;
	}

	public void setPm(List<CoursetableCourseInfo> pm) {
		this.pm = pm;
	}

}
