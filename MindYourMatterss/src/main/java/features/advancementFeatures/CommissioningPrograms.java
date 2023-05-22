package features.advancementFeatures;

import Benefits.Advancement;

public class CommissioningPrograms extends Advancement{

	
	private String directPrograms = "Direct Programs";
	private String nonDirectPrograms = "Non Direct Programs";
	
	public CommissioningPrograms() {
		super("Commissioning Programs", 2);
		init();
	}
	
	private void init() {
		benefits.add(directPrograms);
		benefits.add(nonDirectPrograms);
	}

	public String getDirectPrograms() {
		return directPrograms;
	}

	public void setDirectPrograms(String directPrograms) {
		this.directPrograms = directPrograms;
	}

	public String getNonDirectPrograms() {
		return nonDirectPrograms;
	}

	public void setNonDirectPrograms(String nonDirectPrograms) {
		this.nonDirectPrograms = nonDirectPrograms;
	}
	
	

}
