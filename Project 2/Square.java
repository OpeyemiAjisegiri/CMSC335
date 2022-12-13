/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Square.java
 * Purpose: Creates a square shape and inherits from the parent class: TwoDimensionalShape.
 */

public class Square extends TwoDimensionalShape {
	private float length;
	
	public Square(int numDim, float tempLength) {
		super(numDim);
		this.length = tempLength;
	}
	
	public Square(float tempLength) {
		super();
		this.length = tempLength;
	}
	
	public void setLength(float tempLength) {
		this.length = tempLength;
	}

	public float getLength() {
		return this.length;
	}
	
	public double CalculateArea() {
		return Math.pow(this.length, 2);
	}
}
