package com.oracle.test8;

public class SuperClass {
	
	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}
	
	{
		System.out.println("���Ǹ���ķǾ�̬�����2");
	}
	
	{
		System.out.println("���Ǹ���ķǾ�̬�����1");
	}
	
	public SuperClass() {
		System.out.println("���Ǹ���Ĺ�����");
	}
	
}
