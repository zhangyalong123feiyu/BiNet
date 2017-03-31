package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class WeekCook implements Serializable {

	private String currentWeek, startDate, endDate, firstWeek, lastWeek;
	private List<WeekCookInfo> Monday, Tuesday, Wednesday, Thursday, Friday;

	@Override
	public String toString() {
		return "WeekCook [currentWeek=" + currentWeek + ", startDate=" + startDate + ", endDate=" + endDate + ", firstWeek=" + firstWeek + ", lastWeek=" + lastWeek + ", Monday=" + Monday + ", Tuesday=" + Tuesday + ", Wednesday=" + Wednesday + ", Thursday=" + Thursday + ", Friday=" + Friday + "]";
	}

	public String getCurrentWeek() {
		return currentWeek;
	}

	public void setCurrentWeek(String currentWeek) {
		this.currentWeek = currentWeek;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFirstWeek() {
		return firstWeek;
	}

	public void setFirstWeek(String firstWeek) {
		this.firstWeek = firstWeek;
	}

	public String getLastWeek() {
		return lastWeek;
	}

	public void setLastWeek(String lastWeek) {
		this.lastWeek = lastWeek;
	}

	public List<WeekCookInfo> getMonday() {
		return Monday;
	}

	public void setMonday(List<WeekCookInfo> monday) {
		Monday = monday;
	}

	public List<WeekCookInfo> getTuesday() {
		return Tuesday;
	}

	public void setTuesday(List<WeekCookInfo> tuesday) {
		Tuesday = tuesday;
	}

	public List<WeekCookInfo> getWednesday() {
		return Wednesday;
	}

	public void setWednesday(List<WeekCookInfo> wednesday) {
		Wednesday = wednesday;
	}

	public List<WeekCookInfo> getThursday() {
		return Thursday;
	}

	public void setThursday(List<WeekCookInfo> thursday) {
		Thursday = thursday;
	}

	public List<WeekCookInfo> getFriday() {
		return Friday;
	}

	public void setFriday(List<WeekCookInfo> friday) {
		Friday = friday;
	}

	public List<WeekCookInfo> getWeekCookInfo(int i) {
		switch (i) {
		case 2:
			return Monday;
		case 3:
			return Tuesday;
		case 4:
			return Wednesday;
		case 5:
			return Thursday;
		case 6:
			return Friday;
		default:
			return null;
		}

	}

}
