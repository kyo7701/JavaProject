package com.oracle.test1;

import java.util.Comparator;

public class MyComparetor implements Comparator {

	/**
	 * ����ʵ����Comparetor�ӿڵ��඼�ǱȽ�����
	 * �����ڽ̹�
	 * ͨ���Ƚ�������Զ����������ָ�������Խ��бȽϣ�����[��������]
	 * �ŵ㣺ͨ�����岻ͬ�����������̹٣�����ʵ�ֶ�ͬһ������в�ͬ���Ե�����ֻҪʹ�ò�ͬ��������������
	 * ȱ�㣺����Ҫ��������������������Ч���Ե�����Ȼ����
	 */
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		return p1.getAge() - p2.getAge();
	}

}
