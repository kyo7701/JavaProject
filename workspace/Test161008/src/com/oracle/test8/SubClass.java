package com.oracle.test8;

public class SubClass extends SuperClass {
	
	private char field3;
	
	public SubClass() {
		System.out.println("This is sub class's constructor!");
	}
	
	public SubClass(char field3) {
		this.field3 = field3;
	}
	
	public SubClass(String field1, int field2, char field3) {
//		this(field3);
		super(field1, field2);  //ͨ��super�ؼ��ֵ��ø���Ĺ��췽����ͬ����Ҫ�����ڵ�һ��
	}
	
}
