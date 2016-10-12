package com.oracle.shape;

public class ShapeTest {
	public static void main(String []args){
		Circle c = new Circle(5.0);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		Square s = new Square(5);
		System.out.println(s.calculateArea());
		System.out.println(s.calculatePerimeter());
		
	}
}
