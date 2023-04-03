package org.openjfx.MindYourMatterss;

import gamescenes.FlashCardScene;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import scenes.LoadScene;

/**
 * JavaFX App
 */
public class App extends Application {

	public Stage window;
	private Scene scene;
	private Parent root;
	private LoadScene loadScene;
	private Image icon;
	private MediaPlayer mp;
	private long startTime = System.nanoTime();
	private double timer;
	private FlashCardScene flashCardScene;
	private Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

	@Override
	public void start(Stage stage) {
		this.window = stage;

		icon = new Image(getClass().getResource("/images/icon.png").toExternalForm());
		window.getIcons().add(icon);
		window.setFullScreen(false);
		window.setMaximized(true);
		window.initStyle(StageStyle.DECORATED);
		window.setX(bounds.getMinX());
		window.setY(bounds.getMinY());
		window.setWidth(bounds.getWidth());
		window.setHeight(bounds.getHeight());
		window.setMaxWidth(bounds.getWidth()*2);
		window.setFullScreenExitHint("");
		window.setTitle("MindYourMatters v0.01");
		root = new Group();
		scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
		window.setScene(scene);

		loadScene = new LoadScene();
		flashCardScene = new FlashCardScene();

		scene.setCursor(Cursor.OPEN_HAND);
		scene.setOnMousePressed(e -> {
			scene.setCursor(Cursor.CLOSED_HAND);
		});
		scene.setOnMouseReleased(e -> {
			scene.setCursor(Cursor.OPEN_HAND);
		});
		
		scene.setRoot(loadScene.getRoot());
		window.show();
		
		//LOAD SCENE BUTTON ACTIONS

		loadScene.getExitButton().setOnAction(e -> {
			window.close();
		});

		loadScene.getLegoButton().setOnAction(e -> {

		});
		
		//FLASH CARD GAME BUTTON ACTIONS
		flashCardScene.getBackButton().setOnAction(e->{
			scene.setRoot(loadScene.getRoot());
		});

		loadScene.getFlashCardButton().setOnAction(e -> {
			scene.setRoot(flashCardScene.getRoot());
			flashCardScene.getPane().setPrefSize(scene.getWidth(), scene.getHeight());
			flashCardScene.getCanvas().setWidth(scene.getWidth());
			flashCardScene.getCanvas().setHeight(scene.getHeight());
		});

		loadScene.getShootemButton().setOnAction(e -> {

		});

		// animationTimer

		new AnimationTimer() {

			@Override
			public void handle(long now) {
				timer = (now - startTime) / 1000000000.0;
				timer = timer * 10;
				timer = (int) timer;
				timer /= 10;

				if(scene.getRoot().equals(loadScene.getRoot())) {
					loadScene.update(timer);
					loadScene.render();
				}
				
				if(scene.getRoot().equals(flashCardScene.getRoot())) {
					flashCardScene.update(timer);
					flashCardScene.render();
				}
			

			}
		}.start();

	}

	public static void main(String[] args) {
		launch();
	}

}