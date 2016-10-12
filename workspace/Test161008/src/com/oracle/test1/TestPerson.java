package com.oracle.test1;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "张三";
		System.out.println(p1.name);
		
		p1.name = "李四";
		
		p1.age = 10;
		
//		p1.ID = "123456";  //在其他类中访问使用private修饰的属性是不允许的
		
	}
	
}
