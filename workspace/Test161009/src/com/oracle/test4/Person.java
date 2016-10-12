package com.oracle.test4;

public abstract class Person {
	
	private String name;
	
	//抽象类可以拥有自己的构造方法
	public Person() {}
	
	//抽象类的构造方法仅仅用来留给子类去调用
	public Person(String name) {
		this.name = name;
	}
	
	//因为在各个子类中对eat方法都有自己的执行过程，在父类Person中我们仅约定eat这个行为
	abstract public void eat();  //定义一个只有方法头没有方法体的方法——抽象方法
	
	public static void main(String[] args) {
		
		//因为抽象类中包含没有具体执行过程的抽象方法，为了避免调用到这样的抽象方法，规定抽象类不能用来new对象
//		Person p = new Person();
		
	}
	
}
