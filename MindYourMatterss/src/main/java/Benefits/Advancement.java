package Benefits;

import java.util.ArrayList;

public abstract class Advancement {
	
	
	
	protected ArrayList<String> benefits = new ArrayList<>();
	protected int numOfBenefits;
	public static String entitlementName = "Advancement";
	protected String featureName;
	
	public Advancement(String featureName, int numOfBenefits) {
		this.featureName = featureName;
		this.numOfBenefits = numOfBenefits;
		
	}

	public ArrayList<String> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<String> benefits) {
		this.benefits = benefits;
	}

	public int getNumOfBenefits() {
		return numOfBenefits;
	}

	public void setNumOfBenefits(int numOfBenefits) {
		this.numOfBenefits = numOfBenefits;
	}

	public static String getEntitlementName() {
		return entitlementName;
	}

	public static void setEntitlementName(String entitlementName) {
		Advancement.entitlementName = entitlementName;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	

}
