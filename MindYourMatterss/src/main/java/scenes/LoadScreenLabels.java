package scenes;

import java.awt.Toolkit;

import javafx.animation.RotateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class LoadScreenLabels {

	private double x = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private double y = -10;
	private double velocity;
	private Label label;
	private double rotateAmount;
	private double previousTime = 0;
	public int id = 0;
	public static int count = 0;

	LoadScreenLabels(String name) {
		initializeVariables(name);
		id = count;
		count++;

	}

	private void initializeVariables(String name) {
		this.velocity = 2.5;
		label = new Label(name);
		label.setRotate(-35);
		label.setId("moneyLabel");
		label.setTranslateX(x);
		label.setTranslateY(y);

	}

	public void slide(double timer) {
		x -= velocity + 1.8;
		if (y != 600) {
			y += velocity;
		}
		label.setTranslateX(x);
		label.setTranslateY(y);
		if (y >= 600) {
			rotateAmount = label.getRotate() - 3;
			label.setRotate(rotateAmount);
		}
		if (x < 500) {
			y += Math.cos(timer * velocity);
			x -= Math.cos(timer * velocity);
		}

	}

	public void update(double timer) {

		if (timer > (this.id + 5)) {
			slide(timer);

		}
		if (y > Toolkit.getDefaultToolkit().getScreenSize().getHeight()) {
			y = -10;
			x = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
			label.setRotate(-35);
		}

	}

	public void render(GraphicsContext gc) {

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

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

}
