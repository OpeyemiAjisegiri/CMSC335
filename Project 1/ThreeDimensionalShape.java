/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: ThreeDimensionalShape.java
 * Purpose: Creates a three dimensional shape and inherits from the parent class shape.
 */

public class ThreeDimensionalShape extends Shape {
	private float volume; 
	
	public ThreeDimensionalShape(int numDim) {
		super(numDim);
		this.volume = 0;
	}
	
	public ThreeDimensionalShape() {
		super();
		this.volume = 0;
	}
	
	public void setVolume(float tempVolume) {
		this.volume = tempVolume;
	}
	
	public float getVolume() {
		return this.volume;
	}
}
