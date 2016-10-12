package com.k99.test;

public class Circle extends Graphical {
	private double radius; //°ë¾¶
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	

	public double computePerimeter(){
		return Math.PI * 2 * radius;
	}
}
