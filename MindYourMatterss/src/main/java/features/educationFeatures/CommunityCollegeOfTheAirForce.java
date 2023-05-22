package features.educationFeatures;

import Benefits.Education;

public class CommunityCollegeOfTheAirForce extends Education{

	protected String accreditedByTheSoutheran = "Accredited by the Southern Association of College & Schools (SACS)";
	protected String mostCareersAward = "Most careers award Associate of Applied Science Degree";

	
	public CommunityCollegeOfTheAirForce() {
		super("Community College of the Air Force", 2);
		init();
	}
	
	private void init() {
		benefits.add(accreditedByTheSoutheran);
		benefits.add(mostCareersAward);
	}

	public String getAccreditedByTheSoutheran() {
		return accreditedByTheSoutheran;
	}

	public void setAccreditedByTheSoutheran(String accreditedByTheSoutheran) {
		this.accreditedByTheSoutheran = accreditedByTheSoutheran;
	}

	public String getMostCareersAward() {
		return mostCareersAward;
	}

	public void setMostCareersAward(String mostCareersAward) {
		this.mostCareersAward = mostCareersAward;
	}
	
	

}
