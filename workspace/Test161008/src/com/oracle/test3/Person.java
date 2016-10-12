package com.oracle.test3;

public class Person {
	
	public static int eyeNumber = 2;
	
	private String name;
	private int age;
	private String id;
	
	public Person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//通过get方法取属性的值
	public String getName() {
		return this.name;
	}
	
	//通过set方法给属性赋值
	public void setName(String name, boolean isPolice) {  //这就是一个验证更改过程的set方法
		if(isPolice == true) {
			this.name = name;
		}else {
			System.out.println("没有权限");
		}
	}

	public int getAge(boolean isFriend) {  //一个具有验证的get方法
		if(isFriend == true) {
			return age;
		}else {
			return 600;
		}
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
