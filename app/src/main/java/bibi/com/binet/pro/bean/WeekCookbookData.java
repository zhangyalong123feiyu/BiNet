package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class WeekCookbookData implements Serializable {

	private WeekCook weekCook;

	@Override
	public String toString() {
		return "WeekCookbookData [weekCook=" + weekCook + "]";
	}

	public WeekCook getWeekCook() {
		return weekCook;
	}

	public void setWeekCook(WeekCook weekCook) {
		this.weekCook = weekCook;
	}

}
