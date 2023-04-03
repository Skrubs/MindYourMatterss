package Benefits;
import java.util.ArrayList;

public class MembershipPerks extends Money {
	
	
	 
	
	public MembershipPerks() {
		super("Membership Perks", 5);
		init();
	}
	
	private void init() {
		benefits.add("VA Home Loan");
		benefits.add("Base Exchange");
		benefits.add("Commissary");
		benefits.add("Civilian Business Discounts");
		benefits.add("Clothing Allowance");
		
	}
	


}
