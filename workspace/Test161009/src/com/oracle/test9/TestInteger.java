package com.oracle.test9;

public class TestInteger {
	
	public static void main(String[] args) {
		
		Integer I1 = new Integer("1000");  //通过字符串定义Integer类对象的时候，传递的字符串应该符合整数规范
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		int i1 = Integer.parseInt("123");
		System.out.println(i1);
		
		Integer I2 = 100;  //自动建包：将相应的基本数据类型常量自动封装成包装类对象
		System.out.println(I2 * 3);  //自动拆包：自动提取包装类对象中存储的基本数据类型的常量值
		
	}
	
}
