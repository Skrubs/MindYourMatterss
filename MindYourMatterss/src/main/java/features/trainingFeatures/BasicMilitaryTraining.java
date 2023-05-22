package features.trainingFeatures;

import Benefits.Training;

public class BasicMilitaryTraining extends Training{
	
	protected String earn4SemesterHours = "Earn 4 semester hours toward CCAF degree";
	protected String providesFoundation = "Provides foundation for AF";
	protected String instillsIndependence = "Instills Independence, discipline, and confidence";
	

	public BasicMilitaryTraining() {
		super("Basic Military Training", 3);
		init();
	}

	private void init() {
		benefits.add(earn4SemesterHours);
		benefits.add(providesFoundation);
		benefits.add(instillsIndependence);
	}

	public String getEarn4SemesterHours() {
		return earn4SemesterHours;
	}


	public void setEarn4SemesterHours(String earn4SemesterHours) {
		this.earn4SemesterHours = earn4SemesterHours;
	}


	public String getProvidesFoundation() {
		return providesFoundation;
	}


	public void setProvidesFoundation(String providesFoundation) {
		this.providesFoundation = providesFoundation;
	}


	public String getInstillsIndependence() {
		return instillsIndependence;
	}


	public void setInstillsIndependence(String instillsIndependence) {
		this.instillsIndependence = instillsIndependence;
	}
	
	
	
	

}
