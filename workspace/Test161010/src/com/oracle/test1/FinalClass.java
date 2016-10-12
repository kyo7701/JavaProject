package com.oracle.test1;

public final class FinalClass {  //声明了一个最终类（不能被继的类）
	
	public final String name;
	
//	public FinalClass() {}  //可以通过构造方法对final修饰的属性进行赋初值的工作，但是要求每一个构造方法都要带着这个final属性的赋值过程
	
	public FinalClass(String name) {
		this.name = name;
	}
	
	public void m1() {}
	
	public static void main(String[] args) {
		
//		FinalClass.name = "hehe";  //凡是使用final修饰变量都不能被重新赋值
		
	}
	
}
