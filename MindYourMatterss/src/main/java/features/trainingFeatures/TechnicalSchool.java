package features.trainingFeatures;

import Benefits.Training;

public class TechnicalSchool extends Training {

	protected String similarToVotech = "Similar to VO-Tech schools but free";
	protected String creditsEarnedTowardsCCAF = "Credits earned towards CCAF";
	protected String offersOver130CareerOptions = "Offers over 130+ career options";
	
	public TechnicalSchool() {
		super("Technical Training",3);
		init();
	}
	
	private void init() {
		benefits.add(similarToVotech);
		benefits.add(creditsEarnedTowardsCCAF);
		benefits.add(offersOver130CareerOptions);
	}

	public String getSimilarToVotech() {
		return similarToVotech;
	}

	public void setSimilarToVotech(String similarToVotech) {
		this.similarToVotech = similarToVotech;
	}

	public String getCreditsEarnedTowardsCCAF() {
		return creditsEarnedTowardsCCAF;
	}

	public void setCreditsEarnedTowardsCCAF(String creditsEarnedTowardsCCAF) {
		this.creditsEarnedTowardsCCAF = creditsEarnedTowardsCCAF;
	}

	public String getOffersOver130CareerOptions() {
		return offersOver130CareerOptions;
	}

	public void setOffersOver130CareerOptions(String offersOver130CareerOptions) {
		this.offersOver130CareerOptions = offersOver130CareerOptions;
	}
	
	

}
