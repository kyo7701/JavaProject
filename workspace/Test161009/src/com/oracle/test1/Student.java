package com.oracle.test1;

import com.oracle.test2.ReturnType3;
import com.oracle.test3.*;

public class Student extends Person {
	
	//学生首先继承自人类
	
	//相当于在此处已经有了一个来自父类的属性field1 = "aabbcc"
	public String field1 = "ccbbaa";  //在子类中定义一个和继承自父类同名的属性，定义不同的值：会不会覆盖父类的同名属性的值？
	
	public static String field2 = "cba";
	
	@Override
	public void eat() {  //在子类中，重写的父类的方法
		System.out.println("学生吃东西，吃有营养的");
	}
	
	public void goSleep() {
		System.out.println("学生睡觉，每天睡足八小时");
	}
	
	@Override
	public void fightDouDou() {
		System.out.println("学生打豆豆，打个半死");
	}
	
	@Override
	public ReturnType3 methodReturn() {
		return null;
	}
	
	@Override
	public void methodParam(ParamType2 pt2) {
	}
	
	@Override
	public void methodSuper() {
		super.methodSuper();  //在子类中调用父类方法未被重写的部分
		System.out.println("子类中的方法");
	}
	
}
