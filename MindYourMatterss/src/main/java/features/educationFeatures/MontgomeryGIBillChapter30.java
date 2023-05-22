package features.educationFeatures;

import Benefits.Education;

public class MontgomeryGIBillChapter30 extends Education{

	protected String tuitionAmountPaid = "Tuition amount paid to member";
	protected String topUp = "Top Up";
	
	public MontgomeryGIBillChapter30() {
		super("Montgomery GI Bill Chapter 30", 2);
		init();
	}
	
	private void init() {
		benefits.add(topUp);
		benefits.add(tuitionAmountPaid);
	}

	public String getTuitionAmountPaid() {
		return tuitionAmountPaid;
	}

	public void setTuitionAmountPaid(String tuitionAmountPaid) {
		this.tuitionAmountPaid = tuitionAmountPaid;
	}

	public String getTopUp() {
		return topUp;
	}

	public void setTopUp(String topUp) {
		this.topUp = topUp;
	}
	
	

}
