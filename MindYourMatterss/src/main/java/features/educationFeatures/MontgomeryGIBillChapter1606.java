package features.educationFeatures;

import Benefits.Education;

public class MontgomeryGIBillChapter1606 extends Education {

	protected String freeToMember = "Free to member after completion of technical training";
	protected String educationalCostStipend = "Educational cost stipend";
	protected String mGIBKicker = "MGIB Kicker FY Incentives";
	
	public MontgomeryGIBillChapter1606() {
		super("Montgomery GI Bill Chapter 1606", 3);
		init();
	}
	
	private void init() {
		benefits.add(educationalCostStipend);
		benefits.add(freeToMember);
		benefits.add(mGIBKicker);
	}

	public String getFreeToMember() {
		return freeToMember;
	}

	public void setFreeToMember(String freeToMember) {
		this.freeToMember = freeToMember;
	}

	public String getEducationalCostStipend() {
		return educationalCostStipend;
	}

	public void setEducationalCostStipend(String educationalCostStipend) {
		this.educationalCostStipend = educationalCostStipend;
	}

	public String getmGIBKicker() {
		return mGIBKicker;
	}

	public void setmGIBKicker(String mGIBKicker) {
		this.mGIBKicker = mGIBKicker;
	}
	
	

}
