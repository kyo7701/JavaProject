package com.oracle.test4;

public abstract class Person {
	
	private String name;
	
	//���������ӵ���Լ��Ĺ��췽��
	public Person() {}
	
	//������Ĺ��췽������������������ȥ����
	public Person(String name) {
		this.name = name;
	}
	
	//��Ϊ�ڸ��������ж�eat���������Լ���ִ�й��̣��ڸ���Person�����ǽ�Լ��eat�����Ϊ
	abstract public void eat();  //����һ��ֻ�з���ͷû�з�����ķ����������󷽷�
	
	public static void main(String[] args) {
		
		//��Ϊ�������а���û�о���ִ�й��̵ĳ��󷽷���Ϊ�˱�����õ������ĳ��󷽷����涨�����಻������new����
//		Person p = new Person();
		
	}
	
}
