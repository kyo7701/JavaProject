package com.oracle.test1;

import com.oracle.test2.ReturnType3;
import com.oracle.test3.*;

public class Student extends Person {
	
	//ѧ�����ȼ̳�������
	
	//�൱���ڴ˴��Ѿ�����һ�����Ը��������field1 = "aabbcc"
	public String field1 = "ccbbaa";  //�������ж���һ���ͼ̳��Ը���ͬ�������ԣ����岻ͬ��ֵ���᲻�Ḳ�Ǹ����ͬ�����Ե�ֵ��
	
	public static String field2 = "cba";
	
	@Override
	public void eat() {  //�������У���д�ĸ���ķ���
		System.out.println("ѧ���Զ���������Ӫ����");
	}
	
	public void goSleep() {
		System.out.println("ѧ��˯����ÿ��˯���Сʱ");
	}
	
	@Override
	public void fightDouDou() {
		System.out.println("ѧ���򶹶����������");
	}
	
	@Override
	public ReturnType3 methodReturn() {
		return null;
	}
	
	@Override
	public void methodParam(ParamType2 pt2) {
	}
	
	@Override
	public void methodSuper() {
		super.methodSuper();  //�������е��ø��෽��δ����д�Ĳ���
		System.out.println("�����еķ���");
	}
	
}
