package com.entities;

public class Cuboid {
	
	private double  height;
	private double  base;
	private double  length;
	 private double circumference;
	 private double diameter;
	 private double volume;
	 private double surface;
	
	public Cuboid(double height, double base, double length, double circumference, double diameter, double volume,
			double surface) {
		super();
		this.height = height;
		this.base = base;
		this.length = length;
		this.circumference = circumference;
		this.diameter = diameter;
		this.volume = volume;
		this.surface = surface;
	}
	public Cuboid() {
		super();
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	/*public double calculateDiameter() {
		this.diameter=2*this.radius;
		return diameter;
	}*/
	public double calculateCircumference() {
		this.circumference=4*(this.height+this.length+this.base);
		return circumference ;
	}
	public double calculateSurface() {
		this.surface=2*((length*base)+(base*height)+(height*length));
		return surface;
	}
	public double calculateVolume() {
		this.volume=length*height*base;
		return volume;
	}
}
