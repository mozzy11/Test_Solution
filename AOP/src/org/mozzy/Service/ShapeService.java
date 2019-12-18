package org.mozzy.Service;

import org.mozzy.Model.Circle;
import org.mozzy.Model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	
	public Triangle getTriangle() {
		return triangle;
	}
	//methods to save to db
	public void saveCircle(Circle circle) {
		this.circle = circle;
	}
	public void saveTriangle(Triangle triangle) {
		this.triangle = triangle;
	}	
}
