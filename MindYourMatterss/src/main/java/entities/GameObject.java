package entities;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class GameObject {
	
	protected double x;
	protected double y;
	protected Image img;
	protected Rectangle2D bounds;
	
	public GameObject(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void update(double timer);
	public abstract void render(GraphicsContext gc);

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

	public Rectangle2D getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle2D bounds) {
		this.bounds = bounds;
	}
	
	
	
	

}
