/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Circle.java
 * Purpose: Creates a circle shape and inherits from the parent class: TwoDimensionalShape.
 */

public class Circle extends TwoDimensionalShape {
	private float radius;
	
	public Circle(int numDim, float rad) {
		super(numDim);
		this.radius = rad;
	}

	public Circle( float rad) {
		super();
		this.radius = rad;
	}
	
	public void setRadius(float rad) {
		this.radius = rad;
	}
	
	public float getRadius() {
		return this.radius;
	}
	
	public double CalculateArea() {
		return (Math.PI * Math.pow(this.radius,2));
	}

}
