package com.oracle.test8;

public class TestBlock {
	
	public TestBlock() {
		System.out.println("����һ��������");
	}
	
	{  //�����һ�������Ĵ����
		System.out.println("����һ�������");
	}
	
	static {  //��̬�����
		System.out.println("����һ����̬�����");
	}
	
	public static void main(String[] args) {
		
		TestBlock t1 = new TestBlock();
		
		System.out.println("----------");
		
		TestBlock t2 = new TestBlock();
		
	}
	
}
