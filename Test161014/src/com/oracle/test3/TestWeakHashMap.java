package com.oracle.test3;

import java.util.WeakHashMap;

public class TestWeakHashMap {
	
	public static void main(String[] args) {
		
		//��ʹ�������ö�����ΪWeakHashMap�ļ���ʱ��һ���������������ջ��ƣ�WeakHashMap��������������Ϊ���ļ�ֵ�Զ��ᱻɾ��
		WeakHashMap wMap = new WeakHashMap();
		wMap.put(new Object(), "aaa");
		wMap.put(new Object(), "bbb");
		System.out.println(wMap.size());
		
		System.gc();
		System.runFinalization();
		
		System.out.println(wMap.size());
	}
	
}
