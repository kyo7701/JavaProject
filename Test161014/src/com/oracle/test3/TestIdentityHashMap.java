package com.oracle.test3;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class TestIdentityHashMap {
	
	public static void main(String[] args) {
		
		//IdentityHashMap在添加键值对的时候是按照==对两个键进行比较
		//只有两个键（对象）在严格符合==返回true的基础上，才会认为这两个键相同
		IdentityHashMap iMap = new IdentityHashMap();
		iMap.put(new String("abc"), new Object());
		iMap.put(new String("abc"), new Object());
		System.out.println(iMap.size());
		
		HashMap hMap = new HashMap();
		hMap.put(new String("abc"), new Object());
		hMap.put(new String("abc"), new Object());
		System.out.println(hMap.size());
		
	}
	
}
