package features.advancementFeatures;

import Benefits.Advancement;

public class Promotions extends Advancement {
	
	
	private String airmanTier = "Airman Tier";
	private String ncoTier = "Non-Commissioned Officer Tier(NCO)";
	private String sNcoTier = "Senior Non-Commissioned Officer Tier(SNCO)";
	

	public Promotions() {
		super("Promotions", 3);
		init();
	}
	
	
	private void init() {
		benefits.add(airmanTier);
		benefits.add(ncoTier);
		benefits.add(sNcoTier);
	}


	public String getAirmanTier() {
		return airmanTier;
	}


	public void setAirmanTier(String airmanTier) {
		this.airmanTier = airmanTier;
	}


	public String getNcoTier() {
		return ncoTier;
	}


	public void setNcoTier(String ncoTier) {
		this.ncoTier = ncoTier;
	}


	public String getsNcoTier() {
		return sNcoTier;
	}


	public void setsNcoTier(String sNcoTier) {
		this.sNcoTier = sNcoTier;
	}
	
	

}
