package scenes;




import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.transform.Scale;
import utility.ImageLoader;

public class LoadScene {
	
	
	private Group root;
	private Canvas canvas;
	private GraphicsContext gc;
	private ImageLoader loadImage;
	private double width;
	private double height;
	private Dimension resolution;
	private Scale scale;
	private ArrayList<Clouds> cloudList;
	private Button shootemButton;
	private Button exitButton;
	private Button flashCardButton;
	private Button legoButton;
	private ArrayList<LoadScreenLabels> entitlements;
	
	private AudioClip clip;
	private AudioClip clicked;
	
	
	
	public LoadScene() {
		loadImage = new ImageLoader();
		resolution = Toolkit.getDefaultToolkit().getScreenSize();
		width = resolution.getWidth();
		height = resolution.getHeight();
		scale = new Scale(width, height,0,0);
		cloudList = new ArrayList<>();
		entitlements = new ArrayList<>();
		clip = new AudioClip(LoadScene.class.getResource("/sounds/ButtonSound.wav").toExternalForm());
		clicked = new AudioClip(LoadScene.class.getResource("/sounds/buttonclick.wav").toExternalForm());

		initializeLoad();
		
		
	}
	
	private void initializeLoad() {
		root = new Group();
	
		
			
		canvas = new Canvas();
		canvas.setWidth(width);
		canvas.setHeight(height);
		gc = canvas.getGraphicsContext2D();
		
		shootemButton = new Button("Shoot The Bene!");
			shootemButton.setOnMouseEntered(e->{ clip.play();});
			shootemButton.setOnMousePressed(e->{ clicked.play();});
			shootemButton.setId("shootemButton");
			
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
					
			root.getChildren().addAll(canvas, shootemButton, flashCardButton, 
								legoButton, exitButton);
		entitlements.add(new LoadScreenLabels("Money"));
		entitlements.add(new LoadScreenLabels("Advancement"));
		entitlements.add(new LoadScreenLabels("Training"));
		entitlements.add(new LoadScreenLabels("Travel"));
		entitlements.add(new LoadScreenLabels("Recreaction"));
		entitlements.add(new LoadScreenLabels("Education"));
		entitlements.add(new LoadScreenLabels("Satisfaction"));
		entitlements.add(new LoadScreenLabels("Security"));
		
		for(int i = 0; i < 10; i++) {
			cloudList.add(new Clouds());
		}
		
		for(LoadScreenLabels l : entitlements) {
			root.getChildren().add(l.getLabel());
		}
		
	}
	
	public void render() {
		
		gc.drawImage(loadImage.skybackground, 0, 0);
		for(Clouds c : cloudList) {
			c.render(gc);
		}
		gc.drawImage(loadImage.hillbackground, 0, 0);
		gc.drawImage(loadImage.uiBground, 0, 0);
	}
	
	public void update(double timer) {
		for(Clouds c: cloudList) {
			c.update();
		}
		
		for(LoadScreenLabels l : entitlements) {
			
				l.update(timer);
			
		}
	}
	

	public Group getRoot() {
		return root;
	}

	public void setRoot(Group root) {
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

	public Dimension getResolution() {
		return resolution;
	}

	public void setResolution(Dimension resolution) {
		this.resolution = resolution;
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

	public Button getShootemButton() {
		return shootemButton;
	}

	public void setShootemButton(Button shootemButton) {
		this.shootemButton = shootemButton;
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
