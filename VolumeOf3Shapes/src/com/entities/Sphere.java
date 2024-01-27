package com.entities;

public class Sphere {
	private static double Pi=Math.PI;
	private double  radius;
	 private double circumference;
	 private double diameter;
	 private double volume;
	 private double surface;
	public Sphere(double radius,double diameter, double circumference, double volume, double surface) {
		
		this.radius = radius;
		this.diameter=diameter;
		this.circumference = circumference;
		this.volume = volume;
		this.surface = surface;
	}
	public Sphere() {
		super();
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
		this.surface=4*Pi*Math.pow(radius, 2);
		return surface;
	}
	public double calculateVolume() {
		this.volume=4/3*Pi*Math.pow(radius, 3);
		return volume;
	}
}
