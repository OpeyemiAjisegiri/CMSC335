/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Shape.java
 * Purpose: Creates the shapes super class to be inherited from by other classes(its Children).
 */
public class Shape {
	private int numberOfDimensions;
	
	public Shape() {
		this.numberOfDimensions = 0;
	}
	
	public Shape(int numOfDimension) {
		this.numberOfDimensions = numOfDimension;
	}
	
	public void setNumDimension(int numDim) {
		this.numberOfDimensions = numDim;
	}
	
	public int getNumDimension() {
		return this.numberOfDimensions;
	}
	
	
}
