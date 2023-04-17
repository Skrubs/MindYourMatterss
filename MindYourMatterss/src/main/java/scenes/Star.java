package scenes;

import java.awt.Toolkit;

import javafx.scene.paint.Color;

public class Star {
	
	
	private double x;
	private double y;
	private double velX;
	private double velY;
	private Color c;
	private double size;
	
	
	public Star(double x, double y, double velX, double velY, Color c, double size) {
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
		this.c = c;
		this.size = size;
	}
	
	public void moveMent() {
		x += velX;
		y += velY;
		
		if(x < -1) {
			x = Toolkit.getDefaultToolkit().getScreenSize().getWidth() + 5;
		}
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


	public double getVelX() {
		return velX;
	}


	public void setVelX(double velX) {
		this.velX = velX;
	}


	public double getVelY() {
		return velY;
	}


	public void setVelY(double velY) {
		this.velY = velY;
	}


	public Color getC() {
		return c;
	}


	public void setC(Color c) {
		this.c = c;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}
	
	
	
	

}
