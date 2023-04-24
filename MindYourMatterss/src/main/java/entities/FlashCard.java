package entities;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class FlashCard extends GameObject {

	private String entitlement;
	private String feature;
	private ArrayList<String> benefits;
	private Pane pane;
	private Label entitlementLabel;
	private Label featureLabel;
	private ArrayList<Label> beneLabelList = new ArrayList<>();
	private int numOfBenefits;
	private VBox vBox;
	private HBox hBox;

	/**
	 * Constructor with x and y as parameters
	 * 
	 * @param x
	 * @param y
	 */
	public FlashCard(String entitlement, String feature, int numOfBenefits, ArrayList<String> benefits) {
		super(0, 0);
		this.entitlement = entitlement;
		this.feature = feature;
		this.benefits = benefits;
		this.numOfBenefits = numOfBenefits;
		init();
	}

	private void init() {
		pane = new Pane();
		pane.setId("cardPane");
		vBox = new VBox();
		vBox.setId("cardVBox");
		hBox = new HBox();
		hBox.setId("cardHBox");
		entitlementLabel = new Label(entitlement);
		entitlementLabel.setId("titleLabel");
		featureLabel = new Label(feature);
		featureLabel.setId("featureLabel");
		for (String s : benefits) {
			beneLabelList.add(new Label(s));
		}


		for (Label l : beneLabelList) {
			l.setId("beneLabel");
			hBox.getChildren().add(l);
		}

		vBox.getChildren().addAll(entitlementLabel, featureLabel);

		pane.getChildren().add(vBox);

	}

	public void answer(Group root) {
		
		if(!pane.getChildren().contains(hBox)) {
			pane.getChildren().add(hBox);
		}

		
	}
	
	public void removeAnswer() {
		if(pane.getChildren().contains(hBox)) {
			pane.getChildren().remove(hBox);
		}
	}
	

	/**
	 * unload the current card from the root in the flashcardscene
	 * 
	 * @param root
	 */
	public void unloadCard(Group root) {
		root.getChildren().remove(pane);
	}

	public String getEntitlement() {
		return entitlement;
	}

	public void setEntitlement(String entitlement) {
		this.entitlement = entitlement;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public ArrayList<String> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<String> benefits) {
		this.benefits = benefits;
	}

	public Pane getPane() {
		return pane;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public Label getEntitlementLabel() {
		return entitlementLabel;
	}

	public void setEntitlementLabel(Label entitlementLabel) {
		this.entitlementLabel = entitlementLabel;
	}

	public Label getFeatureLabel() {
		return featureLabel;
	}

	public void setFeatureLabel(Label featureLabel) {
		this.featureLabel = featureLabel;
	}

	public ArrayList<Label> getBeneLabelList() {
		return beneLabelList;
	}

	public void setBeneLabelList(ArrayList<Label> beneLabelList) {
		this.beneLabelList = beneLabelList;
	}

	public int getNumOfBenefits() {
		return numOfBenefits;
	}

	public void setNumOfBenefits(int numOfBenefits) {
		this.numOfBenefits = numOfBenefits;
	}

	@Override
	public void update(double timer) {

	}

	@Override
	public void render(GraphicsContext gc) {

	}

}
