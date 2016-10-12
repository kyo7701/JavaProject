package com.oracle.test2;

public class Test {
	
	public static void main(String[] args) {
		
//		Season s1 = new Season();  //ö���಻��ֱ��new����
		
		//����ö�����ʹ��
		//[1]��ȡö����Ķ���
		Season s1 = Season.Spring;  //ö����������ֱ��ͨ��ö����������
		
		Season s2 = Season.valueOf("Summer");  //ͨ��ö�������������ȡһ��ö�������
		System.out.println(s2.getDis());
		
		Season[] sArray = Season.values();  //����һ��ö���������еĶ��󣬰��ն���˳�򷵻�
		for(Season tmp : sArray) {
			System.out.println(tmp);
		}
		
		System.out.println(s1.name());  //���ص�ǰö�������Ķ���������String�ַ����ķ�ʽ��
		
		Season s3 = Season.Fall;
		Season s4 = Season.Winter;
		
		System.out.println(s1.compareTo(s2));  //�Ƚ�����ö�������Ķ���˳��ģ��൱�ڵ����ߺ��βεĶ���˳����м�������
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		
		System.out.println("----------");
		
		System.out.println(s1.ordinal());  //���ص���ö�������Ķ���˳�򣬴�0��ʼ
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
		
		System.out.println("----------");
		
		//����ʹ��ö���������Ϊswitch-case���б�����
		switch(s1) {
		case Spring:
			System.out.println("���꾪�������");
			break;
		case Summer:
			System.out.println("����â��������");
			break;
		case Fall:
			System.out.println("�ﴦ¶�ﺮ˪��");
			break;
		case Winter:
			System.out.println("��ѩѩ��С��");
			break;
		}
		
	}
	
}
