package com.oracle.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
		
		//��
		Person p1 = new Person("zhangsan", 22, "123123");
		map1.put("zhangsan", p1);  //һ�����һ����ֵ��
		
		Person p2 = new Person("lisi", 30, "321321");
		map1.put("lisi", p2);
		
		HashMap map2 = new HashMap();
		map2.putAll(map1);  //������Ӽ�ֵ��
		
		map1.put("zhangsan", p1);
		
		map1.put("xiaoli", p2);
		System.out.println(map1.get("lisi"));  //��HashMap�У�ֵ�ǿ����ظ���
		
		//ɾ
		map1.remove("xiaoli");
		System.out.println(map1.get("xiaoli"));  //����û�ҵ��������Ӧ��ֵ������null
		
//		map1.clear();  //ɾ�����еļ�ֵ��
		
		//��
		Person p3 = new Person("wangwu", 40, "111111");
		map1.put("zhangsan", p3);  //��HashMap�м������ظ��ģ�����Ӽ�ֵ�Ե�ʱ�������ظ��ˣ�������ֵ���滻ԭ�����������Ӧ��ֵ
		
		System.out.println("----------");
		
		//��
		System.out.println(map1.get("zhangsan"));  //ͨ�����ҵ�ֵ
		
		System.out.println("----------");
		
		//[1]��취��ȡ���еļ�
		Set set = map1.keySet();
		
		//[2]ͨ��ѭ������������ġ����ϡ�
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			System.out.println("key:" + key + " = value:" + map1.get(key));  //[3]����ͨ��get������ÿһ���õ��ļ��ҵ����ж�Ӧ��ֵ
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
