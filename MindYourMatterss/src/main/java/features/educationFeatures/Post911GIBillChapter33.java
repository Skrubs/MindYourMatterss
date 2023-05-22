package features.educationFeatures;

import Benefits.Education;

public class Post911GIBillChapter33 extends Education {

	
	protected String bookStipend = "Book stipend";
	protected String housingAllowance = "Housing allowance";
	protected String canBeTransferred = "Can be transferred to dependents";
	protected String notimeLimit = "No time limit for usage";
	protected String cumulativeValue = "Cumulative value roughly $83,000";
	
	public Post911GIBillChapter33() {
		super("Post 9/11 GI Bill Chapter 33", 5);
		init();
	}
	
	private void init() {
		benefits.add(bookStipend);
		benefits.add(canBeTransferred);
		benefits.add(cumulativeValue);
		benefits.add(notimeLimit);
		benefits.add(housingAllowance);
	}

	public String getBookStipend() {
		return bookStipend;
	}

	public void setBookStipend(String bookStipend) {
		this.bookStipend = bookStipend;
	}

	public String getHousingAllowance() {
		return housingAllowance;
	}

	public void setHousingAllowance(String housingAllowance) {
		this.housingAllowance = housingAllowance;
	}

	public String getCanBeTransferred() {
		return canBeTransferred;
	}

	public void setCanBeTransferred(String canBeTransferred) {
		this.canBeTransferred = canBeTransferred;
	}

	public String getNotimeLimit() {
		return notimeLimit;
	}

	public void setNotimeLimit(String notimeLimit) {
		this.notimeLimit = notimeLimit;
	}

	public String getCumulativeValue() {
		return cumulativeValue;
	}

	public void setCumulativeValue(String cumulativeValue) {
		this.cumulativeValue = cumulativeValue;
	}
	
	

}
