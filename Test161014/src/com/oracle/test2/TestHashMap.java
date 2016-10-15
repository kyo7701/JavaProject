package com.oracle.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
		
		//增
		Person p1 = new Person("zhangsan", 22, "123123");
		map1.put("zhangsan", p1);  //一次添加一个键值对
		
		Person p2 = new Person("lisi", 30, "321321");
		map1.put("lisi", p2);
		
		HashMap map2 = new HashMap();
		map2.putAll(map1);  //批量添加键值对
		
		map1.put("zhangsan", p1);
		
		map1.put("xiaoli", p2);
		System.out.println(map1.get("lisi"));  //在HashMap中，值是可以重复的
		
		//删
		map1.remove("xiaoli");
		System.out.println(map1.get("xiaoli"));  //凡是没找到这个键对应的值，返回null
		
//		map1.clear();  //删除所有的键值对
		
		//改
		Person p3 = new Person("wangwu", 40, "111111");
		map1.put("zhangsan", p3);  //在HashMap中键不可重复的，在添加键值对的时候见如果重复了，后来的值会替换原来这个键所对应的值
		
		System.out.println("----------");
		
		//查
		System.out.println(map1.get("zhangsan"));  //通过键找到值
		
		System.out.println("----------");
		
		//[1]想办法获取所有的键
		Set set = map1.keySet();
		
		//[2]通过循环遍历这个键的“集合”
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			System.out.println("key:" + key + " = value:" + map1.get(key));  //[3]可以通过get方法和每一个得到的键找到所有对应的值
		}
		
		System.out.println("----------");
		
		map1.put("xiaoli", p2);
		
		Collection c = map1.values();
		ite = c.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
}
