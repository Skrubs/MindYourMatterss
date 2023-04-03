package Benefits;

public class ProfessionalDevelopment extends Advancement {

	public static final int numOfBenefits = 1;
	
	public ProfessionalDevelopment() {
		super("Professional Development");
		init();
	}

	@Override
	protected void init() {
		benefits.add("Professional Military Education (PME)");
		
	}
	
	

}
