/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Rectangle.java
 * Purpose: Creates a rectangular shape and inherits from the parent class: TwoDimensionalShape.
 */
public class Rectangle extends TwoDimensionalShape {
	private float width;
	private float length;
	
	public Rectangle(int numDim, float tempArea, float tempWidth, float tempLength) {
		super(numDim);
		this.length = tempLength;
		this.width = tempWidth;
	}
	
	public Rectangle(float tempWidth, float tempLength) {
		super();
		this.length = tempLength;
		this.width = tempWidth;
	}
	
	public void setLength(float tempLength) {
		this.length = tempLength;
	}
	public void setWidth(float tempWidth) {
		this.width = tempWidth;
	}
	
	public float getLength() {
		return this.length;
	}
	public float getWidth() {
		return this.width;
	}
	
	public double CalculateArea() {
		return this.width * this.length;
	}
}
