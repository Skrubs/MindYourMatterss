package gamescenes;

import java.util.ArrayList;
import java.util.Random;

import org.openjfx.MindYourMatterss.App;

import Benefits.Advancement;
import Benefits.Education;
import Benefits.Entitlements;
import Benefits.Money;
import Benefits.Recreation;
import Benefits.Satisfaction;
import Benefits.Security;
import Benefits.Training;
import Benefits.Travel;
import entities.FlashCard;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import scenes.LoadScene;
import utility.ImageLoader;

/*
 * FlashCardScene is the container scene to house all of the FlashCard Game components and controls
 * Class FlashCard will house all game objects
 */
public class FlashCardScene {

	private Group root;
	private Pane backGroundPane;
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
	
	private Button featureFinderGoButton;
	
	ImageView iv;
	
	private VBox vBox;
	private HBox hBox;

	ArrayList<FlashCard> cardPack;
	Entitlements entitlements;

	public FlashCardScene() {
		initialize();
		loadCards();
		nextCard();
		showAnswer();
		featureFinderMode();
		// printCards();

	}

	/**
	 * Initializes the flashcardscene containers and components
	 */
	private void initialize() {
		root = new Group();
		backGroundPane = new Pane();
		backGroundPane.setPrefSize(Screen.getPrimary().getVisualBounds().getWidth(),
				Screen.getPrimary().getVisualBounds().getHeight());

		backGroundPane.setId("backGroundPane");
		root.getChildren().add(backGroundPane);
		canvas = new Canvas();
		canvas.setWidth(App.WINDOW_WIDTH);
		canvas.setHeight(App.WINDOW_HEIGHT);
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);

		/**
		 * Button Declaration
		 */
		backButton = new Button("Back");
		backButton.setId("backButton");
		shuffleCardsButton = new Button("Shuffle Cards");
		shuffleCardsButton.setId("shuffleCardButton");
		showAnswerButton = new Button("Show Answer");
		showAnswerButton.setId("showAnswerButton");
		toggleGameModeButton = new Button("Feature Finder");
		toggleGameModeButton.setId("studyModeButton");

		// vBox for togglebutton and back button
		vBox = new VBox();
		vBox.setId("flashCardButtonVBox");
		vBox.getChildren().addAll(toggleGameModeButton, backButton);
		vBox.setTranslateX(root.getLayoutBounds().getMaxX() - 400);
		vBox.setTranslateY(root.getLayoutBounds().getHeight() * 0.75);
		root.getChildren().add(vBox);

		// HBox for showanswer and shufflecardsbutton in the flashcardscene
		hBox = new HBox();
		hBox.setId("flashCardHBox");
		hBox.getChildren().addAll(showAnswerButton, shuffleCardsButton);
		hBox.setTranslateX(root.getLayoutBounds().getWidth() * 0.18);
		hBox.setTranslateY(root.getLayoutBounds().getHeight() * 0.75);
		root.getChildren().add(hBox);

		// SOUND CLIPS FOR BOTH MOUSE ENTERING AND CLICKING BUTTONS
		clip = new AudioClip(LoadScene.class.getResource("/sounds/ButtonSound.wav").toExternalForm());
		clicked = new AudioClip(LoadScene.class.getResource("/sounds/buttonclick.wav").toExternalForm());

		// SOUND CLIPS IMPLIMENTED ON BUTTONS
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

		iv = new ImageView(ImageLoader.flashCard);

		gc.setFill(Color.BLACK);

		root.getChildren().add(iv);

		entitlements = new Entitlements();

		cardPack = new ArrayList<>();
		
		featureFinderGoButton = new Button("Start");
		featureFinderGoButton.setScaleX(.85);
		featureFinderGoButton.setScaleY(.85);
		featureFinderGoButton.setTranslateX(Screen.getPrimary().getVisualBounds().getWidth()/2 - 375);
		featureFinderGoButton.setTranslateY(Screen.getPrimary().getVisualBounds().getHeight()- 200);
		featureFinderGoButton.setOnMouseEntered(e->{
			clip.play();
		});
		featureFinderGoButton.setOnMousePressed(e->{
			clicked.play();
		});
		

	}

	/**
	 * load cardpack
	 */
	private void loadCards() {

		for (Money m : entitlements.getMoneyList()) {
			cardPack.add(
					new FlashCard(Money.entitlementName, m.getFeatureName(), m.getNumOfBenefits(), m.getBenefits()));
		}

		for (Advancement a : entitlements.getAdvancementList()) {
			cardPack.add(new FlashCard(Advancement.entitlementName, a.getFeatureName(), a.getNumOfBenefits(),
					a.getBenefits()));
		}

		for (Travel t : entitlements.getTravelList()) {
			cardPack.add(
					new FlashCard(Travel.entitlementName, t.getFeatureName(), t.getNumOfBenefits(), t.getBenefits()));
		}

		for (Training t : entitlements.getTrainingList()) {
			cardPack.add(
					new FlashCard(Training.entitlementName, t.getFeatureName(), t.getNumOfBenefits(), t.getBenefits()));
		}

		for (Education e : entitlements.getEducationList()) {
			cardPack.add(new FlashCard(Education.entitlementName, e.getFeatureName(), e.getNumOfBenefits(),
					e.getBenefits()));
		}

		for (Recreation r : entitlements.getRecreationList()) {
			cardPack.add(new FlashCard(Recreation.entitlementName, r.getFeatureName(), r.getNumOfBenefits(),
					r.getBenefits()));
		}

		for (Satisfaction s : entitlements.getSatisfactionList()) {
			cardPack.add(new FlashCard(Satisfaction.entitlementName, s.getFeatureName(), s.getNumOfBenefits(),
					s.getBenefits()));
		}

		for (Security e : entitlements.getSecurityList()) {
			cardPack.add(
					new FlashCard(Security.entitlementName, e.getFeatureName(), e.getNumOfBenefits(), e.getBenefits()));
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

			if (!showAnswerButton.getText().equals("Show Answer")) {
				showAnswerButton.setText("Show Answer");
			}

		});

	}

	private void showAnswer() {

		showAnswerButton.setOnAction(e -> {

			if (index != -1) {

				isAnswered = true;

				cardPack.get(index).answer(root);

				if (showAnswerButton.getText().equals("Show Answer")) {
					showAnswerButton.setText("Hide Answer");
				} else if (showAnswerButton.getText().equals("Hide Answer")) {
					cardPack.get(index).removeAnswer();
					showAnswerButton.setText("Show Answer");
				}

			}

		});

	}

	/**
	 * Called when toggleGameModeButton is hit.  Removes contents from root, and adds new contents for 
	 * game version
	 */
	private void featureFinderMode() {

		toggleGameModeButton.setOnAction(e->{
			
			if(toggleGameModeButton.getText().equalsIgnoreCase("Feature Finder")) {
				if (!root.getChildren().isEmpty()) {
					root.getChildren().removeAll(root.getChildren());
				}
				
				if(root.getChildren().isEmpty()) {
					toggleGameModeButton.setText("Learn Mode");
					root.getChildren().addAll(backGroundPane, iv, vBox, featureFinderGoButton);
				}
			}else if(toggleGameModeButton.getText().equalsIgnoreCase("Learn Mode")) {
				root.getChildren().add(hBox);
				root.getChildren().remove(featureFinderGoButton);
				toggleGameModeButton.setText("Feature Finder");
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
		System.out.println(timer);
	}

	/**
	 * render assets
	 */
	public void render() {
		// gc.setFill(Color.LIMEGREEN);
		// gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

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
