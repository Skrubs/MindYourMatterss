package features.securityFeatures;

import Benefits.Security;

public class HometownService extends Security {

	private String serveLocally = "Serve locally near home";
	
	public HometownService() {
		super("Home Town Service", 1);
		init();
	}
	
	private void init() {
		benefits.add(serveLocally);
	}

	public String getServeLocally() {
		return serveLocally;
	}

	public void setServeLocally(String serveLocally) {
		this.serveLocally = serveLocally;
	}
	

}
