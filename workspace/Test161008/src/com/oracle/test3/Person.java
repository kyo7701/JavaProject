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
	
	//ͨ��get����ȡ���Ե�ֵ
	public String getName() {
		return this.name;
	}
	
	//ͨ��set���������Ը�ֵ
	public void setName(String name, boolean isPolice) {  //�����һ����֤���Ĺ��̵�set����
		if(isPolice == true) {
			this.name = name;
		}else {
			System.out.println("û��Ȩ��");
		}
	}

	public int getAge(boolean isFriend) {  //һ��������֤��get����
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
