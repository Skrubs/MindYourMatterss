package Benefits;

import java.util.ArrayList;

import features.MembershipPerks;
import features.MonthlyIncome;
import features.PayIncreases;

public class Entitlements {
	
	
	
	
	private ArrayList<Money> moneyList = new ArrayList<>();
	
	
	public Entitlements() {

		moneyList.add(new MonthlyIncome());
		moneyList.add(new PayIncreases());
		moneyList.add(new MembershipPerks());
	}
	
	
	

}
