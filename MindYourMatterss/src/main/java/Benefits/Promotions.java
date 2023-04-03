package Benefits;

public class Promotions extends Advancement{
	
	public static final int numOfBenefits = 3;
	private String featureName = "Monthly Income";
	
	public Promotions() {
		super("Promotions");
		init();
	}
	
	protected void init() {
		benefits.add("Airman Tier");
		benefits.add("Non Commissioned Officer Tier (NCO)");
		benefits.add("Senior Non Commissioned Officer Tier (SNCO)");
	
		
	}

}
