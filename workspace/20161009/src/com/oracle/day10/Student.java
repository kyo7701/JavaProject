package com.oracle.day10;

import com.oracle.test.Parameter2;
import com.oracle.test.ReturnType1;

public class Student extends Person {
	public Student(){
		System.out.println("----------子类--------------");
	}
	
	/*
	@Override
	public ReturnType3 eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("吃土");
		return null;
	}
	*/
	/*
	@Override
	public ReturnType2 eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("吃土");
		return null;
	}
	*/
	
	public ReturnType1 eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("吃土");
		return null;
	}
	
	@Override
	public void sleep(Parameter2 p1) {
		// TODO Auto-generated method stub
		super.sleep(p1);
	}
	
	
	
}
