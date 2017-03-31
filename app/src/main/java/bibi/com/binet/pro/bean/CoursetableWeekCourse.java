package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CoursetableWeekCourse implements Serializable {

	private CoursetableDayCourse Monday, Tuesday, Wednesday, Thursday, Friday;

	@Override
	public String toString() {
		return "CoursetableWeekCourse [Monday=" + Monday + ", Tuesday=" + Tuesday + ", Wednesday=" + Wednesday
				+ ", Thursday=" + Thursday + ", Friday=" + Friday + "]";
	}

	public CoursetableDayCourse getMonday() {
		return Monday;
	}

	public void setMonday(CoursetableDayCourse monday) {
		Monday = monday;
	}

	public CoursetableDayCourse getTuesday() {
		return Tuesday;
	}

	public void setTuesday(CoursetableDayCourse tuesday) {
		Tuesday = tuesday;
	}

	public CoursetableDayCourse getWednesday() {
		return Wednesday;
	}

	public void setWednesday(CoursetableDayCourse wednesday) {
		Wednesday = wednesday;
	}

	public CoursetableDayCourse getThursday() {
		return Thursday;
	}

	public void setThursday(CoursetableDayCourse thursday) {
		Thursday = thursday;
	}

	public CoursetableDayCourse getFriday() {
		return Friday;
	}

	public void setFriday(CoursetableDayCourse friday) {
		Friday = friday;
	}

}
