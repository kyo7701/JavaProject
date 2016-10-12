package com.oracle.test5;

public interface TestInterface {
	
//	public TestInterface() {}
	
	//测试接口中属性的定义
	public static final String name = "haha";
	
	//测试接口中方法的定义
	public void m1();  //接口中的抽象方法不需要使用abstract关键字进行修饰
	
	/*
	 * 在接口中只能够定义抽象方法，不允许定义具体方法
	public void m2() {
		
	}
	*/
	
//	protected void m3();  //接口中抽象方法的访问权限，一定是public
	
//	public static void m4();  //接口中不允许声明静态方法
	
}
