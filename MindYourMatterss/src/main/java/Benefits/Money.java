package Benefits;

import java.util.ArrayList;

public abstract class Money {
	
	
	protected ArrayList<String> benefits;
	protected String entitlementName = "Money";
	protected String featureName;
	protected int numOfBenefits;
	
	public Money(String featureName, int numOfBenefits) {
		this.featureName = featureName;
		this.numOfBenefits = numOfBenefits;
		benefits = new ArrayList<>();
	}
	
	public int getNumOfBenefits() {
		return numOfBenefits;
	}

	public void setNumOfBenefits(int numOfBenefits) {
		this.numOfBenefits = numOfBenefits;
	}

	public String getEntitlementName() {
		return entitlementName;
	}

	public ArrayList<String> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<String> benefits) {
		this.benefits = benefits;
	}

	public void setEntitlementName(String entitlementName) {
		this.entitlementName = entitlementName;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	
	
	

}
