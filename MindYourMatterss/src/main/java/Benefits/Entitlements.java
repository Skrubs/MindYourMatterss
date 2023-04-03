package Benefits;

import java.util.ArrayList;

public class Entitlements {
	
	
	private ArrayList<Money> money = new ArrayList<>();
	private ArrayList<Advancement> advancement = new ArrayList<>();
	
	public Entitlements() {
		init();
	}
	
	private void init() {
		
		//Money
		money.add(new MonthlyIncome());
		money.add(new PayIncreases());
		money.add(new MembershipPerks());
		
		//Advancement
		advancement.add(new Promotions());
		advancement.add(new ProfessionalDevelopment());
		advancement.add(new CommissioningPrograms());
		
		//Travel
		
		//Training
		
		//Education
		
		//Recreation
		
		//Satisfaction
		
		//Security
		
	}

	public ArrayList<Money> getMoney() {
		return money;
	}

	public void setMoney(ArrayList<Money> money) {
		this.money = money;
	}

	public ArrayList<Advancement> getAdvancement() {
		return advancement;
	}

	public void setAdvancement(ArrayList<Advancement> advancement) {
		this.advancement = advancement;
	}
	
	

}
