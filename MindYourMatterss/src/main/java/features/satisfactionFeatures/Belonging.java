package features.satisfactionFeatures;

import Benefits.Satisfaction;

public class Belonging extends Satisfaction{

	private String teamwork = "Teamwork";
	private String makingNewFriends = "Making new friends";
	
	public Belonging() {
		super("Belonging", 2);
		init();
	}
	
	private void init() {
		benefits.add(teamwork);
		benefits.add(makingNewFriends);
	}

	public String getTeamwork() {
		return teamwork;
	}

	public void setTeamwork(String teamwork) {
		this.teamwork = teamwork;
	}

	public String getMakingNewFriends() {
		return makingNewFriends;
	}

	public void setMakingNewFriends(String makingNewFriends) {
		this.makingNewFriends = makingNewFriends;
	}

	
	
	

}
