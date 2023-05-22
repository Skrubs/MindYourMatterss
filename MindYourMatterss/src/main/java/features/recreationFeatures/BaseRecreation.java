package features.recreationFeatures;

import Benefits.Recreation;

public class BaseRecreation extends Recreation{

	
	private String freeToLowCostAmetities = "Free to low cost amentities";
	
	public BaseRecreation() {
		super("Base Recreation", 1);
		init();
	}
	
	private void init() {
		benefits.add(freeToLowCostAmetities);
	}

	public String getFreeToLowCostAmetities() {
		return freeToLowCostAmetities;
	}

	public void setFreeToLowCostAmetities(String freeToLowCostAmetities) {
		this.freeToLowCostAmetities = freeToLowCostAmetities;
	}
	
	
	

}
