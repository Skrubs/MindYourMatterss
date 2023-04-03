package Benefits;

import java.util.ArrayList;

public abstract class Security {
	
	
	protected ArrayList<String> benefits;
	protected String featureName;
	
	
	public Security(String featureName) {
		this.featureName = featureName;
	}
	
	protected abstract void init();
	
	
	public ArrayList<String> getBenefits(){
		return benefits;
	}
	
	public String getFeatureName() {
		return featureName;
	}

}