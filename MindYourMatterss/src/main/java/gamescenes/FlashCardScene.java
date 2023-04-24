package gamescenes;

import java.util.ArrayList;
import java.util.Random;

import org.openjfx.MindYourMatterss.App;

import Benefits.Entitlements;
import Benefits.Money;
import entities.FlashCard;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import scenes.LoadScene;
import utility.ImageLoader;

/*
 * FlashCardScene is the container scene to house all of the FlashCard Game components and controls
 * Class FlashCard will house all game objects
 */
public class FlashCardScene {

	private Group root;
	private Canvas canvas;
	private GraphicsContext gc;

	private Button backButton;
	private Button shuffleCardsButton;
	private Button showAnswerButton;
	private Button toggleGameModeButton;

	private AudioClip clip;
	private AudioClip clicked;

	private int index = -1;
	private int previousIndex = -2;

	private boolean isAnswered = false;

	ArrayList<FlashCard> cardPack;
	Entitlements entitlements;

	public FlashCardScene() {
		initialize();
		loadCards();
		nextCard();
		showAnswer();
		printCards();

	}

	/**
	 * Initializes the flashcardscene containers and components
	 */
	private void initialize() {
		root = new Group();
		canvas = new Canvas();
		canvas.setWidth(App.WINDOW_WIDTH);
		canvas.setHeight(App.WINDOW_HEIGHT);
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);

		backButton = new Button("Back");
		backButton.setId("backButton");
		shuffleCardsButton = new Button("Shuffle Cards");
		shuffleCardsButton.setId("shuffleCardButton");
		showAnswerButton = new Button("Show Answer");
		showAnswerButton.setId("showAnswerButton");
		toggleGameModeButton = new Button("Toggle Game Mode");
		toggleGameModeButton.setId("studyModeButton");
		VBox vBox = new VBox();
		vBox.setId("flashCardButtonVBox");
		vBox.getChildren().addAll(toggleGameModeButton, backButton);
		vBox.setTranslateX(2015);
		vBox.setTranslateY(900);
		root.getChildren().add(vBox);

		HBox hBox = new HBox();
		hBox.setId("flashCardHBox");
		hBox.getChildren().addAll(showAnswerButton, shuffleCardsButton);
		hBox.setTranslateX(350);
		hBox.setTranslateY(1000);
		root.getChildren().add(hBox);

		clip = new AudioClip(LoadScene.class.getResource("/sounds/ButtonSound.wav").toExternalForm());
		clicked = new AudioClip(LoadScene.class.getResource("/sounds/buttonclick.wav").toExternalForm());

		backButton.setOnMouseEntered(e -> {
			clip.play();
		});
		backButton.setOnMousePressed(e -> {
			clicked.play();
		});

		shuffleCardsButton.setOnMouseEntered(e -> {
			clip.play();
		});
		shuffleCardsButton.setOnMousePressed(e -> {
			clicked.play();
		});

		showAnswerButton.setOnMouseEntered(e -> {
			clip.play();
		});
		showAnswerButton.setOnMousePressed(e -> {
			clicked.play();
		});

		toggleGameModeButton.setOnMouseEntered(e -> {
			clip.play();
		});
		toggleGameModeButton.setOnMousePressed(e -> {
			clicked.play();
		});

		ImageView iv = new ImageView(ImageLoader.flashCard);

		gc.setFill(Color.BLACK);

		root.getChildren().add(iv);

		entitlements = new Entitlements();

		cardPack = new ArrayList<>();

	}

	/**
	 * load cardpack
	 */
	private void loadCards() {

		for (Money m : entitlements.getMoneyList()) {
			cardPack.add(
					new FlashCard(Money.entitlementName, m.getFeatureName(), m.getNumOfBenefits(), m.getBenefits()));
		}

	}

	/**
	 * gets the next card
	 * 
	 * @return
	 */
	private void nextCard() {
		Random gen = new Random();

		shuffleCardsButton.setOnAction(e -> {

			if (index != -1) {
				root.getChildren().remove(cardPack.get(index).getPane());
				cardPack.get(index).removeAnswer();
			}

			index = gen.nextInt(cardPack.size());
			if (index == previousIndex) {
				while (index == previousIndex) {
					index = gen.nextInt(cardPack.size());
				}
			}

			if (!root.getChildren().contains(cardPack.get(index).getPane())) {
				root.getChildren().add(cardPack.get(index).getPane());
			}

			previousIndex = index;

		});

	}

	private void showAnswer() {

		showAnswerButton.setOnAction(e -> {

			if (index != -1) {

				isAnswered = true;

				cardPack.get(index).answer(root);

			}

		});

	}

	/**
	 * print the current cardPack to the console
	 */
	public void printCards() {
		for (FlashCard fc : cardPack) {
			System.out.println("Entitlement: " + fc.getEntitlement() + " " + "Feature: " + fc.getFeature() + " "
					+ "Benefits: " + fc.getBenefits());
		}
	}

	/**
	 * update game objects
	 * 
	 * @param timer
	 */
	public void update(double timer) {

	}

	/**
	 * render assets
	 */
	public void render() {
		gc.setFill(Color.rgb(153, 153, 51));
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

	}

	public Group getRoot() {
		return root;
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

	public Button getBackButton() {
		return backButton;
	}

	public void setBackButton(Button backButton) {
		this.backButton = backButton;
	}

	public Button getShuffleCardsButton() {
		return shuffleCardsButton;
	}

	public void setShuffleCardsButton(Button shuffleCardsButton) {
		this.shuffleCardsButton = shuffleCardsButton;
	}

	public Button getShowAnswerButton() {
		return showAnswerButton;
	}

	public void setShowAnswerButton(Button showAnswerButton) {
		this.showAnswerButton = showAnswerButton;
	}

	public Button getToggleGameModeButton() {
		return toggleGameModeButton;
	}

	public void setToggleGameModeButton(Button toggleGameModeButton) {
		this.toggleGameModeButton = toggleGameModeButton;
	}

	public AudioClip getClip() {
		return clip;
	}

	public void setClip(AudioClip clip) {
		this.clip = clip;
	}

	public AudioClip getClicked() {
		return clicked;
	}

	public void setClicked(AudioClip clicked) {
		this.clicked = clicked;
	}

	public void setRoot(Group root) {
		this.root = root;
	}

}
