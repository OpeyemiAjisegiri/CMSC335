/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: TwoDimensionalShape.java
 * Purpose: Creates a two dimension shape and inherits from the parent class shape.
 */

public class TwoDimensionalShape extends Shape {
	private float area; 
	
	public TwoDimensionalShape(int numDim) {
		super(numDim);
		this.area = 0;
	}
	
	public TwoDimensionalShape() {
		super();
		this.area = 0;
	}
	
	public void setArea(float tempArea) {
		this.area = tempArea;
	}
	
	public float getArea() {
		return this.area;
	}
}
