package gamescenes;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

import Benefits.Advancement;
import Benefits.Entitlements;
import Benefits.Money;
import entities.FlashCard;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;

/*
 * FlashCardScene is the container scene to house all of the FlashCard Game components and controls
 * Class FlashCard will house all game objects
 */
public class FlashCardScene {

	// variable declaration
	private Group root;
	private Pane pane;
	private Canvas canvas;
	private GraphicsContext gc;
	private Entitlements entitlements;
	private ArrayList<FlashCard> flashCardList = new ArrayList<>();
	private double cardLayoutX = Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - 400;
	private double cardLayoutY = Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - 300;
	private Button backButton;
	private Button showAnswerButton;
	private Button shuffleCardButton;
	private Button studyModeButton;
	private AudioClip clip1;
	private AudioClip click;
	private Random gen;
	private int cardNumber = 1;
	private int previousCard = 0;

	/**
	 * default constructor
	 */
	public FlashCardScene() {
		init();
	}

	// initialize scene components
	private void init() {
		gen = new Random();
		clip1 = new AudioClip(getClass().getResource("/sounds/ButtonSound.wav").toExternalForm());
		click = new AudioClip(getClass().getResource("/sounds/buttonclick.wav").toExternalForm());
		root = new Group();
		pane = new Pane();
		pane.setId("flashcardpane");
		canvas = new Canvas();
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(pane);

		// initialize loadcards
		loadCards();

		// initilaize flashcardbuttons
		backButton = new Button("Back");
		backButton.setId("backButton");
		backButton.setOnMouseEntered(e -> {
			clip1.play();
		});
		backButton.setOnMousePressed(e -> {
			click.play();
		});
		showAnswerButton = new Button("Show Answer");
		showAnswerButton.setId("showAnswerButton");
		showAnswerButton.setOnMouseEntered(e -> {
			clip1.play();
		});
		showAnswerButton.setOnMousePressed(e -> {
			click.play();
		});
		shuffleCardButton = new Button("Shuffle Cards");
		shuffleCardButton.setId("shuffleCardButton");
		shuffleCardButton.setOnMouseEntered(e -> {
			clip1.play();
		});
		shuffleCardButton.setOnMousePressed(e -> {
			click.play();
		});
		studyModeButton = new Button("Toggle Study Mode");
		studyModeButton.setId("studyModeButton");
		studyModeButton.setOnMouseEntered(e -> {
			clip1.play();
		});
		studyModeButton.setOnMousePressed(e -> {
			click.play();
		});
		pane.getChildren().addAll(canvas, backButton, shuffleCardButton, studyModeButton, showAnswerButton);

		// Button Action
		showAnswerButton.setOnAction(e -> {
			
			flashCardList.get(cardNumber).showAnswer();
		});

		shuffleCardButton.setOnAction(e -> {
			cardNumber = gen.nextInt(flashCardList.size());
			if (!pane.getChildren().contains(flashCardList.get(cardNumber).getCardBox())) {
				pane.getChildren().add(flashCardList.get(cardNumber).getCardBox());
				previousCard = cardNumber;
			} else {
				pane.getChildren().remove(flashCardList.get(cardNumber).getCardBox());
				while (cardNumber == previousCard) {
					if (flashCardList.size() < 2) {
						break;
					}
					cardNumber = gen.nextInt(flashCardList.size());

				}

			}

		});

		studyModeButton.setOnAction(e -> {

		});
	}

	/**
	 * Load the flash cards with data
	 */
	private void loadCards() {
		entitlements = new Entitlements();
		for (Money m : entitlements.getMoney()) {
			flashCardList.add(new FlashCard(cardLayoutX, cardLayoutY, m.getEntitlementName(), m.getFeatureName(),
					m.getNumOfBenefits(), m.getBenefits()));
		}
			for (Advancement a : entitlements.getAdvancement()) {
			flashCardList.add(new FlashCard(cardLayoutX, cardLayoutY, a.getEntitlementName(), a.getFeatureName(),
					a.getNumOfBenefits(), a.getBenefits()));
			}
			

	}

	// update objects
	public void update(double timer) {

	}

	// render objects
	public void render() {
		if (gc.getFill() != Color.AZURE) {
			gc.setFill(Color.AZURE);
		}
		gc.fillRect(200, 400, 32, 32);
	}

	// GETTERS AND SETTERS

	public Group getRoot() {
		return root;
	}

	public Pane getPane() {
		return pane;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public GraphicsContext getGc() {
		return gc;
	}

	public void setGc(GraphicsContext gc) {
		this.gc = gc;
	}

	public Entitlements getEntitlements() {
		return entitlements;
	}

	public void setEntitlements(Entitlements entitlements) {
		this.entitlements = entitlements;
	}

	public ArrayList<FlashCard> getFlashCardList() {
		return flashCardList;
	}

	public void setFlashCardList(ArrayList<FlashCard> flashCardList) {
		this.flashCardList = flashCardList;
	}

	public double getCardLayoutX() {
		return cardLayoutX;
	}

	public void setCardLayoutX(double cardLayoutX) {
		this.cardLayoutX = cardLayoutX;
	}

	public double getCardLayoutY() {
		return cardLayoutY;
	}

	public void setCardLayoutY(double cardLayoutY) {
		this.cardLayoutY = cardLayoutY;
	}

	public Button getBackButton() {
		return backButton;
	}

	public void setBackButton(Button backButton) {
		this.backButton = backButton;
	}

	public Button getShowAnswerButton() {
		return showAnswerButton;
	}

	public void setShowAnswerButton(Button showAnswerButton) {
		this.showAnswerButton = showAnswerButton;
	}

	public Button getShuffleCardButton() {
		return shuffleCardButton;
	}

	public void setShuffleCardButton(Button shuffleCardButton) {
		this.shuffleCardButton = shuffleCardButton;
	}

	public Button getStudyModeButton() {
		return studyModeButton;
	}

	public void setStudyModeButton(Button studyModeButton) {
		this.studyModeButton = studyModeButton;
	}

	public AudioClip getClip1() {
		return clip1;
	}

	public void setClip1(AudioClip clip1) {
		this.clip1 = clip1;
	}

	public AudioClip getClick() {
		return click;
	}

	public void setClick(AudioClip click) {
		this.click = click;
	}

	public void setRoot(Group root) {
		this.root = root;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

}
