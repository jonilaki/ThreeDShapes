package com.entities;

public class Cylinder {
	private static double Pi=Math.PI;
	private double  radius;
	 private double circumference;
	 private double height;
	 private double diameter;
	 private double volume;
	 private double surface;
	
	public Cylinder(double radius, double circumference, double height, double diameter, double volume,
			double surface) {
		super();
		this.radius = radius;
		this.circumference = circumference;
		this.height = height;
		this.diameter = diameter;
		this.volume = volume;
		this.surface = surface;
	}
	public Cylinder() {
		super();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calculateDiameter() {
		this.diameter=2*Math.sqrt(volume/(Pi*height));
		return diameter;
	}
	public double calculateCircumference() {
		this.circumference=2*this.radius*this.Pi*this.height;
		return circumference ;
	}
	public double calculateSurface() {
		this.surface=(2*Pi*radius*height)+2*Pi*Math.pow(radius, 2);
		return surface;
	}
	public double calculateVolume() {
		this.volume=Pi*height*Math.pow(radius, 2);
		return volume;
	}
}
