/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Cylinder.java
 * Purpose: Creates a cylinder shape and inherits from the parent class: ThreeDimensionalShape.
 */

public class Cylinder extends ThreeDimensionalShape{
	private float height;
	private float radius;
	
	public Cylinder(int numDim, float tempRadius, float tempHeight) {
		super(numDim);
		this.radius = tempRadius;
		this.height = tempHeight;
	}
	
	public Cylinder(float tempRadius, float tempHeight) {
		super();
		this.radius = tempRadius;
		this.height = tempHeight;
	}
	
	public void setRadius(float tempRadius) {
		this.radius = tempRadius;
	}
	public void setHeight(float tempHeight) {
		this.height = tempHeight;
	}
	
	public float getRadius() {
		return this.radius;
	}
	public float getHeight() {
		return this.height;
	}
	
	public double CalculateVolume() {
		return (Math.PI * Math.pow(this.radius, 2) * this.height);
	}

}
