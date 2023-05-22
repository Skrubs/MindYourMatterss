package features.educationFeatures;

import Benefits.Education;

public class ClepAndDantes extends Education {

	protected String testOut = "Test out of college course at no cost";
	
	public ClepAndDantes() {
		super("CLEP and DANTES", 1);
		init();
	}
	
	public String getTestOut() {
		return testOut;
	}

	public void setTestOut(String testOut) {
		this.testOut = testOut;
	}

	private void init() {
		benefits.add(testOut);
	}

}
