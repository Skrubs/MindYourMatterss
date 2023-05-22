package features.recreationFeatures;

import Benefits.Recreation;

public class PhysicalRecreation extends Recreation {
	
	
	private String intramuralSports = "Intramural sports available";
	private String fitnessGym = "Fitness/Gym facility available for free";

	public PhysicalRecreation() {
		super("Physical Recreation", 3);
		init();
	}
	
	private void init() {
		benefits.add(fitnessGym);
		benefits.add(intramuralSports);
	}

	public String getIntramuralSports() {
		return intramuralSports;
	}

	public void setIntramuralSports(String intramuralSports) {
		this.intramuralSports = intramuralSports;
	}

	public String getFitnessGym() {
		return fitnessGym;
	}

	public void setFitnessGym(String fitnessGym) {
		this.fitnessGym = fitnessGym;
	}
	
	

}
