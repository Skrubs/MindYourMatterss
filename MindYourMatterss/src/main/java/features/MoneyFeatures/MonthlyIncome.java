package features.MoneyFeatures;

import java.util.ArrayList;

import Benefits.Money;

public class MonthlyIncome extends Money {
	
	

	private String basePay = "Base Pay";
	private String bah = "Basic Allowance for Housing";
	private String bas = "Basic Allowance for Substatence";
	private String drillPay = "Drill Pay";
	

	public MonthlyIncome() {
		super("Monthly Income", 4);
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
	
	
	
	
	
	public String getBasePay() {
		return basePay;
	}

	public void setBasePay(String basePay) {
		this.basePay = basePay;
	}

	public String getBah() {
		return bah;
	}

	public void setBah(String bah) {
		this.bah = bah;
	}

	public String getBas() {
		return bas;
	}

	public void setBas(String bas) {
		this.bas = bas;
	}

	public String getDrillPay() {
		return drillPay;
	}

	public void setDrillPay(String drillPay) {
		this.drillPay = drillPay;
	}

	@Override
	public String toString() {
		return "Monthly Income";
	}
}
