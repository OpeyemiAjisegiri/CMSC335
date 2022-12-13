/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Cube.java
 * Purpose: Creates an instance of a cube shape that inherits from the parent class: ThreeDimensionalShape.
 * Programming Assumption: A cube has three core sides: length, breath and height. The three of which are 
 *       equi-distance, hence the formula for the volume is the length of a side cubed.
 */

public class Cube extends ThreeDimensionalShape {
	private float length; 
	
	public Cube(int numDim, float tempLength) {
		super(numDim);
		this.length = tempLength;
	}
	
	public Cube(float tempLength) {
		super();
		this.length = tempLength;
	}
	
	public void setLength(float tempLength) {
		this.length = tempLength;
	}
	
	public float getLength() {
		return this.length;
	}

	public double CalculateVolume() {
		return Math.pow(this.length, 3);
	}

}
