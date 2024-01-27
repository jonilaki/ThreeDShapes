package com.entities;

public class Cone {
	private static double Pi=Math.PI;
	private double  radius;
	 private double circumference;
	 private double diameter;
	 private double volume;
	 private double surface;
	 private double height;
	 

	public Cone(double radius, double circumference, double diameter, double volume, double surface, double height) {
		
		this.radius = radius;
		this.circumference = circumference;
		this.diameter = diameter;
		this.volume = volume;
		this.surface = surface;
		this.height = height;
		
	}
	public Cone() {
		super();
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
		
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateDiameter() {
		this.diameter=2*this.radius;
		return diameter;
	}
	public double calculateCircumference() {
		this.circumference=2*this.radius*this.Pi;
		return circumference ;
	}
	public double calculateSurface() {
		this.surface=radius*Pi*(radius+(Math.sqrt(Math.pow(height, 2)+Math.pow(radius,2))));
		return surface;
	}
	public double calculateVolume() {
		this.volume=(height/3)*Pi*Math.pow(radius, 2);
		return volume;
	}
}
