package com.entities;

public class Cube {
	
	private double  side;
	 private double circumference;
	 private double volume;
	 private double surface;
	
	public Cube(double side) {
		super();
		this.side = side;
	}
	public Cube() {
		super();
	}
	
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double calculateCircumference() {
		this.circumference=6*side;
		return circumference ;
	}
	public double calculateSurface() {
		this.surface=6*Math.pow(side, 2);
		return surface;
	}
	public double calculateVolume() {
		this.volume=Math.pow(side, 3);
		return volume;
	}
}
