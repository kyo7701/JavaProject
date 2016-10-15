package com.oracle.test3;

import java.util.WeakHashMap;

public class TestWeakHashMap {
	
	public static void main(String[] args) {
		
		//在使用弱引用对象作为WeakHashMap的键的时候，一旦运行了垃圾回收机制，WeakHashMap中所有以弱引用为键的键值对都会被删除
		WeakHashMap wMap = new WeakHashMap();
		wMap.put(new Object(), "aaa");
		wMap.put(new Object(), "bbb");
		System.out.println(wMap.size());
		
		System.gc();
		System.runFinalization();
		
		System.out.println(wMap.size());
	}
	
}
