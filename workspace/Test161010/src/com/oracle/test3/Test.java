package com.oracle.test3;

public class Test {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 22, "123456");
		System.out.println(p1);
		
		System.out.println("----------");
		
		Person p2 = new Person("lisi", 29, "654321");
		Person p3 = new Person("wangwu", 45, "654321");
		System.out.println(p2 == p3);  //�������ñ���֮��ֱ��ʹ��==�Ƚϣ��ȵ������ñ����д洢�ĵ�ֵַ
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		
		//��Ҫ�Ƚ������������Ϣ�����ԣ������ܹ�ͨ��==ֱ�ӱ�
		//��Ҫͨ����������Խ��бȽϣ���Ӧ��ʹ��equals�������̳���Object��
		System.out.println(p2.equals(p3));  //ͨ������equals�����Ƚ��������������
		
		System.out.println("----------");
		//����ɢ��ֵ
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("----------");
		
		Baby b1 = new Baby(0, 1);
		Baby b2 = new Baby(1, 0);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		System.out.println(b1.equals(b2));
		
		Baby b3 = new Baby(1, 0);
		
	}
	
}
