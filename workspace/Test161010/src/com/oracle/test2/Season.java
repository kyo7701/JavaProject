package com.oracle.test2;

public enum Season {
	
	//枚举类的对象生命在枚举类当中
	Spring("春暖花开"),  //枚举类对象的声明，相当于直接调用new，对象与对象之间使用逗号隔开，最终使用分号隔开
	Summer("夏日炎炎"),  //枚举类的对象不允许使用修饰符修饰，相当于带有修饰符：public static final
	Fall("秋高气爽"),  //可以在声明枚举类对象的同时给枚举类对象的属性赋初值
	Winter("冬虫夏草");
	
	//给枚举类对象生命一些对象属性
	private String dis;  //给每一个季节写一个描述
	
	private Season(String dis) {  //枚举类通过私有化构造方法，达到禁止实例化对象的目的
		this.dis = dis;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}
	
}
