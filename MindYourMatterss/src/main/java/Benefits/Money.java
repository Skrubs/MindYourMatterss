package Benefits;

import java.util.ArrayList;

import features.MoneyFeatures.MembershipPerks;
import features.MoneyFeatures.MonthlyIncome;
import features.MoneyFeatures.PayIncreases;

public abstract class Money {
	
	protected ArrayList<String> benefits = new ArrayList<>();
	protected int numOfBenefits;
	public static String entitlementName = "Money";
	protected String featureName;

	
	
	public Money(String featureName, int numOfBenefits) {
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
		Money.entitlementName = entitlementName;
	}



	public String getFeatureName() {
		return featureName;
	}



	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	
	


	
	


	

	
	

}
