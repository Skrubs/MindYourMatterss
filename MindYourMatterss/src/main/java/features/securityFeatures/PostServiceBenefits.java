package features.securityFeatures;

import Benefits.Security;

public class PostServiceBenefits extends Security {

	private String blended = "Blended Retirement System";
	private String legacy = "Legacy Retirement(Prior Service Only)";
	
	public PostServiceBenefits() {
		super("Post Service Benefits", 2);
		init();
	}
	
	private void init() {
		benefits.add(blended);
		benefits.add(legacy);
	}

	public String getBlended() {
		return blended;
	}

	public void setBlended(String blended) {
		this.blended = blended;
	}

	public String getLegacy() {
		return legacy;
	}

	public void setLegacy(String legacy) {
		this.legacy = legacy;
	}
	
	

}
