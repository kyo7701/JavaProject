package com.oracle.test3;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 22, "123456");
//		System.out.println(p1.name);
//		System.out.println(p1.id);
		
		//在Person泪之外通过get方法取属性的值
		System.out.println(p1.getName());
		System.out.println(p1.getAge(false));
		System.out.println(p1.getId());
		
		p1.setName("李四", true);
		System.out.println(p1.getName());
		
		System.out.println(Person.eyeNumber);
		
	}
	
}
