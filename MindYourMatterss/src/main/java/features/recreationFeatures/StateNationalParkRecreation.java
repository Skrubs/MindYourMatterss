package features.recreationFeatures;

import Benefits.Recreation;

public class StateNationalParkRecreation extends Recreation {
	
	
	
	private String freeToLowCostPark = "Free to low cost park admission";
	private String freeToLowCostHunting = "Free to low cost hunting and fishing license";
	
	public StateNationalParkRecreation() {
		super("State/National Park Recreation", 2);
		init();
		
	}
	
	private void init() {
		benefits.add(freeToLowCostHunting);
		benefits.add(freeToLowCostPark);
	}

	public String getFreeToLowCostPark() {
		return freeToLowCostPark;
	}

	public void setFreeToLowCostPark(String freeToLowCostPark) {
		this.freeToLowCostPark = freeToLowCostPark;
	}

	public String getFreeToLowCostHunting() {
		return freeToLowCostHunting;
	}

	public void setFreeToLowCostHunting(String freeToLowCostHunting) {
		this.freeToLowCostHunting = freeToLowCostHunting;
	}
	
	

}
