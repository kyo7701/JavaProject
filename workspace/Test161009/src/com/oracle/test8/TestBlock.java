package com.oracle.test8;

public class TestBlock {
	
	public TestBlock() {
		System.out.println("这是一个构造器");
	}
	
	{  //这就是一个独立的代码块
		System.out.println("这是一个代码块");
	}
	
	static {  //静态代码块
		System.out.println("这是一个静态代码块");
	}
	
	public static void main(String[] args) {
		
		TestBlock t1 = new TestBlock();
		
		System.out.println("----------");
		
		TestBlock t2 = new TestBlock();
		
	}
	
}
