package entities;



import Benefits.Entitlements;
import javafx.scene.canvas.GraphicsContext;

public class FlashCard extends GameObject {
	
	
	
	private Entitlements entitlements;
	
	
	/**
	 * Constructor with x and y as parameters
	 * @param x
	 * @param y
	 */
	public FlashCard() {
		super(0,0);
		init();
	}
	
	private void init() {
		entitlements = new Entitlements();
	}
	


	@Override
	public void update(double timer) {
	
		
	}

	@Override
	public void render(GraphicsContext gc) {
		

		
	}


	
	

}
