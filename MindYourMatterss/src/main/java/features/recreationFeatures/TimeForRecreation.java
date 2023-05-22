package features.recreationFeatures;

import Benefits.Recreation;

public class TimeForRecreation extends Recreation {

	private String averageWork = "Average 40-45 hours work week";
	private String daysOfPaidtime = "30 Days of paid time off(PTO) annually";
	private String extraTime = "Extra time off";
	
	public TimeForRecreation() {
		super("Time for Recreation", 3);
		init();
	}
	
	private void init() {
		benefits.add(averageWork);
		benefits.add(daysOfPaidtime);
		benefits.add(extraTime);
	}

	public String getAverageWork() {
		return averageWork;
	}

	public void setAverageWork(String averageWork) {
		this.averageWork = averageWork;
	}

	public String getDaysOfPaidtime() {
		return daysOfPaidtime;
	}

	public void setDaysOfPaidtime(String daysOfPaidtime) {
		this.daysOfPaidtime = daysOfPaidtime;
	}

	public String getExtraTime() {
		return extraTime;
	}

	public void setExtraTime(String extraTime) {
		this.extraTime = extraTime;
	}
	
	

}
