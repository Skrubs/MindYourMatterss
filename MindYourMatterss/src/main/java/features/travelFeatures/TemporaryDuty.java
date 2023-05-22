package features.travelFeatures;

import Benefits.Travel;

public class TemporaryDuty extends Travel{
	
	
	protected String authorizedTravelExpenses = "authorized travel expenses paid by AF";
	protected String opportunityToWorkOutsideOffice = "Opportunity to work and learn outside office";
	

	public TemporaryDuty() {
		super("Temporary Duty", 2);
		init();
		
	}
	
	private void init() {
		benefits.add(authorizedTravelExpenses);
		benefits.add(opportunityToWorkOutsideOffice);
		
	}

	public String getAuthorizedTravelExpenses() {
		return authorizedTravelExpenses;
	}

	public void setAuthorizedTravelExpenses(String authorizedTravelExpenses) {
		this.authorizedTravelExpenses = authorizedTravelExpenses;
	}

	public String getOpportunityToWorkOutsideOffice() {
		return opportunityToWorkOutsideOffice;
	}

	public void setOpportunityToWorkOutsideOffice(String opportunityToWorkOutsideOffice) {
		this.opportunityToWorkOutsideOffice = opportunityToWorkOutsideOffice;
	}
	
	

}
