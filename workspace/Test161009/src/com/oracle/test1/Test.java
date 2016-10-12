package com.oracle.test1;

import com.oracle.test2.ReturnType2;

public class Test {

	public static void main(String[] args) {

		//一个对象的本质（人）是学生，但是我们可以从大的角度，以人的身份对待这个对象
		Person p = new Student();
		
		System.out.println(p.field1);
		
		System.out.println("----------");
		
		System.out.println(Person.field2);
		System.out.println(Student.field2);
		System.out.println(p.field2);
		
		System.out.println("----------");
		
		Student s1 = new Student();
		Person p1 = s1;
		Student s2 = (Student) p1;
		System.out.println(s2.field1);
		System.out.println(s2.field2);
		
		System.out.println("----------");
		
		Person p2 = new Student();
		p2.eat();
//		p2.goSleep();
		
		System.out.println("----------");
		
		p2.fightDouDou();
		
		System.out.println("----------");
		
		ReturnType2 rt2 = p2.methodReturn();
		
		System.out.println("----------");
		
		p2.methodSuper();
		
		System.out.println("----------");
		
		//将父类的对象本体装在了一个子类的引用变量中
		Person p3 = new Person();
//		instanceof  //类型相关运算符  boolean obj instanceof type
//		Student s3 = (Student)p3;
		System.out.println(p3 instanceof Student);
		
		if(p3 instanceof Student) {
			Student s3 = (Student) p3;
		}
		
	}

}
