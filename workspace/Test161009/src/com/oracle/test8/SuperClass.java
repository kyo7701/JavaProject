package com.oracle.test8;

public class SuperClass {
	
	static {
		System.out.println("这是父类的静态代码块");
	}
	
	{
		System.out.println("这是父类的非静态代码块2");
	}
	
	{
		System.out.println("这是父类的非静态代码块1");
	}
	
	public SuperClass() {
		System.out.println("这是父类的构造器");
	}
	
}
