package features.satisfactionFeatures;

import Benefits.Satisfaction;

public class ServiceToCountry extends Satisfaction{

	private String pride = "Pride/Patriotism";
	private String Tradition = "Tradition";
	
	public	ServiceToCountry() {
		super("Service to Country", 2);
		init();
	}
	
	private void init() {
		benefits.add(pride);
		benefits.add(Tradition);
	}

	public String getPride() {
		return pride;
	}

	public void setPride(String pride) {
		this.pride = pride;
	}

	public String getTradition() {
		return Tradition;
	}

	public void setTradition(String tradition) {
		Tradition = tradition;
	}

	

}
