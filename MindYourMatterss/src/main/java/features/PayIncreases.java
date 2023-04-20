package features;

import java.util.ArrayList;

import Benefits.Money;

public class PayIncreases extends Money{
	
	
	private String featureName = "Pay Increases";
	private String annualCostOfLivingIncrease = "Annual Cost of living increase";
	private String promotionIncreases = "Promotion Increase";
	private String timeInServiceIncrease = "Time In Service increase";
	private int numOfBenefits = 3;
	private ArrayList<String> benefits = new ArrayList<>();
	
	public PayIncreases() {
		init();
	}
	
	public void init() {
		benefits.add(annualCostOfLivingIncrease);
		benefits.add(promotionIncreases);
		benefits.add(timeInServiceIncrease);
	}
	
	
	public ArrayList<String> getBenefits(){
		return benefits;
	}
	
	public int getNumOfBenefits() {
		return numOfBenefits;
	}
	
	public String getFeatureName() {
		return featureName;
	}
	
	

}
