package com.oracle.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestEntry {
	
	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
		
		map1.put("zhangsan", new  Person("zhangsan", 22, "111111"));
		map1.put("lisi", new  Person("lisi", 30, "222222"));
		map1.put("wangwu", new  Person("wangwu", 21, "333333"));
		map1.put("chenliu", new  Person("chenliu", 60, "444444"));
		map1.put("wuqi", new  Person("wuqi", 18, "555555"));
		
		Set set = map1.entrySet();  //通过entrySet()方法获取所有内部类Entry的对象的Set集
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			HashMap.Entry entry = (Entry) ite.next();
			System.out.println(entry);
		}
		
	}
	
}
