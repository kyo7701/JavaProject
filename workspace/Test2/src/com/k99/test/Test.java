package com.k99.test;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		System.out.println("Բc�������:" + c.computeArea());
		System.out.println("Բc���ܳ���:" + c.computePerimeter());
		
		Rectangle r = new Rectangle(6);
		System.out.println("���ε������:" + r.computeArea());
		System.out.println("���ε��ܳ���:"+r.computePerimeter());
	}
}