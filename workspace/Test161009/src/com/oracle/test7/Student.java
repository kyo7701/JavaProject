package com.oracle.test7;

public class Student extends Person implements Dancing, Swimming {
	
	@Override
	public void jiewu() {
		System.out.println("��Ҫѧ����");
	}

	@Override
	public void ladingwu() {
		System.out.println("ŤһŤ��ǡǡǡ");
	}

	@Override
	public void baleiwu() {
		System.out.println("��С���");
	}

	@Override
	public void yangyong() {
		System.out.println("������");
	}

	@Override
	public void wayong() {
		System.out.println("ſ����");
	}

	@Override
	public void ziyouyong() {
		System.out.println("�����");
	}

	@Override
	public void dieyong() {
		System.out.println("������");
	}
	
}
