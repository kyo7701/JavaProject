package com.oracle.test3;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class TestIdentityHashMap {
	
	public static void main(String[] args) {
		
		//IdentityHashMap����Ӽ�ֵ�Ե�ʱ���ǰ���==�����������бȽ�
		//ֻ�����������������ϸ����==����true�Ļ����ϣ��Ż���Ϊ����������ͬ
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
