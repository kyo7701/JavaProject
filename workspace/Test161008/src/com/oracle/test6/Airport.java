package com.oracle.test6;

public class Airport {
	
	/*
	 * �����ࣺ�ǵ��Էɻ�������ҷɻ����ĸ���
	 */
	
	//���շ�װ��ԭ����������Ӧ��ʹ��private�ؼ������Σ�ʹ��get��set��������
	//���ռ̳���ԭ��������������Ҫ������̳У���Ҫʹ��public��������
	private int size = 10;
	private int[][] airportArray = new int[size][size];
	
	private int getDir() {  //��ȡ�ɻ�����ķ��������ڻ��ɻ��Ĺ��̷���������ʹ��private�������Σ��ص�۲��������м̳е����
		return 0;
	}
	
	public void paintFighter() {  //��һ��public���εķ����е���private���εķ�������������ܷ񱻱��������̳�
		getDir();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[][] getAirportArray() {
		return airportArray;
	}

	public void setAirportArray(int[][] airportArray) {
		this.airportArray = airportArray;
	}
	
}
