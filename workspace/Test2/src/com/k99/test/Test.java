package com.k99.test;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		System.out.println("圆c的面积是:" + c.computeArea());
		System.out.println("圆c的周长是:" + c.computePerimeter());
		
		Rectangle r = new Rectangle(6);
		System.out.println("矩形的面积是:" + r.computeArea());
		System.out.println("矩形的周长是:"+r.computePerimeter());
	}
}
