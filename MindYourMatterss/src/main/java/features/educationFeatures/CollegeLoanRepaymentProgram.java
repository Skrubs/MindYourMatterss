package features.educationFeatures;

import Benefits.Education;

public class CollegeLoanRepaymentProgram extends Education {

	protected String paysOffFederal = "Pays off federal student loans to a certain amount";
	
	public CollegeLoanRepaymentProgram() {
		super("College Loan Repayment Program", 1);
		init();
	}
	
	private void init() {
		benefits.add(paysOffFederal);
	}

	public String getPaysOffFederal() {
		return paysOffFederal;
	}

	public void setPaysOffFederal(String paysOffFederal) {
		this.paysOffFederal = paysOffFederal;
	}
	
	

}
