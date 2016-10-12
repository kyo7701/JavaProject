package com.oracle.test7;

public class Circle extends Graph {
	
	private double r;
	
	public double calArea() {
		//PIr^2
		return Math.PI * Math.pow(r, 2);
	}
	
	public double calPerem() {
		//2PIr
		return Math.PI * r * 2;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
}
