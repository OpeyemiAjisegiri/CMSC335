/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Torus.java
 * Purpose: Creates an instance of a torus shape that inherits from the parent class: ThreeDimensionalShape.
 */

public class Torus extends ThreeDimensionalShape {
	private float innerRadius;
	private float outerRadius;
	
	public Torus(int numDim, float tempInner, float tempOuter) {
		super(numDim);
		this.innerRadius = tempInner;
		this.outerRadius = tempOuter;
	}
	
	public Torus(float tempInner, float tempOuter) {
		super();
		this.innerRadius = tempInner;
		this.outerRadius = tempOuter;
	}
	
	public void setInnerRadius(float tempInner) {
		this.innerRadius = tempInner;
	}

	public void setOuterRadius(float tempOuter) {
		this.outerRadius = tempOuter;
	}
	
	public float getInnerRadius() {
		return this.innerRadius;
	}
	
	public float getOuterRadius() {
		return this.outerRadius;
	}
	
	public double CalculateVolume() {
		return (2 * Math.pow(Math.PI, 2) * this.outerRadius * Math.pow(this.innerRadius, 2));
	}
}
