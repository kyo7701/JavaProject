package com.oracle.test2;

public class Test {
	
	public static void main(String[] args) {
		
//		Season s1 = new Season();  //枚举类不能直接new对象
		
		//测试枚举类的使用
		//[1]获取枚举类的对象
		Season s1 = Season.Spring;  //枚举类对象可以直接通过枚举类名调用
		
		Season s2 = Season.valueOf("Summer");  //通过枚举类对象名来获取一个枚举类对象
		System.out.println(s2.getDis());
		
		Season[] sArray = Season.values();  //返回一个枚举类中所有的对象，按照定义顺序返回
		for(Season tmp : sArray) {
			System.out.println(tmp);
		}
		
		System.out.println(s1.name());  //返回当前枚举类对象的对象名（以String字符串的方式）
		
		Season s3 = Season.Fall;
		Season s4 = Season.Winter;
		
		System.out.println(s1.compareTo(s2));  //比较两个枚举类对象的定义顺序的，相当于调用者和形参的定义顺序进行减法运算
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		
		System.out.println("----------");
		
		System.out.println(s1.ordinal());  //返回的是枚举类对象的定义顺序，从0开始
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
		
		System.out.println("----------");
		
		//测试使用枚举类对象作为switch-case的判别条件
		switch(s1) {
		case Spring:
			System.out.println("春雨惊春清谷天");
			break;
		case Summer:
			System.out.println("夏满芒夏暑相连");
			break;
		case Fall:
			System.out.println("秋处露秋寒霜降");
			break;
		case Winter:
			System.out.println("冬雪雪冬小大寒");
			break;
		}
		
	}
	
}
