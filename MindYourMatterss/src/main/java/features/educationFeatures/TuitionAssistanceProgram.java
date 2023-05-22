package features.educationFeatures;

import Benefits.Education;

public class TuitionAssistanceProgram extends Education {

	protected String upTo100 = "Up to 100% Tuition Assistance annually ($4,500 max) (ADAF/Reserve";
	protected String angState = "ANG state determines tuition";
	
	public TuitionAssistanceProgram() {
		super("Tuition Assistance Program", 2);
		init();
	}
	
	private void init() {
		benefits.add(angState);
		benefits.add(upTo100);
	}

	public String getUpTo100() {
		return upTo100;
	}

	public void setUpTo100(String upTo100) {
		this.upTo100 = upTo100;
	}

	public String getAngState() {
		return angState;
	}

	public void setAngState(String angState) {
		this.angState = angState;
	}
	
	

}
