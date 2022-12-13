/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Rectangle.java
 * Purpose: Creates a triangular shape and inherits from the parent class: TwoDimensionalShape.
 */
public class Triangle extends TwoDimensionalShape {
	private float base;
	private float height;
	
	public Triangle(int numDim, float tempBase, float tempHeight) {
		super(numDim);
		this.base = tempBase;
		this.height = tempHeight;
	}
	
	public Triangle(float tempBase, float tempHeight) {
		super();
		this.base = tempBase;
		this.height = tempHeight;
	}
	
	public void setBase(float tempBase) {
		this.base = tempBase;
	}
	public void setHeight(float tempHeight) {
		this.height = tempHeight;
	}
	
	public float getBase() {
		return this.base;
	}
	public float getHeight() {
		return this.height;
	}
	
	public double CalculateArea() {
		return ((this.base / 2) * this.height);
	}
}
