package com.oracle.test9;

public class TestInteger {
	
	public static void main(String[] args) {
		
		Integer I1 = new Integer("1000");  //ͨ���ַ�������Integer������ʱ�򣬴��ݵ��ַ���Ӧ�÷��������淶
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		int i1 = Integer.parseInt("123");
		System.out.println(i1);
		
		Integer I2 = 100;  //�Զ�����������Ӧ�Ļ����������ͳ����Զ���װ�ɰ�װ�����
		System.out.println(I2 * 3);  //�Զ�������Զ���ȡ��װ������д洢�Ļ����������͵ĳ���ֵ
		
	}
	
}
