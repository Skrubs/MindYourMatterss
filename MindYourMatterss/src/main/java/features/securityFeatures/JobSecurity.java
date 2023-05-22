package features.securityFeatures;

import Benefits.Security;

public class JobSecurity extends Security{
	
	private String yearCommitment = "4 to 6 year commitment";
	private String noStrikes = "No strikes or layoffs";

	public JobSecurity() {
		super("Job Security", 2);
		init();
	}
	
	private void init() {
		benefits.add(noStrikes);
		benefits.add(yearCommitment);
	}

	public String getYearCommitment() {
		return yearCommitment;
	}

	public void setYearCommitment(String yearCommitment) {
		this.yearCommitment = yearCommitment;
	}

	public String getNoStrikes() {
		return noStrikes;
	}

	public void setNoStrikes(String noStrikes) {
		this.noStrikes = noStrikes;
	}

	
}
