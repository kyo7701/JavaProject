package com.oracle.test1;

public class Person {

	public String name;
	protected int age;
	private String ID;
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.ID = "123456";  //在本类中访问private修饰的属性是允许的
		
	}
	
}
