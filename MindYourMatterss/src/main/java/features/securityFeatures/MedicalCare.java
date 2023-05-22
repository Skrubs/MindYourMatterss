package features.securityFeatures;

import Benefits.Security;

public class MedicalCare extends Security{
	
	private String freeLowCostMedical = "Free or low cost medical insurance";
	private String FreeLowCostDental = "Free or low cost dental insurance for self/family";

	public MedicalCare() {
		super("Mecial Care", 2);
		init();
	}
	
	private void init() {
		benefits.add(FreeLowCostDental);
		benefits.add(freeLowCostMedical);
	}

	public String getFreeLowCostMedical() {
		return freeLowCostMedical;
	}

	public void setFreeLowCostMedical(String freeLowCostMedical) {
		this.freeLowCostMedical = freeLowCostMedical;
	}

	public String getFreeLowCostDental() {
		return FreeLowCostDental;
	}

	public void setFreeLowCostDental(String freeLowCostDental) {
		FreeLowCostDental = freeLowCostDental;
	}
	
	

}
