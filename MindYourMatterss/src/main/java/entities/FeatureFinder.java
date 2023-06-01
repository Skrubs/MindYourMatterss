package entities;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class FeatureFinder {
	
	
	
	ArrayList<FlashCard> cardDeck;
	
	Button moneyButton;
	Button advancementButton;
	Button trainingButton;
	Button travelButton;
	Button educationButton;
	Button recreationButton;
	Button satisfactionButton;
	Button securityButton;
	
	HBox buttonBox;
	
	Pane rootContainer;
	
	public FeatureFinder(ArrayList<FlashCard> cardDeck) {
		this.cardDeck = cardDeck;
		init();
	}
	
	private void init() {
		
		//initialize all buttons for entitlements
		moneyButton = new Button("Money");
		advancementButton = new Button("Advancement");
		trainingButton = new Button("Training");
		travelButton = new Button("Travel");
		educationButton = new Button("Education");
		recreationButton = new Button("Recreation");
		satisfactionButton = new Button("Satisfaction");
		securityButton = new Button("Security");
		
		//initialize entitlement button container that will house all entitlement buttons - horizontal 
		buttonBox = new HBox();
		buttonBox.getChildren().addAll(moneyButton, advancementButton, 
							trainingButton, travelButton, educationButton,
							recreationButton, satisfactionButton, securityButton);
		
		//initialize root container that will hold all content for feature finder
		rootContainer = new Pane();
		
		
		
		
	}
	
	
	
	
	

}
