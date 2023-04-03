package Benefits;

public class CommissioningPrograms extends Advancement {

	
	public static final int numOfBenefits = 2;
	
	public CommissioningPrograms() {
		super("Commissioning Programs");
		init();
	}

	@Override
	protected void init() {
		benefits.add("Direct Programs");
		benefits.add("Non-Direct Programs");
		
	}

}
