package com.oracle.shape;

public class Square extends Graph {
	private int a;
	public Square(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public double calculateArea() {
		return Math.pow(a, 2);
	}
	
	@Override
	public double calculatePerimeter() {
		return a * 4.0;
	}
}
