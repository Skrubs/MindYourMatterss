package features.advancementFeatures;

import Benefits.Advancement;

public class ProfessionalDevelopment extends Advancement {

	
	private String professionalMilitaryEducation = "Professional Military Education(PME)";
	
	public ProfessionalDevelopment() {
		super("Professional Developement", 1);
		init();
	}
	
	private void init() {
		benefits.add(professionalMilitaryEducation);
	}

	public String getProfessionalMilitaryEducation() {
		return professionalMilitaryEducation;
	}

	public void setProfessionalMilitaryEducation(String professionalMilitaryEducation) {
		this.professionalMilitaryEducation = professionalMilitaryEducation;
	}
	
	

}
