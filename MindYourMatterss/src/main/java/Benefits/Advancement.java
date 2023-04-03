package Benefits;

import java.util.ArrayList;

public abstract class Advancement {
	
	
	protected ArrayList<String> benefits;
	protected String featureName;
	protected String entitlementName = "Advancement";
	
	public Advancement(String featureName) {
		this.featureName = featureName;
		benefits = new ArrayList<>();
	}
	
	protected abstract void init();
	
	
	public ArrayList<String> getBenefits(){
		return benefits;
	}
	
	public String getFeatureName() {
		return featureName;
	}
	
	public String getEntitlementName() {
		return entitlementName;
	}

}
