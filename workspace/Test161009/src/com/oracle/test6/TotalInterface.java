package com.oracle.test6;

public interface TotalInterface extends TestInterface1, TestInterface2, TestInterface3 {
	
	//接口继承其他接口，相当于得到了其他接口中全部的抽象方法
	
	public void m7();
	
}
