package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CoursetableCourseInfo implements Serializable, Comparable<CoursetableCourseInfo> {

	private int time, num;
	private String name, className;

	@Override
	public String toString() {
		return "CoursetableCourseInfo [time=" + time + ", num=" + num + ", name=" + name + ", className=" + className
				+ "]";
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public int compareTo(CoursetableCourseInfo another) {
		// TODO Auto-generated method stub
		if (num < another.num) {
			return -1;
		} else if (num > another.num) {
			return 1;
		} else {
			return 0;
		}
	}

}
