package utility;

import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

public class ImageLoader {
	
	public ImageLoader() {
		
	}
	
	
	public Image hillbackground = new Image(getClass().getResource("/images/HillBground.png").toExternalForm());
	public Image skybackground = new Image(getClass().getResource("/images/SkyBground.png").toExternalForm());
	public static Image uiBground = new Image(ImageLoader.class.getResource("/images/uiBground.png").toExternalForm());
	private Image clouds = new Image(getClass().getResource("/images/clouds.png").toExternalForm());
	public static Image flashCard = new Image(ImageLoader.class.getResource("/images/FlashCardScenePic.png").toExternalForm());
	
	public WritableImage cloud1 = new WritableImage(clouds.getPixelReader(), 500,0,200,200);
	public WritableImage cloud2 = new WritableImage(clouds.getPixelReader(), 770,0,400,225);
	
	public static Image c1 = new Image(ImageLoader.class.getResource("/images/c1.png").toExternalForm());



}
