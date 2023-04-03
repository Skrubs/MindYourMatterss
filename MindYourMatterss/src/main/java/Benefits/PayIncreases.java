package Benefits;

import java.util.ArrayList;

public class PayIncreases extends Money{
	
	

	
	public PayIncreases() {
		super("Pay Increases",3);
		init();
	}
	
	private void init() {
		benefits.add("Annual Cost of Living Increase");
		benefits.add("Promotion Increase");
		benefits.add("Time In Service Increase");
	
	}


}
