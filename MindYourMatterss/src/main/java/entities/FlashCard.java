package entities;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import utility.ImageLoader;

public class FlashCard extends GameObject {
	
	
	private String entitlement;
	private String feature;
	private ImageView iv;
	private ArrayList<String> benefits;
	private int numOfBenefits;
	private VBox vBox;
	private Label titleLabel;
	private Label featureLabel;
	
	
	/**
	 * Contrcutor with x and y as parameters
	 * @param x
	 * @param y
	 */
	public FlashCard(double x, double y, String entitlement, String feature, 
					int numOfBenefits, ArrayList<String> benefits) {
		super(x, y);
		this.entitlement = entitlement;
		this.feature = feature;
		this.numOfBenefits = numOfBenefits;
		this.benefits = benefits;
		init();
	}
	
	private void init() {
		this.img = ImageLoader.flashCard;
		iv = new ImageView(img);
		benefits = new ArrayList<>();
		vBox = new VBox();
			vBox.setId("flashcardbox");
			vBox.setTranslateX(x);
			vBox.setTranslateY(y);
			titleLabel = new Label(entitlement);
				titleLabel.setId("titleLabel");
			featureLabel = new Label(feature);
				featureLabel.setId("featureLabel");
			vBox.getChildren().addAll(titleLabel, featureLabel);
		
	}
	
	public VBox getCardBox() {
		return vBox;
	}

	@Override
	public void update(double timer) {
	
		
	}

	@Override
	public void render(GraphicsContext gc) {
		

		
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

	public ImageView getIv() {
		return iv;
	}

	public void setIv(ImageView iv) {
		this.iv = iv;
	}
	
	

}
