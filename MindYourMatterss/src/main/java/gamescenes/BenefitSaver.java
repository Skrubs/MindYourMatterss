package gamescenes;

import org.openjfx.MindYourMatterss.App;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import scenes.StarField;

public class BenefitSaver {
	
	
	private StarField starField;
	private Group root;
	private Canvas canvas;
	private GraphicsContext gc;
	private Pane pane;
	private Rectangle2D rectBounds;
	
	public BenefitSaver() {
		init();
	}
	
	private void init() {
		starField = new StarField(500,500);
		root = new Group();
		canvas = new Canvas(App.WINDOW_WIDTH,App.WINDOW_HEIGHT);
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		pane = new Pane();
		rectBounds = new Rectangle2D(App.WINDOW_WIDTH/2 - 100, App.WINDOW_HEIGHT/2 - 100,
							200,200);
		pane.setTranslateX(rectBounds.getMinX());
		pane.setTranslateY(rectBounds.getMinY());
		pane.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, null)));
		root.getChildren().add(pane);
		
	
		
		
	}
	
	
	public void update(double timer) {
		starField.update(timer);
	}
	
	public void render() {
		starField.render(gc);
	}
	
	public Group getRoot() {
		return root;
	}

}
