package com.oracle.test1;

import com.oracle.test2.ReturnType2;

public class Test {

	public static void main(String[] args) {

		//һ������ı��ʣ��ˣ���ѧ�����������ǿ��ԴӴ�ĽǶȣ����˵���ݶԴ��������
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
		
		//������Ķ�����װ����һ����������ñ�����
		Person p3 = new Person();
//		instanceof  //������������  boolean obj instanceof type
//		Student s3 = (Student)p3;
		System.out.println(p3 instanceof Student);
		
		if(p3 instanceof Student) {
			Student s3 = (Student) p3;
		}
		
	}

}
