package com.oracle.test3;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 22, "123456");
//		System.out.println(p1.name);
//		System.out.println(p1.id);
		
		//��Person��֮��ͨ��get����ȡ���Ե�ֵ
		System.out.println(p1.getName());
		System.out.println(p1.getAge(false));
		System.out.println(p1.getId());
		
		p1.setName("����", true);
		System.out.println(p1.getName());
		
		System.out.println(Person.eyeNumber);
		
	}
	
}
