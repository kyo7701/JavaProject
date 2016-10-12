package com.oracle.test8;

public class SubClass extends SuperClass {
	
	static {
		System.out.println("这是子类的静态代码块");
	}
	
	{
		System.out.println("这是子类的非静态代码块");
	}
	
	public SubClass() {
		System.out.println("这是子类的构造方法");
	}
	
}
