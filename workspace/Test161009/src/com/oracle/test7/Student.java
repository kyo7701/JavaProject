package com.oracle.test7;

public class Student extends Person implements Dancing, Swimming {
	
	@Override
	public void jiewu() {
		System.out.println("不要学赵四");
	}

	@Override
	public void ladingwu() {
		System.out.println("扭一扭，恰恰恰");
	}

	@Override
	public void baleiwu() {
		System.out.println("四小天鹅");
	}

	@Override
	public void yangyong() {
		System.out.println("躺着游");
	}

	@Override
	public void wayong() {
		System.out.println("趴着游");
	}

	@Override
	public void ziyouyong() {
		System.out.println("随便游");
	}

	@Override
	public void dieyong() {
		System.out.println("飞着游");
	}
	
}
