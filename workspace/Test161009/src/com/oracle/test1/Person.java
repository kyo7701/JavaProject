package com.oracle.test1;

import com.oracle.test2.ReturnType2;
import com.oracle.test3.ParamType1;
import com.oracle.test3.ParamType2;

public class Person {
	
	public String field1 = "aabbcc";  //�ڸ����ж���һ���ܹ�ֱ�ӱ�����̳к͵��õ�����
	
	public static String field2 = "abc";  //�ڸ����ж���ľ�̬����
	
	//�ڸ����ж���һ���ܹ�������̳еķ���
	public void eat() {
		System.out.println("����Է�������ģ�");
	}
	
	protected void fightDouDou() {  //�ڸ����ж���һ���ܱ���Ȩ�޵ķ��������Ա�����̳У�ʵ����д�����ܷ��޸ķ���Ȩ��
		System.out.println("����򶹶����������");
	}
	
	public ReturnType2 methodReturn() {  //ʵ�鸸���з����ķ���ֵ�ܷ�����д��ʱ���޸�
		return null;
	}
	
	public void methodParam(ParamType2 pt2) {  //ʵ���β��б��ڼ̳й�ϵ�е����¸���
		
	}
	
	public void methodSuper() {
		System.out.println("�����еķ���");
	}
	
}
