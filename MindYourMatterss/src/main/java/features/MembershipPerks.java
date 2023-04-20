package features;

import java.util.ArrayList;

import Benefits.Money;

public class MembershipPerks extends Money{

	private String featureName = "Membership Perks";
	private String vaHomeLoan = "VA home loans";
	private String baseExchange = "Base Exchange";
	private String commissary = "Commissary";
	private String civilianBusinessDiscounts = "Civilian business discounts";
	private String clothingAllowance = "Clothing Allowance";
	private int numOfBenefits = 4;
	private ArrayList<String> benefits = new ArrayList<>();
	
	
	
	
	public MembershipPerks() {
		init();
		
	}
	
	public void init() {
		benefits.add(vaHomeLoan);
		benefits.add(baseExchange);
		benefits.add(commissary);
		benefits.add(civilianBusinessDiscounts);
		benefits.add(clothingAllowance);
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getVaHomeLoan() {
		return vaHomeLoan;
	}

	public void setVaHomeLoan(String vaHomeLoan) {
		this.vaHomeLoan = vaHomeLoan;
	}

	public String getBaseExchange() {
		return baseExchange;
	}

	public void setBaseExchange(String baseExchange) {
		this.baseExchange = baseExchange;
	}

	public String getCommissary() {
		return commissary;
	}

	public void setCommissary(String commissary) {
		this.commissary = commissary;
	}

	public String getCivilianBusinessDiscounts() {
		return civilianBusinessDiscounts;
	}

	public void setCivilianBusinessDiscounts(String civilianBusinessDiscounts) {
		this.civilianBusinessDiscounts = civilianBusinessDiscounts;
	}

	public String getClothingAllowance() {
		return clothingAllowance;
	}

	public void setClothingAllowance(String clothingAllowance) {
		this.clothingAllowance = clothingAllowance;
	}

	public int getNumOfBenefits() {
		return numOfBenefits;
	}

	public void setNumOfBenefits(int numOfBenefits) {
		this.numOfBenefits = numOfBenefits;
	}

	public ArrayList<String> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<String> benefits) {
		this.benefits = benefits;
	}
	
	
	
}
