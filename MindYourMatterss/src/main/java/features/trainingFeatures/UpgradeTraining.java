package features.trainingFeatures;

import Benefits.Training;

public class UpgradeTraining extends Training {

	protected String OJTAvailable = "OJT available in all careers";
	protected String AllCareerRequirements = "All career requirements funded by AF";
	
	public UpgradeTraining(){
		super("Upgrade Training", 2);
		init();
	}
	
	private void init() {
		benefits.add(OJTAvailable);
		benefits.add(AllCareerRequirements);
	}

	public String getOJTAvailable() {
		return OJTAvailable;
	}

	public void setOJTAvailable(String oJTAvailable) {
		OJTAvailable = oJTAvailable;
	}

	public String getAllCareerRequirements() {
		return AllCareerRequirements;
	}

	public void setAllCareerRequirements(String allCareerRequirements) {
		AllCareerRequirements = allCareerRequirements;
	}
	
	

}
