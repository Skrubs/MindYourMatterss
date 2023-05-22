package features.satisfactionFeatures;

import Benefits.Satisfaction;

public class Recognition extends Satisfaction {
	
	private String awardsDecoration = "Awards/Decorations";
	private String wearOfUniform = "Wear of the uniform";
	
	public Recognition() {
		super("Recognition", 2);
		init();
	}
	
	private void init() {
		benefits.add(awardsDecoration);
		benefits.add(wearOfUniform);
	}

	public String getAwardsDecoration() {
		return awardsDecoration;
	}

	public void setAwardsDecoration(String awardsDecoration) {
		this.awardsDecoration = awardsDecoration;
	}

	public String getWearOfUniform() {
		return wearOfUniform;
	}

	public void setWearOfUniform(String wearOfUniform) {
		this.wearOfUniform = wearOfUniform;
	}

}
