package com.oracle.test8;

public class SuperClass {
	
	private String field1;
	private int field2;
	
	public SuperClass() {
		System.out.println("This is super class's constructor!");
	}
	
	public SuperClass(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
}
