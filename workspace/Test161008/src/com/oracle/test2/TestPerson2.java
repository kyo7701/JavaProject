package com.oracle.test2;

import com.oracle.test1.Person;

public class TestPerson2 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.age = 10;  //在跨包的情况下，不能够访问使用protected关键字修饰的属性
		
		p1.name = "zhangsan";
		
	}
	
}
