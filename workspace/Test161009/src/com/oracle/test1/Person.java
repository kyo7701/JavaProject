package com.oracle.test1;

import com.oracle.test2.ReturnType2;
import com.oracle.test3.ParamType1;
import com.oracle.test3.ParamType2;

public class Person {
	
	public String field1 = "aabbcc";  //在父类中定义一个能够直接被子类继承和调用的属性
	
	public static String field2 = "abc";  //在父类中定义的静态属性
	
	//在父类中定义一个能够被子类继承的方法
	public void eat() {
		System.out.println("人类吃饭，吃熟的！");
	}
	
	protected void fightDouDou() {  //在父类中定义一个受保护权限的方法，可以被子类继承，实验重写过程能否修改访问权限
		System.out.println("人类打豆豆，往死里打");
	}
	
	public ReturnType2 methodReturn() {  //实验父类中方法的返回值能否在重写的时候修改
		return null;
	}
	
	public void methodParam(ParamType2 pt2) {  //实验形参列表在继承关系中的上下浮动
		
	}
	
	public void methodSuper() {
		System.out.println("父类中的方法");
	}
	
}
