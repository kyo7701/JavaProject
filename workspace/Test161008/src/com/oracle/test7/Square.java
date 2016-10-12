package com.oracle.test7;

public class Square extends Graph {
	
	private double a;
	
	public double calArea() {
		return Math.pow(a, 2);
	}
	
	public double calPerem() {
		return 4 * a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
}
