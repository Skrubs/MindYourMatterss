package org.openjfx.MindYourMatterss;

import gamescenes.BenefitSaver;
import gamescenes.FlashCardScene;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import scenes.LoadScene;
import utility.ImageLoader;

/**
 * JavaFX App
 */
public class App extends Application {

	public Stage window;
	private Scene scene;
	private Parent root;
	private LoadScene loadScene;
	private BenefitSaver benefitSaver;
	private Image icon;
	private MediaPlayer mp;
	private long startTime = System.nanoTime();
	private double timer;
	private FlashCardScene flashCardScene;
	public static double WINDOW_WIDTH = Screen.getPrimary().getVisualBounds().getWidth();
	public static double WINDOW_HEIGHT = Screen.getPrimary().getVisualBounds().getHeight();
	

	@Override
	public void start(Stage stage) {
		this.window = stage;
		// Changed
		icon = new Image(getClass().getResource("/images/icon.png").toExternalForm());
		window.getIcons().add(icon);
		window.setMaximized(true);
		window.initStyle(StageStyle.DECORATED);
		
		
		

		window.setTitle("MindYourMatters v0.01");
		root = new Group();
		scene = new Scene(root, 1920, 1080);
		
		
		scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
		window.setScene(scene);
		window.sizeToScene();
		
		benefitSaver = new BenefitSaver();

		loadScene = new LoadScene();
		flashCardScene = new FlashCardScene();

		Cursor c = new ImageCursor(ImageLoader.c1);
		
		scene.setCursor(c);
//		scene.setOnMousePressed(e -> {
//			scene.setCursor(Cursor.CLOSED_HAND);
//		});
//		scene.setOnMouseReleased(e -> {
//			scene.setCursor(Cursor.OPEN_HAND);
//		});

		scene.setRoot(loadScene.getRoot());
		window.show();

		// LOAD SCENE BUTTON ACTIONS

		loadScene.getExitButton().setOnAction(e -> {
			window.close();
		});

		loadScene.getLegoButton().setOnAction(e -> {

		});

		loadScene.getFlashCardButton().setOnAction(e -> {

			scene.setRoot(flashCardScene.getRoot());
		});
		
		loadScene.beneSaverButton().setOnAction(e -> {
			scene.setRoot(benefitSaver.getRoot());
		});

		// FLASH CARD GAME BUTTON ACTIONS
		
		flashCardScene.getBackButton().setOnAction(e->{
			scene.setRoot(loadScene.getRoot());
		});

		

		// animationTimer

		new AnimationTimer() {

			@Override
			public void handle(long now) {
				timer = (now - startTime) / 1000000000.0;
				timer = timer * 10;
				timer = (int) timer;
				timer /= 10;

				if (scene.getRoot().equals(loadScene.getRoot())) {
					loadScene.update(timer);
					loadScene.render();
				}
				
				if(scene.getRoot().equals(flashCardScene.getRoot())){
					
					flashCardScene.update(timer);
					flashCardScene.render();
					
				}
				
				if(scene.getRoot().equals(benefitSaver.getRoot())) {
					benefitSaver.update(timer);
					benefitSaver.render();
				}
				
				

			}
		}.start();

	}

	public static void main(String[] args) {
		launch();
	}

}