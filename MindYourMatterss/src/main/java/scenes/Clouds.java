package scenes;

import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import utility.ImageLoader;

public class Clouds {

	private double x;
	private double y;
	private Image img;
	private double velocity;
	private Random gen;
	private ImageLoader imageLoader;

	public Clouds() {
		imageLoader = new ImageLoader();
		gen = new Random();
		velocity = gen.nextInt(3);
		int temp = gen.nextInt(2);
		if (temp == 0) {
			img = imageLoader.cloud1;
		} else if (temp == 1) {
			img = imageLoader.cloud2;
		} else {
			img = imageLoader.cloud1;
		}
		startingPosition();
	}

	public void startingPosition() {
		y = gen.nextInt(50);
		x = gen.nextInt(2560);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public Random getGen() {
		return gen;
	}

	public void setGen(Random gen) {
		this.gen = gen;
	}

	private void velSet() {
		if(velocity == 0) {
			velocity = 1;
		}
		
		this.x -= velocity;
	}

	public void update() {
		velSet();
		if (this.x < -400) {
			this.x = 2700;
		}
	}

	public void render(GraphicsContext gc) {
		gc.drawImage(img, x, y);
	}

}
