package features.travelFeatures;

import Benefits.Travel;

public class Hops extends Travel{
	
	
	protected String freeToLowCostFlights = "Free to low cost flights on AF aircraft";

	public Hops() {
		super("Help Our People Save", 1);
		init();
	}
	
	private void init() {
		benefits.add(freeToLowCostFlights);
	}

	public String getFreeToLowCostFlights() {
		return freeToLowCostFlights;
	}

	public void setFreeToLowCostFlights(String freeToLowCostFlights) {
		this.freeToLowCostFlights = freeToLowCostFlights;
	}
	
	

}
