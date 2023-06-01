package entities;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Feature extends Pane {
	
	private Label label;
	private String featureName;
	private boolean isContacted;
	private Color rgbColor;
	private double x;
	private double y;
	
	public Feature(String featureName) {
		super();
		this.featureName = featureName;
		init(featureName);
		this.setWidth(200);
		this.setHeight(75);
		this.setOnMousePressed(e->{
			x = this.getTranslateX() - e.getX();
			y = this.getTranslateY() - e.getY();
		});
		
		this.setOnMouseDragged(e->{
	
			this.setTranslateX(x);
			this.setTranslateY(y);
		});
	}
	
	private void init(String featureName) {
		label = new Label(featureName);
		this.getChildren().add(label);
		this.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, getInsets())));
	}
	

	
	

}
