package features.recreationFeatures;

import Benefits.Recreation;

public class InformationTicketsAndTravel extends Recreation{

	private String lowCostTravelVacation = "Low cost travel/vacation packages";
	private String discountedEvent = "Discounted event tickets";
	
	public InformationTicketsAndTravel() {
		super("Information Tickets & Travel", 2);
		init();
	}
	
	private void init() {
		benefits.add(discountedEvent);
		benefits.add(lowCostTravelVacation);
	}

	public String getLowCostTravelVacation() {
		return lowCostTravelVacation;
	}

	public void setLowCostTravelVacation(String lowCostTravelVacation) {
		this.lowCostTravelVacation = lowCostTravelVacation;
	}

	public String getDiscountedEvent() {
		return discountedEvent;
	}

	public void setDiscountedEvent(String discountedEvent) {
		this.discountedEvent = discountedEvent;
	}
	
	

}
