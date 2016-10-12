package com.oracle.test3;

public class Test {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 22, "123456");
		System.out.println(p1);
		
		System.out.println("----------");
		
		Person p2 = new Person("lisi", 29, "654321");
		Person p3 = new Person("wangwu", 45, "654321");
		System.out.println(p2 == p3);  //两个引用变量之间直接使用==比较，比的是引用变量中存储的地址值
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		
		//想要比较两个对象的信息（属性），不能够通过==直接比
		//想要通过对象的属性进行比较，就应该使用equals方法（继承自Object）
		System.out.println(p2.equals(p3));  //通过调用equals方法比较两个对象的属性
		
		System.out.println("----------");
		//测试散列值
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("----------");
		
		Baby b1 = new Baby(0, 1);
		Baby b2 = new Baby(1, 0);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		System.out.println(b1.equals(b2));
		
		Baby b3 = new Baby(1, 0);
		
	}
	
}
