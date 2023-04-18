package features;

import java.util.ArrayList;

import Benefits.Money;

public class MonthlyIncome extends Money {
	
	private ArrayList<String> benefits = new ArrayList<>();
	private String featureName = "Monthly Income";
	private String basePay = "Base Pay";
	private String bah = "Basic Allowance for Housing";
	private String bas = "Basic Allowance for Substatence";
	private String drillPay = "Drill Pay";
	private int numOfBenefits = 4;

	public MonthlyIncome() {
		loadBenefits();
	}
	
	private void loadBenefits() {
		benefits.add(basePay);
		benefits.add(bah);
		benefits.add(bas);
		benefits.add(drillPay);
	}
	
	public String getFeatureName() {
		return featureName;
	}
	
	public int getNumOfBenefits() {
		return numOfBenefits;
	}
	
	public ArrayList<String> getBenefits(){
		return benefits;
	}
	
	
	
	@Override
	public String toString() {
		return "Monthly Income";
	}
}
