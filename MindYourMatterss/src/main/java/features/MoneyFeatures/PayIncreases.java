package features.MoneyFeatures;

import java.util.ArrayList;

import Benefits.Money;

public class PayIncreases extends Money{
	
	
	
	private String annualCostOfLivingIncrease = "Annual Cost of living increase";
	private String promotionIncreases = "Promotion Increase";
	private String timeInServiceIncrease = "Time In Service increase";
	
	
	
	public PayIncreases() {
		super("Pay Increases", 3);
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

	public String getAnnualCostOfLivingIncrease() {
		return annualCostOfLivingIncrease;
	}

	public void setAnnualCostOfLivingIncrease(String annualCostOfLivingIncrease) {
		this.annualCostOfLivingIncrease = annualCostOfLivingIncrease;
	}

	public String getPromotionIncreases() {
		return promotionIncreases;
	}

	public void setPromotionIncreases(String promotionIncreases) {
		this.promotionIncreases = promotionIncreases;
	}

	public String getTimeInServiceIncrease() {
		return timeInServiceIncrease;
	}

	public void setTimeInServiceIncrease(String timeInServiceIncrease) {
		this.timeInServiceIncrease = timeInServiceIncrease;
	}

	public void setBenefits(ArrayList<String> benefits) {
		this.benefits = benefits;
	}
	
	
	
	

}
