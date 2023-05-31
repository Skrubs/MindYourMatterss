package scenes;

import java.util.ArrayList;
import java.util.Random;

import org.openjfx.MindYourMatterss.App;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class StarField {

	private ArrayList<Star> staticStarField = new ArrayList<>();
	private ArrayList<Star> movingStarField = new ArrayList<>();
	private int numOfStaticStars = 0;
	private int numOfMovingStars = 0;
	private double screenWidth = App.WINDOW_WIDTH;
	private double screenHeight = App.WINDOW_HEIGHT;
	private Random gen = new Random();
	private int red = 0;
	private int green = 0;
	private int blue = 0;
	private int size = 0;

	public StarField(int numOfStaticStars, int numOfMovingStars) {
		this.numOfStaticStars = numOfStaticStars;
		this.numOfMovingStars = numOfMovingStars;
		loadStaticField();
		loadMovingStarField();
	}

	private void loadStaticField() {

		for (int i = 0; i < numOfStaticStars; i++) {
			red = gen.nextInt(255);
			green = gen.nextInt(255);
			blue = gen.nextInt(255);
			size = gen.nextInt(3);
			Color c = Color.rgb(red, green, blue);
			staticStarField.add(new Star(gen.nextInt((int) screenWidth), 
									gen.nextInt((int) screenHeight), 0, 0, c, size));
		}
	}

	private void loadMovingStarField() {

		for (int i = 0; i < numOfMovingStars; i++) {
			
			size = 2;
			Color c = Color.WHITESMOKE;
			movingStarField.add(new Star(gen.nextInt((int) screenWidth), 
									gen.nextInt((int) screenHeight), (-gen.nextDouble()), 0, c, size));
		}
	}
	
	public void update(double timer) {
		for(Star s : movingStarField) {
			s.moveMent();
		}
	}
	
	public void render(GraphicsContext gc) {
		
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight());
		
		for(Star s : staticStarField) {
			gc.setFill(s.getC());
			gc.fillOval(s.getX(), s.getY(), s.getSize(), s.getSize());
		}
		
		for(Star s : movingStarField) {
			gc.setFill(s.getC());
			gc.fillOval(s.getX(), s.getY(), s.getSize(), s.getSize());
		}
	}
	
	public ArrayList<Star> getStaticStarField(){
		return staticStarField;
	}
	
	public ArrayList<Star> getMovingStarField(){
		return movingStarField;
	}

}
