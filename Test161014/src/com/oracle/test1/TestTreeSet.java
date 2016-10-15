package com.oracle.test1;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		MyComparetor mc = new MyComparetor(); //����һ���̹٣��Ƚ�������
		
		//����ͬһ��TreeSet��˵�������������Ȼ�����ǿ��Լ��ݵģ����Ƕ�����������ȼ����ߣ�����Ȼ����Ͷ������������ͻ��ʱ�������������
		TreeSet set1 = new TreeSet(mc);
		
		set1.add(new Person("zhangsan", 22, "123456"));
		set1.add(new Person("lisi", 30, "654321"));
		set1.add(new Person("chenliu", 18, "666666"));
		set1.add(new Person("wangwu", 18, "555555"));
		
		/*
		 * TreeSet��Ԫ��Ҳ�����ظ�
		 * TreeSet���б�����Ԫ���Ƿ��ظ��ı�׼�Ѿ�����hashCode��equals����
		 * ��Ԫ��compareTo�����ķ���ֵ
		 * ����Ԫ�����compareTo��������0��TreeSet�ͻ�����������Ԫ���ǡ��ظ�����
		 */
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
}
