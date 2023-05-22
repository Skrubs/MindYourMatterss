package features.travelFeatures;

import Benefits.Travel;

public class PermanentChangeOfDutyStation extends Travel{

	
	private String basesUSOverseas = "Bases in the U.S. and Overseas";
	private String relocationPaid = "Authorized relocation expenses paid by the USAF";
	
	public PermanentChangeOfDutyStation() {
		super("Permanent Change Of Duty Station", 2);
		init();
	}
	
	private void init() {
		benefits.add(basesUSOverseas);
		benefits.add(relocationPaid);
	}

	public String getBasesUSOverseas() {
		return basesUSOverseas;
	}

	public void setBasesUSOverseas(String basesUSOverseas) {
		this.basesUSOverseas = basesUSOverseas;
	}

	public String getRelocationPaid() {
		return relocationPaid;
	}

	public void setRelocationPaid(String relocationPaid) {
		this.relocationPaid = relocationPaid;
	}
	
	

}
