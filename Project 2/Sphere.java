/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Sphere.java
 * Purpose: Creates an instance of a sphere shape that inherits from the parent class: ThreeDimensionalShape.
 */

public class Sphere extends ThreeDimensionalShape{
	private float radius;
	
	public Sphere(int numDim, float tempRadius) {
		super(numDim);
		this.radius = tempRadius;
	}
	
	public Sphere(float tempRadius) {
		super();
		this.radius = tempRadius;
	}
	
	public void setRadius(float tempRadius) {
		this.radius = tempRadius;
	}
	
	public float getRadius() {
		return this.radius;
	}

	public double CalculateVolume() {
		return ((4 / 3)* Math.PI * Math.pow(this.radius, 3));
	}
	
}
