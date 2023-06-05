package scenes;




import java.util.ArrayList;

import org.openjfx.MindYourMatterss.App;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;
import javafx.stage.Screen;
import utility.ImageLoader;

/**
 * INITIAL SCENE UPON LOADING APPLICATION.  VISUAL LAYOUT IS USED IN A MIX OF
 * BOTH IN LINE AND USING JAVAFX CSS.  THE CSS FILE IS CALLED application.css IN THE MAIN
 * FOLDER
 * @author barce
 *
 */
public class LoadScene {
	
	
	private GridPane root;
	private Canvas canvas;
	private GraphicsContext gc;
	private ImageLoader loadImage;
	private double width;
	private double height;
	private Rectangle2D resolution;
	private Scale scale;
	private ArrayList<Clouds> cloudList;
	private Button beneSaver;
	private Button exitButton;
	private Button flashCardButton;
	private Button legoButton;
	private ArrayList<LoadScreenLabels> entitlements;
	private Image img = ImageLoader.uiBground;
	
	private AudioClip clip;
	private AudioClip clicked;
	
	
	/**
	 * CONSTRUCTOR - BASIC
	 */
	public LoadScene() {
		loadImage = new ImageLoader();
		resolution = Screen.getPrimary().getVisualBounds();
		width = resolution.getWidth();
		height = resolution.getHeight();
		scale = new Scale(width, height,0,0);
		cloudList = new ArrayList<>();
		entitlements = new ArrayList<>();
		clip = new AudioClip(LoadScene.class.getResource("/sounds/ButtonSound.wav").toExternalForm());
		clicked = new AudioClip(LoadScene.class.getResource("/sounds/buttonclick.wav").toExternalForm());
		
		initializeLoad();
			
	}
	
	/**
	 * INITIALIZE OBJECTS
	 */
	private void initializeLoad() {
		root = new GridPane();
		root.prefWidth(App.WINDOW_WIDTH);
		root.prefHeight(App.WINDOW_HEIGHT);
		root.setId("testPane");
		root.autosize();
			
		// INITIALIZE CANVAS FOR LOAD SCENE	
		
		canvas = new Canvas();
		canvas.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
		canvas.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
		
		gc = canvas.getGraphicsContext2D();
		
		// INITIALZE BUTTONS FOR LOAD SCENE
		
		beneSaver = new Button("Benefit Saver");
			beneSaver.setOnMouseEntered(e->{ clip.play();});
			beneSaver.setOnMousePressed(e->{ clicked.play();});
			beneSaver.setId("shootemButton");
			
		flashCardButton = new Button("Flash Cards");
			flashCardButton.setOnMouseEntered(e->{ clip.play();});
			flashCardButton.setOnMousePressed(e->{ clicked.play();});
			flashCardButton.setId("flashCardButton");
		legoButton = new Button("Place the Benefit");
			legoButton.setOnMouseEntered(e->{ clip.play();});
			legoButton.setOnMousePressed(e->{ clicked.play();});
			legoButton.setId("legoButton");
		exitButton = new Button("Exit");
			exitButton.setOnMouseEntered(e->{ clip.play();});
			exitButton.setOnMousePressed(e->{ clicked.play();});
			exitButton.setId("exitButton");
			
		/**
		 * vBOX CONTAINER FOR LOADSCENE BUTTONS			
		 */
		VBox vbox = new VBox();
			vbox.getChildren().addAll(beneSaver, flashCardButton, legoButton, exitButton);
			vbox.setId("buttonBox");		
			root.getChildren().add(canvas);
			
	
			
			//LOADS LABELS FOR LOAD SCENE ANIMATION
		entitlements.add(new LoadScreenLabels("Money"));
		entitlements.add(new LoadScreenLabels("Advancement"));
		entitlements.add(new LoadScreenLabels("Training"));
		entitlements.add(new LoadScreenLabels("Travel"));
		entitlements.add(new LoadScreenLabels("Recreaction"));
		entitlements.add(new LoadScreenLabels("Education"));
		entitlements.add(new LoadScreenLabels("Satisfaction"));
		entitlements.add(new LoadScreenLabels("Security"));
		
		
		//ADDS CLOUDS FOR LOAD SCENE
		for(int i = 0; i < 10; i++) {
			cloudList.add(new Clouds());
		}
		Pane pane = new Pane();
		root.getChildren().addAll(pane, vbox);
		vbox.setTranslateY(vbox.getParent().getBoundsInLocal().getHeight() - 600);
		
		//ADDS LABELS TO BE DISPLAYED FOR THE LOADSCENE
		for(LoadScreenLabels l : entitlements) {
			pane.getChildren().add(l.getLabel());
		}
		
		if(screenSizeIsNot4k()) {
			gc.scale(0.80, 0.80);
		}
		
		
		
		
	}
	
	private boolean screenSizeIsNot4k() {
		if(Screen.getPrimary().getVisualBounds().getWidth() == 1920) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * RENDERS OBJECTS TO THE LOAD SCENE
	 */

	public void render() {
		
			
		gc.drawImage(loadImage.skybackground, 0, 0);
		
		for(Clouds c : cloudList) {
			c.render(gc);
		}
		
		gc.drawImage(loadImage.hillbackground, 0, 0);
		
		gc.drawImage(loadImage.uiBground, 0, 0);
	}
	
	/**
	 * UPDATE OBJECTS IN THE LOAD SCENE
	 * @param timer
	 */
	public void update(double timer) {
		for(Clouds c: cloudList) {
			c.update();
		}
		
		for(LoadScreenLabels l : entitlements) {
			
				l.update(timer);
			
		}
	}
	

	// SETTERS AND GETTERS BEYOND THIS POINT
	
	public GridPane getRoot() {
		return root;
	}

	public void setRoot(GridPane root) {
		this.root = root;
	}


	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public GraphicsContext getGc() {
		return gc;
	}

	public void setGc(GraphicsContext gc) {
		this.gc = gc;
	}

	public ImageLoader getLoadImage() {
		return loadImage;
	}

	public void setLoadImage(ImageLoader loadImage) {
		this.loadImage = loadImage;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public Scale getScale() {
		return scale;
	}

	public void setScale(Scale scale) {
		this.scale = scale;
	}

	public ArrayList<Clouds> getCloudList() {
		return cloudList;
	}

	public void setCloudList(ArrayList<Clouds> cloudList) {
		this.cloudList = cloudList;
	}

	public Button beneSaverButton() {
		return beneSaver;
	}

	public void beneSaverButton(Button shootemButton) {
		this.beneSaver = shootemButton;
	}

	public Button getExitButton() {
		return exitButton;
	}

	public void setExitButton(Button exitButton) {
		this.exitButton = exitButton;
	}

	public Button getFlashCardButton() {
		return flashCardButton;
	}

	public void setFlashCardButton(Button flashCardButton) {
		this.flashCardButton = flashCardButton;
	}

	public Button getLegoButton() {
		return legoButton;
	}

	public void setLegoButton(Button legoButton) {
		this.legoButton = legoButton;
	}

	public ArrayList<LoadScreenLabels> getEntitlements() {
		return entitlements;
	}

	public void setEntitlements(ArrayList<LoadScreenLabels> entitlements) {
		this.entitlements = entitlements;
	}

	public AudioClip getClip() {
		return clip;
	}

	public void setClip(AudioClip clip) {
		this.clip = clip;
	}


	
	

}
