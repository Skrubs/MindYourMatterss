package Benefits;

import java.util.ArrayList;

public class MonthlyIncome extends Money {
	
	
	

	
	
	
	public MonthlyIncome() {
		super("Monthly Income",4);
		init();
	}
	
	private void init() {
		benefits.add("Base Pay");
		benefits.add("Basic Allowance for Housing (BAH)");
		benefits.add("Drill Pay");
		benefits.add("Basic Allowance for Subsistence (BAS)");
	}
	



}
