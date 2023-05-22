package Benefits;

import java.util.ArrayList;

public class Training {
	
	
	protected ArrayList<String> benefits = new ArrayList<>();
	protected int numOfBenefits;
	public static String entitlementName = "Training";
	protected String featureName;
	
	public Training(String featureName, int numOfBenefits) {
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
		Training.entitlementName = entitlementName;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	

}
