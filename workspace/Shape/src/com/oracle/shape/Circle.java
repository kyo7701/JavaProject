package com.oracle.shape;

public class Circle extends Graph{
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override 
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public double calculatePerimeter() {
		return radius * 2 * Math.PI;
	}
}
