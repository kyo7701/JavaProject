package com.oracle.test4;

public class TestBST {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 22, "111111");
		
		BinarySortedTree bst = new BinarySortedTree(p1);
		System.out.println(bst.size());
		
		bst.add(new Person("lisi", 20, "222222"));
		System.out.println(bst.size());
		
		bst.add(new Person("wangwu", 30, "333333"));
		System.out.println(bst.size());
		
		bst.add(new Person("chenliu", 18, "444444"));
		System.out.println(bst.size());
		Object[] ObjectArray = bst.getOrder();
		for (Object obj:ObjectArray) {
			System.out.println(obj);
		}
		
	}
	
}
