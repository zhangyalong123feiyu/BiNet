package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CoursetableData implements Serializable {

	private CoursetableWeekCourse weekCourse;

	@Override
	public String toString() {
		return "CoursetableData [weekCourse=" + weekCourse + "]";
	}

	public CoursetableWeekCourse getWeekCourse() {
		return weekCourse;
	}

	public void setWeekCourse(CoursetableWeekCourse weekCourse) {
		this.weekCourse = weekCourse;
	}
	
}
