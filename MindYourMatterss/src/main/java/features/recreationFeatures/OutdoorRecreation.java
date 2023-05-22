package features.recreationFeatures;

import Benefits.Recreation;

public class OutdoorRecreation extends Recreation {

	
	private String reducedRate = "Reduced rate recreation areas owned or leased by AF";
	private String qualityEquipment = "Quality equipment rentals at low cost";
	
	public OutdoorRecreation() {
		super("Outdoor Recreation", 2);
		init();
	}
	
	private void init() {
		benefits.add(qualityEquipment);
		benefits.add(reducedRate);
	}

	public String getReducedRate() {
		return reducedRate;
	}

	public void setReducedRate(String reducedRate) {
		this.reducedRate = reducedRate;
	}

	public String getQualityEquipment() {
		return qualityEquipment;
	}

	public void setQualityEquipment(String qualityEquipment) {
		this.qualityEquipment = qualityEquipment;
	}
	
	

}
