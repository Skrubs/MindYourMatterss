package features.educationFeatures;

import Benefits.Education;

public class AfCoolProgram extends Education {

	
	protected String unlimitedCertifications = "Unlimited certifications up to $4,500";
	
	public AfCoolProgram() {
		super("AF COOL Program", 1);
		init();
	}
	
	private void init() {
		benefits.add(unlimitedCertifications);
	}

	public String getUnlimitedCertifications() {
		return unlimitedCertifications;
	}

	public void setUnlimitedCertifications(String unlimitedCertifications) {
		this.unlimitedCertifications = unlimitedCertifications;
	}
	
	

}
